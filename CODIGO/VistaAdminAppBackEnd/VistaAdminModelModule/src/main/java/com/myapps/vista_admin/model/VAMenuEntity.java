package com.myapps.vista_admin.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VA_MENUS")
public class VAMenuEntity {

	@Id
//	@SequenceGenerator(name = "SEQ_VA_MENUS_GENERATOR", sequenceName = "SEQ_VA_MENUS", allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_MENUS_GENERATOR")
	@Column(name = "ID_MENU")
	private int idMenu;
	@Column
	private String etiqueta;
	@Column
	private boolean estado;
	@Column
	private int orden;
	@Column
	private String icono;
	@OneToMany(mappedBy = "menu", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<VAFormularioEntity> formularios;

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public List<VAFormularioEntity> getFormularios() {
		return formularios;
	}

	public void setFormularios(List<VAFormularioEntity> formularios) {
		this.formularios = formularios;
	}

	@Override
	public String toString() {
		return "AdminMenuEntity [idMenu=" + idMenu + ", etiqueta=" + etiqueta + ", estado=" + estado + "]";
	}

}
