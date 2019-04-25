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
	private Integer idMenu;
	@Column
	private String etiqueta;
	@Column
	private Boolean estado;
	@Column
	private Integer orden;
	@Column
	private String icono;
	@OneToMany(mappedBy = "menu", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<VAFormularioEntity> formularios;

	public Integer getOrden() {
		return orden;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

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
