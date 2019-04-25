package com.myapps.vista_admin.model.response;

public class MensajeResponse {

	private int codigo;
	private String estado;
	private String descripcion;

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

	public static MensajeResponse getInstance(int codigo, String estado, String descripcion) {
		MensajeResponse response = new MensajeResponse();
		response.setCodigo(codigo);
		response.setEstado(estado);
		response.setDescripcion(descripcion);
		return response;
	}

}
