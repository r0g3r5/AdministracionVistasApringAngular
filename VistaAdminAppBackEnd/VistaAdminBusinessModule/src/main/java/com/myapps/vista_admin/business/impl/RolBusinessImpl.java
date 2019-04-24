package com.myapps.vista_admin.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapps.vista_admin.business.RolBusiness;
import com.myapps.vista_admin.model.VARolEntity;
import com.myapps.vista_admin.repository.RolRepository;

@Service
public class RolBusinessImpl implements RolBusiness {

	@Autowired
	private RolRepository rolRepository;

	@Override
	public VARolEntity getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VARolEntity> getByAll() {
		// TODO Auto-generated method stub
		return rolRepository.findByEstadoActivid();
	}

	@Override
	public List<VARolEntity> getByRol(String rol) {
		// TODO Auto-generated method stub
		return null;
	}

}
