package com.myapps.vista_admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myapps.vista_admin.model.VARolEntity;

@Repository
public interface RolRepository extends JpaRepository<VARolEntity, Integer> {

	@Query("FROM VARolEntity r WHERE r.estado = true")
	List<VARolEntity> findByEstadoActivid();

}
