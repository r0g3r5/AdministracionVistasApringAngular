package com.myapps.vista_admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VA_ROLES")
public class VARolEntity {

	@Id
	@SequenceGenerator(name = "SEQ_VA_ROLES_GENERATOR", sequenceName = "SEQ_VA_ROLES", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_ROLES_GENERATOR")
	private Integer idRol;
	@Column
	private String nombre;
	@Column
	private Boolean estado;
	@Column
	private String descripcion;
	@Column
	private Boolean validaIp;

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getValidaIp() {
		return validaIp;
	}

	public void setValidaIp(Boolean validaIp) {
		this.validaIp = validaIp;
	}

	@Override
	public String toString() {
		return "AdminRolEntity [idRol=" + idRol + ", nombre=" + nombre + ", estado=" + estado + ", descripcion="
				+ descripcion + ", validaIp=" + validaIp + "]";
	}

}
