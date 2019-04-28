package com.myapps.vista_admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "VA_FORMULARIOS")
public class VAFormularioEntity {

	@Id
//	@SequenceGenerator(name = "SEQ_VA_FORMULARIOS_GENERATOR", sequenceName = "SEQ_VA_FORMULARIOS", allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_FORMULARIOS_GENERATOR")
	@Column(name = "ID_FORMULARIO")
	private int idFormulario;
	@Column
	private String etiqueta;
	@Column
	private int nivel;
	@Column
	private String url;
	@Column
	private boolean estado;
	@Column
	private String icono;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "MENU", nullable = true, referencedColumnName = "ID_MENU")
	private VAMenuEntity menu;

	public int getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(int idFormulario) {
		this.idFormulario = idFormulario;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public VAMenuEntity getMenu() {
		return menu;
	}

	public void setMenu(VAMenuEntity menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "VAFormularioEntity [idFormulario=" + idFormulario + ", etiqueta=" + etiqueta + ", nivel=" + nivel
				+ ", url=" + url + ", estado=" + estado + ", menu=" + menu + "]";
	}

}
