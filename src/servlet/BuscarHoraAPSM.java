package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.BoxIdWSProxy;
import webservices.BuscarHoraAPSWSProxy;
import webservices.ObtenerPorcentajeOcupacionBoxWSProxy;

/**
 * Servlet implementation class BuscarHoraAPSM
 */
public class BuscarHoraAPSM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarHoraAPSM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BuscarHoraAPSWSProxy searchAPS = new BuscarHoraAPSWSProxy();
		String opcion = request.getParameter("myselect");
		if(!opcion.equals("----")){
			int idMedico = Integer.parseInt(opcion);
			String inputString1 = request.getParameter("fecha1");
			String inputString2 = request.getParameter("fecha2");
			DateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			
			DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			Date f1 = null;
			Date f2 = null;
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			try {
				f1 = (Date) inputFormat.parse(inputString1);
				f2 = (Date) inputFormat.parse(inputString2);
				String fecha1 = outputFormat.format(f1);
				f1 = (Date) outputFormat.parse(fecha1);
				c1.setTime(f1);
				String fecha2= outputFormat.format(f2);
				f2 = (Date) outputFormat.parse(fecha2);
				
				c2.setTime(f2);


			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String horasAPS = searchAPS.obtenerHoraAPS(idMedico, c1, c2);
			
			PrintWriter pw = response.getWriter();
			pw.print(horasAPS);
			pw.close();
			
		}
		else {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
