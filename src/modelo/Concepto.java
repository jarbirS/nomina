package modelo;

public class Concepto {

	private String codconcepto;
	private String descripcion;
	private int tipo;
	private Tercero codtercero;
	
	public Concepto() {
		
	}
	
	

	public Tercero getCodtercero() {
		return codtercero;
	}



	public void setCodtercero(Tercero codtercero) {
		this.codtercero = codtercero;
	}



	public String getCodconcepto() {
		return codconcepto;
	}

	public void setCodconcepto(String codconcepto) {
		this.codconcepto = codconcepto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
