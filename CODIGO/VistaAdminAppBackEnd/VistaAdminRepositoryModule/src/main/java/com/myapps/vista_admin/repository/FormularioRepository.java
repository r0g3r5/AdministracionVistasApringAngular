package com.myapps.vista_admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myapps.vista_admin.model.VAFormularioEntity;

@Repository
public interface FormularioRepository extends JpaRepository<VAFormularioEntity, Integer> {

	@Query("SELECT a.formulario FROM VAAccesoEntity a WHERE a.rol.nombre = :rol ORDER BY a.formulario.menu.orden")
	List<VAFormularioEntity> findByRol(@Param("rol") String rol);
}
