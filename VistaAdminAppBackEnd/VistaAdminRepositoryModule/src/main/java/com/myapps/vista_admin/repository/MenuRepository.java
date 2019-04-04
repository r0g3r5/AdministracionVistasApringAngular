package com.myapps.vista_admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapps.vista_admin.model.VAMenuEntity;

@Repository
public interface MenuRepository extends JpaRepository<VAMenuEntity, Integer> {

}
