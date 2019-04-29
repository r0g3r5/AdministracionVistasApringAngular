package com.myapps.vista_admin.business;

import java.util.List;

import com.myapps.vista_admin.model.VAMenuEntity;

public interface MenuBusiness extends BusinessMaster<VAMenuEntity> {

	List<VAMenuEntity> getByRolAndAcceso(String rol);

}
