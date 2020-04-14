package modelo;

import java.util.Date;

public class Liquidacion {

	private int id;
	private int codmodelo;
	private int numeroproceso;
	private int valor;
	private Date fecha;
	private Concepto codconcepto;
	private Empleado codigo;
	
	
	public Liquidacion() {
		
	}
	
	

	public Concepto getCodconcepto() {
		return codconcepto;
	}



	public void setCodconcepto(Concepto codconcepto) {
		this.codconcepto = codconcepto;
	}



	public Empleado getCodigo() {
		return codigo;
	}



	public void setCodigo(Empleado codigo) {
		this.codigo = codigo;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodmodelo() {
		return codmodelo;
	}

	public void setCodmodelo(int codmodelo) {
		this.codmodelo = codmodelo;
	}

	public int getNumeroproceso() {
		return numeroproceso;
	}

	public void setNumeroproceso(int numeroproceso) {
		this.numeroproceso = numeroproceso;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
