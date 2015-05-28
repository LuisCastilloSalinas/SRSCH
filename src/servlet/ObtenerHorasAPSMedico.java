package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.BuscarHoraAPSPorMedicoProxy;

/**
 * Servlet implementation class ObtenerHorasAPSMedico
 */
public class ObtenerHorasAPSMedico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ObtenerHorasAPSMedico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BuscarHoraAPSPorMedicoProxy hrMed = new BuscarHoraAPSPorMedicoProxy();
		String opcion = request.getParameter("myselect");
		if(!opcion.equals("----")){
			int idMedico = Integer.parseInt(opcion);
		String horas=hrMed.obtenerHorasAPSPorMedico(idMedico);
		
		PrintWriter pw = response.getWriter();
		pw.print(horas);
		pw.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
