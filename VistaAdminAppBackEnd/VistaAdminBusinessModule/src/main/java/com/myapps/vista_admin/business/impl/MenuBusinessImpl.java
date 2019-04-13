package com.myapps.vista_admin.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapps.vista_admin.business.MenuBusiness;
import com.myapps.vista_admin.model.VAFormularioEntity;
import com.myapps.vista_admin.model.VAMenuEntity;
import com.myapps.vista_admin.repository.FormularioRepository;
import com.myapps.vista_admin.repository.MenuRepository;

@Service
public class MenuBusinessImpl implements MenuBusiness {

	@Autowired
	private MenuRepository menuRepository;
	@Autowired
	private FormularioRepository formRepository;

	@Override
	public VAMenuEntity getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VAMenuEntity> getByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VAMenuEntity> getByRol(String rol) {
		List<VAFormularioEntity> formularios = formRepository.findByRol(rol);
		List<VAMenuEntity> menu = getMenuOfFormulario(formularios);
		menu.forEach(m-> System.out::print(""));
		return menuRepository.findByRol(rol);
	}

	public List<VAMenuEntity> getMenuOfFormulario(List<VAFormularioEntity> formularios) {
		List<VAMenuEntity> menus = new ArrayList<>();
		for (VAFormularioEntity form : formularios) {
			if (menus.size() > 0) {
				int validador = 0;
				for (VAMenuEntity menu : menus) {
					if (menu.getIdMenu() == form.getMenu().getIdMenu()) {
						validador++;
						break;
					}
				}
				if (validador <= 0)
					menus.add(form.getMenu());
				validador = 0;
			}
		}
		return menus;
	}

}
