package com.myapps.vista_admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VA_FORMULARIOS")
public class VAFormularioEntity {

	@Id
	@SequenceGenerator(name = "SEQ_VA_FORMULARIOS_GENERATOR", sequenceName = "SEQ_VA_FORMULARIOS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_FORMULARIOS_GENERATOR")
	private int idFormulario;
	@Column
	private String etiqueta;
	@Column
	private Integer nivel;
	@Column
	private String path;
	@Column
	private Boolean estado;

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

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public VAMenuEntity getMenu() {
		return menu;
	}

	public void setMenu(VAMenuEntity menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "AdminFormularioEntity [idFormulario=" + idFormulario + ", etiqueta=" + etiqueta + ", nivel=" + nivel
				+ ", path=" + path + ", estado=" + estado + "]";
	}

}
