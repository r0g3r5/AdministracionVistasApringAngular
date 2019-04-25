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
@Table(name = "VA_ACCESOS")
public class VAAccesoEntity {

	@Id
	@SequenceGenerator(name = "SEQ_VA_ACCESOS_GENERATOR", sequenceName = "SEQ_VA_ACCESOS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_ACCESOS_GENERATOR")
	@Column(name = "ID_ACCESO")
	private Integer idAcceso;
	@ManyToOne
	@JoinColumn(name = "FORMULARIO", referencedColumnName = "ID_FORMULARIO", nullable = false)
	private VAFormularioEntity formulario;
	@ManyToOne
	@JoinColumn(name = "ROL", referencedColumnName = "ID_ROL", nullable = false)
	private VARolEntity rol;

	public Integer getIdAcceso() {
		return idAcceso;
	}

	public void setIdAcceso(Integer idAcceso) {
		this.idAcceso = idAcceso;
	}

	public VAFormularioEntity getFormulario() {
		return formulario;
	}

	public void setFormulario(VAFormularioEntity formulario) {
		this.formulario = formulario;
	}

	public VARolEntity getRol() {
		return rol;
	}

	public void setRol(VARolEntity rol) {
		this.rol = rol;
	}

}
