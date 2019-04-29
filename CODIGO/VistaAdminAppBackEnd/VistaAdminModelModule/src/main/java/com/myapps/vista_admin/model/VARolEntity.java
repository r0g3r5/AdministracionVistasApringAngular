package com.myapps.vista_admin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VA_ROLES")
public class VARolEntity implements Serializable{

	@Id
	@SequenceGenerator(name = "SEQ_VA_ROLES_GENERATOR", sequenceName = "SEQ_VA_ROLES", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_ROLES_GENERATOR")
	@Column(name = "ID_ROL")
	private int idRol;
	@Column
	private String nombre;
	@Column
	private boolean estado;
	@Column
	private String descripcion;
	@Column
	private boolean validaIp;
	@Column
	private boolean eliminar;

	public static VARolEntity getInstanceByEntity(VARolEntity entity) {
		VARolEntity rol = new VARolEntity();
		rol.setIdRol(entity.getIdRol());
		rol.setDescripcion(entity.getDescripcion());
		rol.setNombre(entity.getNombre());
		rol.setEliminar(entity.isEstado());
		rol.setEstado(entity.isEstado());
		rol.setValidaIp(entity.isValidaIp());
		return rol;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isValidaIp() {
		return validaIp;
	}

	public void setValidaIp(boolean validaIp) {
		this.validaIp = validaIp;
	}

	public boolean isEliminar() {
		return eliminar;
	}

	public void setEliminar(boolean eliminar) {
		this.eliminar = eliminar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + (eliminar ? 1231 : 1237);
		result = prime * result + (estado ? 1231 : 1237);
		result = prime * result + idRol;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (validaIp ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VARolEntity other = (VARolEntity) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (eliminar != other.eliminar)
			return false;
		if (estado != other.estado)
			return false;
		if (idRol != other.idRol)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (validaIp != other.validaIp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VARolEntity [idRol=" + idRol + ", nombre=" + nombre + ", estado=" + estado + ", descripcion="
				+ descripcion + ", validaIp=" + validaIp + ", eliminar=" + eliminar + "]";
	}

}
