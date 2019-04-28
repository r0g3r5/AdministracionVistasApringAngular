package com.myapps.vista_admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapps.vista_admin.business.RolBusiness;
import com.myapps.vista_admin.model.VARolEntity;
import com.myapps.vista_admin.model.response.MensajeResponse;

@RestController
@RequestMapping("/roles")
public class RolController {

	@Autowired
	private RolBusiness rolBusiness;

	@GetMapping(value = "/searchById", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VARolEntity> searchById(@RequestParam("idRol") int idRol) {
		return new ResponseEntity<>(rolBusiness.getById(idRol), HttpStatus.OK);
	}

	@DeleteMapping(value = "/borrar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> borrar(@RequestParam("idRol") long idRol) {
		return new ResponseEntity<>(rolBusiness.remove(idRol), HttpStatus.OK);
	}

	@GetMapping(value = "/searchByEstadoActived", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<VARolEntity>> searchByEstadoActived() {
		return new ResponseEntity<>(rolBusiness.getByAll(), HttpStatus.OK);
	}

	@PostMapping(value = "/guardar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MensajeResponse> guardar(@RequestBody VARolEntity rol) {
		return new ResponseEntity<MensajeResponse>(
				rolBusiness.toRegister(rol) > 0 ? MensajeResponse.getInstance(200, "OK", "OK")
						: MensajeResponse.getInstance(200, "ERROR", "ERROR"),
				HttpStatus.OK);
	}
}
