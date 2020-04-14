package modelo;



public class Empleado {
	
private String codigo;
private String cedula;
private String nombre;
private String fechaNacimiento;
private String fechaIngreso;
private String fechaRetiro;

public Empleado() {
	
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(String fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

public String getFechaIngreso() {
	return fechaIngreso;
}

public void setFechaIngreso(String fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}

public String getFechaRetiro() {
	return fechaRetiro;
}

public void setFechaRetiro(String fechaRetiro) {
	this.fechaRetiro = fechaRetiro;
}


}
