package com.chicho.reservations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chicho.reservations.domain.Parameter;
import com.chicho.reservations.service.ParameterService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
	
	@Autowired
	private ParameterService parameterService;

	@CrossOrigin(origins = "*")
	@GetMapping("/machines")
	public List<Parameter> find() {
		return parameterService.findMachines();
	}
}
