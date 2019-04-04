package com.myapps.vista_admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VA_MENUS")
public class VAMenuEntity {

	@Id
	@SequenceGenerator(name = "SEQ_VA_MENUS_GENERATOR", sequenceName = "SEQ_VA_MENUS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_MENUS_GENERATOR")
	private Integer idMenu;
	@Column
	private String etiqueta;
	@Column
	private Boolean estado;

	public Integer getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "AdminMenuEntity [idMenu=" + idMenu + ", etiqueta=" + etiqueta + ", estado=" + estado + "]";
	}

}
