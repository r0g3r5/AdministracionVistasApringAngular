package com.myapps.vista_admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapps.vista_admin.business.MenuBusiness;
import com.myapps.vista_admin.model.VAMenuEntity;

@RestController
@RequestMapping("/menus")
public class MenuController {
	@Autowired
	private MenuBusiness menuBusiness;

	@GetMapping(value = "/listByRol")
	public ResponseEntity<List<VAMenuEntity>> listByRol(@RequestParam("rol") String rol) {
		return new ResponseEntity<>(menuBusiness.getByAtribute(rol), HttpStatus.OK);
	}

	@GetMapping(value = "/listByRolAndAcces")
	public ResponseEntity<List<VAMenuEntity>> listByRolAndAcces(@RequestParam("rol") String rol) {
		return new ResponseEntity<>(menuBusiness.getByRolAndAcceso(rol), HttpStatus.OK);
	}
}
