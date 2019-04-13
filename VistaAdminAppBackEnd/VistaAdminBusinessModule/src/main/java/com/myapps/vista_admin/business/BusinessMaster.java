package com.myapps.vista_admin.business;

import java.util.List;

public interface BusinessMaster<T> {

	T getById(Integer id);

	List<T> getByAll();

	List<T> getByRol(String rol);
}
