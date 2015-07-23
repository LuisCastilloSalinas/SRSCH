package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.ReservarHoraAPSWSProxy;

/**
 * Servlet implementation class ReservarHoraAPS
 */
public class ReservarHoraAPS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservarHoraAPS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReservarHoraAPSWSProxy res = new ReservarHoraAPSWSProxy();
		String fecha = request.getParameter("selectFecha");
		String paciente= request.getParameter("selectPaciente");
		
		if(!fecha.equals("----")&&!paciente.equals("----")){
			int idPaciente = Integer.parseInt(paciente);
			int idHoraMedicaAPS = Integer.parseInt(fecha);
			String numR=res.reservarHoraAPS(idHoraMedicaAPS, idPaciente);
			
			String out ="";
			out+="<div>";
			out+="numero reserva "+numR;
			out+="</div>";
			request.setAttribute("reserva", out);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/reservarHoraAps.jsp");
			dispatcher.forward(request,response);
	
		}
	}

}
