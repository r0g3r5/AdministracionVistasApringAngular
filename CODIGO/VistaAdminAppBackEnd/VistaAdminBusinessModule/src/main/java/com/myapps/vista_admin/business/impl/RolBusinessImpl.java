package com.myapps.vista_admin.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapps.vista_admin.business.RolBusiness;
import com.myapps.vista_admin.model.VARolEntity;
import com.myapps.vista_admin.repository.AccesoRespository;
import com.myapps.vista_admin.repository.RolRepository;

@Service
//@Transactional(readOnly = true)
public class RolBusinessImpl implements RolBusiness {

	@Autowired
	private RolRepository rolRepository;
	@Autowired
	private AccesoRespository accesoRepository;

	@Override
	public VARolEntity getById(Integer id) {
		return rolRepository.findOne(id);
	}

	@Override
	public List<VARolEntity> getByAll() {
		// TODO Auto-generated method stub
		return rolRepository.findByNotDelete();
	}

	@Override
	public List<VARolEntity> getByNombre(String rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VARolEntity> getByAtribute(String rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long toRegister(VARolEntity model) {
		// TODO Auto-generated method stub
		VARolEntity rolRegistrado = rolRepository.save(model);
		return (long) (rolRegistrado != null ? rolRegistrado.getIdRol() : 0);
	}

	@Override
	public Long toUpdate(VARolEntity model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int remove(VARolEntity rol) {
		int res = 0;
//		VARolEntity rolUpdate = VARolEntity.getInstanceByEntity(rol);
//		rolUpdate.setEliminar(true);
		System.out.println(rol);
		try {
			rolRepository.save(rol);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("update ");
		res = 1;

		return res;
	}

}
