package com.myapps.vista_admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VA_USUARIOS")
public class VAUsuarioEntity {

	@Id
//	@SequenceGenerator(name = "SEQ_VA_USUARIOS_GENERATOR", sequenceName = "SEQ_VA_USUARIOS", allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VA_USUARIOS_GENERATOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private long idUsuario;
	@Column
	private String nombres;
	@Column
	private String apellidos;
	@Column
	private String nombreUsuario;
	@Column
	private String clave;
	@Column
	private boolean estado;

//	@ManyToOne
//	@JoinColumn(name = "ROL", referencedColumnName = "ID_ROL", nullable = false)
//	private VARolEntity rol;
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

//	public VARolEntity getRol() {
//		return rol;
//	}
//
//	public void setRol(VARolEntity rol) {
//		this.rol = rol;
//	}
//
//	@Override
//	public String toString() {
//		return "VAUsuarioEntity [idUsuario=" + idUsuario + ", nombres=" + nombres + ", apellidos=" + apellidos
//				+ ", nombreUsuario=" + nombreUsuario + ", clave=" + clave + ", estado=" + estado + ", rol=" + rol + "]";
//	}

}
