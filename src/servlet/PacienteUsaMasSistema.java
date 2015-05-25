package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.ObtenerPacienteMasAtendidoWSProxy;

/**
 * Servlet implementation class PacienteUsaMasSistema
 */
public class PacienteUsaMasSistema extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PacienteUsaMasSistema() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ObtenerPacienteMasAtendidoWSProxy pma = new ObtenerPacienteMasAtendidoWSProxy();
		String inputString1 = request.getParameter("fecha1");
		String inputString2 = request.getParameter("fecha2");
		
		DateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date f1 = null;
		Date f2 = null;
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		try {
			f1 = (Date) inputFormat.parse(inputString1);
			DateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
			String outputString = outputFormat.format(f1);
			System.out.println(outputString);
			f1 = (Date) outputFormat.parse(outputString);
			
			c1.setTime(f1);

			f2 = (Date) inputFormat.parse(inputString2);

			outputString = outputFormat.format(f2);
			System.out.println(outputString);
			f2 = (Date) outputFormat.parse(outputString);
			
			c2.setTime(f2);

			System.out.println(f1);
			System.out.println(f2);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String pacientes = pma.pacienteMasAtendido(c1,c2);
		System.out.println(pacientes);
		
		
	}

}
