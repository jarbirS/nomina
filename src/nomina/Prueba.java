package nomina;

import java.sql.SQLException;

import conexion.Conexion;
import modelo.Empleado;
import modelo.EmpleadoDAO;

public class Prueba {
	
	public static void main(String[] args) {
		
		Conexion con= Conexion.getConexion();
		 
		
		String sql="INSERT INTO empleado (codigo,cedula,nombre,fechanacimiento,fechaingreso,fecharetiro)"
				+ " VALUES ('44444','1090504585','javier',0,0,0)";
		
		try {
			con.insert(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Empleado emp = new Empleado();
	    emp.setCodigo("22222");
	    emp.setCedula("1090548763");
	    emp.setNombre("jarbir");
	    emp.setFechaNacimiento("0-0-0");
	    emp.setFechaRetiro("0-0-0");
	    emp.setFechaIngreso("0-0-0");
	    
	    EmpleadoDAO ed = new EmpleadoDAO();
	    ed.registrar(emp);
	}
	
	

}

