package com.myapps.vista_admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myapps.vista_admin.model.VAMenuEntity;

@Repository
public interface MenuRepository extends JpaRepository<VAMenuEntity, Integer> {

	@Query("SELECT a.formulario.menu FROM VAAccesoEntity a WHERE a.rol.nombre = :rol ORDER BY a.formulario.menu.orden")
	List<VAMenuEntity> findByRol(@Param("rol") String rol);
}
