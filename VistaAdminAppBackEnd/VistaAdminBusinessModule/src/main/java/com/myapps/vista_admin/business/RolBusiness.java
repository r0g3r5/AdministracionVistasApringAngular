package com.myapps.vista_admin.business;

import java.util.List;

import com.myapps.vista_admin.model.VARolEntity;

public interface RolBusiness extends BusinessMaster<VARolEntity> {
	List<VARolEntity> getByNombre(String rol);
}
