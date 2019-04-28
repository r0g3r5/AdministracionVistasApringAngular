package com.ticcruz.vista_admin.commons;

public enum TextResponse {
	
	REPOSE_OK(200,"OK","Satisfactorio");
	
	private int codigo;
	private String estado;
	private String descripcion;
	
	private TextResponse(int codigo, String estado, String descripcion) {
		this.codigo = codigo;
		this.estado = estado;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
