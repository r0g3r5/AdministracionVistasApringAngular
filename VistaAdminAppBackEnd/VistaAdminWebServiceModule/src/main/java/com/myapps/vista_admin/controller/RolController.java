package com.myapps.vista_admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapps.vista_admin.business.RolBusiness;
import com.myapps.vista_admin.model.VARolEntity;

@RestController
@RequestMapping("/roles")
public class RolController {

	@Autowired
	private RolBusiness rolBusiness;

	@GetMapping(value = "/searchByEstadoActived", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<VARolEntity>> searchByEstadoActived() {
		return new ResponseEntity<>(rolBusiness.getByAll(), HttpStatus.OK);
	}
}
