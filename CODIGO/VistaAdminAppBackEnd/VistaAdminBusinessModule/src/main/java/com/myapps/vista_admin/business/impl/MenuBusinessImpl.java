package com.myapps.vista_admin.business.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
		return menuRepository.findAll();
	}

	public List<VAMenuEntity> obtenerMunusDeFormularioList(List<VAFormularioEntity> formularios) {
		List<VAMenuEntity> menus = new ArrayList<>();
		formularios.forEach(f -> {
			if (!menus.contains(f.getMenu()))
				menus.add(f.getMenu());
		});
//		removeMenu(menus, menus.get(0));
		return menus;
	}

	public void removeMenu(List<VAMenuEntity> menus, VAMenuEntity menu) {
		System.out.println("nemus removidos init " + menus);
		menus.remove(menu);
		System.out.println("nemus removidos " + menus);
	}

	public List<VAMenuEntity> cambiarOrdenarFormularioLisDeMenu(List<VAMenuEntity> menus,
			List<VAFormularioEntity> formularios) {
		for (VAMenuEntity menu : menus) {
			menu.getFormularios().clear();
			for (VAFormularioEntity form : formularios) {
				if (menu.getIdMenu() == form.getMenu().getIdMenu())
					menu.getFormularios().add(form);
			}
			menu.setFormularios(menu.getFormularios().stream()
					.sorted(Comparator.comparing(VAFormularioEntity::getIdFormulario)).collect(Collectors.toList()));
		}
		return menus;
	}

	@Override
	public List<VAMenuEntity> getByAtribute(String rol) {
		List<VAFormularioEntity> formularios = formRepository.findByRol(rol);
		List<VAMenuEntity> menu = obtenerMunusDeFormularioList(formularios);
		return cambiarOrdenarFormularioLisDeMenu(menu, formularios);
	}

	@Override
	public List<VAMenuEntity> getByRolAndAcceso(String rol) {
		List<VAMenuEntity> menu = getByAll();
		System.out.println("sdfsdfsdfsdfsdfsdfd"+menu.size());
		return menu;
	}

	@Override
	public Long toRegister(VAMenuEntity model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long toUpdate(VAMenuEntity model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int remove(VAMenuEntity id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
