package com.myapps.vista_admin.business;

import java.util.List;

public interface Business<T> {

	T getById(Integer id);

	List<T> getByAll();
}
