package com.myapps.vista_admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myapps.vista_admin.model.VARolEntity;

@Repository
public interface RolRepository extends JpaRepository<VARolEntity, Integer> {

	@Query("FROM VARolEntity r WHERE r.eliminar = false")
	List<VARolEntity> findByNotDelete();

	List<VARolEntity> findByNombre(@Param("nombre") String nombreRol);
	
	@Transactional
	@Modifying
	@Query("UPDATE VARolEntity r SET r.eliminar = :eliminar WHERE r.idRol = :idRol")
	int deleteById(@Param("idRol") Integer idRol, @Param("eliminar") boolean eliminar) throws Exception;

	@Modifying
	@Query("DELETE FROM VARolEntity r WHERE r.idRol = :idRol")
	int delete1(@Param("idRol") Integer idRol) throws Exception;
}
