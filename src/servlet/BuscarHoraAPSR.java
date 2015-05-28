package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.BuscarHoraAPSPorRangoProxy;

/**
 * Servlet implementation class BuscarHoraAPSR
 */
public class BuscarHoraAPSR extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarHoraAPSR() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BuscarHoraAPSPorRangoProxy searchRango = new BuscarHoraAPSPorRangoProxy();
		
		String inputString1 = request.getParameter("fecha1");
		String inputString2 = request.getParameter("fecha2");
		
		DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date f1 = null;
		Date f2 = null;
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		try {
			f1 = (Date) inputFormat.parse(inputString1);
			c1.setTime(f1);
			f2 = (Date) inputFormat.parse(inputString2);

			c2.setTime(f2);


		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String horasMedicas="";
		if(c1!=null && c2!=null)
		horasMedicas=searchRango.obtenerHoraAPSPorRango(c1, c2);
		
		System.out.println(horasMedicas);
		PrintWriter pw = response.getWriter();
		pw.print(horasMedicas);
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
