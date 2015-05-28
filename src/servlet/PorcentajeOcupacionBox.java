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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.BoxIdWSProxy;
import webservices.ObtenerPorcentajeOcupacionBoxWSProxy;

/**
 * Servlet implementation class PorcentajeOcupacionBox
 */
@WebServlet("/PorcentajeOcupacionBox")
public class PorcentajeOcupacionBox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PorcentajeOcupacionBox() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ObtenerPorcentajeOcupacionBoxWSProxy pBox = new ObtenerPorcentajeOcupacionBoxWSProxy();
		String opcion = request.getParameter("myselect");
		if(!opcion.equals("----")){
			int idBox = Integer.parseInt(opcion);
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

			int porcentaje=pBox.obtenerPorcentajeOcupacionBox(idBox, c1, c2);
			System.out.println(porcentaje);
			BoxIdWSProxy b = new BoxIdWSProxy();
			String descripcion =b.obtenerNombreBoxPorId(idBox);
			String out ="";
			out+="<table class='table' border='4' >";
			out+="<th>";
			out+=" Box ";
			out+="</th>";
			out+="<th>";
			out+=" Porcentaje ocupación % ";
			out+="</th>";
			out+="<tr>";
			out+="<td>";
			out+=descripcion;
			out+="</td>";
			out+="<td class='text-center'>";
			out+=porcentaje;
			out+="</td>";
			out+="</tr>";
			out+="</table>";
			request.setAttribute("porcentaje", out);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/obtenerPorcentajeBox.jsp");
			dispatcher.forward(request,response);

			
			
		}
		else {
			
		}
				
	}

}
