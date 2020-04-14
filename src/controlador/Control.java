package controlador;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.security.MD5Encoder;

import modelo.Empleado;
import modelo.EmpleadoDAO;

/**
 * Servlet implementation class Parametros
 */
@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Control() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String codigo = request.getParameter("codigo");
		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
		String fechaN = request.getParameter("fechaNacimiento");
		String fechaI = request.getParameter("fechaIngreso");
		String fechaR = request.getParameter("fechaRetiro");

		Empleado e = new Empleado();

		e.setCodigo(codigo);
		e.setCedula(cedula);
		e.setNombre(nombre);
		e.setFechaNacimiento(fechaN);
		e.setFechaIngreso(fechaI);
		e.setFechaRetiro(fechaR);

		EmpleadoDAO ed = new EmpleadoDAO();

		if (ed.registrar(e)) {

			String site = new String("http://localhost:8080/Nomina/index.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);

		} else {

			String site = new String("http://localhost:8080/Nomina/registrar.jsp");
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);

		}

	}

}