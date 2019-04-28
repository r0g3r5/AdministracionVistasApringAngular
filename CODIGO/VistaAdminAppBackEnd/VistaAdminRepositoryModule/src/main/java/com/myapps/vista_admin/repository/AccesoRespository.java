package com.myapps.vista_admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.myapps.vista_admin.model.VAAccesoEntity;

@Repository
public interface AccesoRespository extends JpaRepository<VAAccesoEntity, Integer> {

//	@Query("FROM VAAccesoEntity a WHERE a.rol.idRol = :idRol")
//	List<VAAccesoEntity> findByRol(@Param("idRol") Integer idRol);

}
