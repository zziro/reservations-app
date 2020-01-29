package com.chicho.reservations.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chicho.reservations.dao.ParameterRepository;
import com.chicho.reservations.domain.Parameter;
import com.chicho.reservations.service.ParameterService;

@Service
public class ParameterServiceImpl implements ParameterService {

	@Autowired
	private ParameterRepository parameterRepository;

	@Override
	public List<Parameter> findMachines() {
		return parameterRepository.findAll();
	}

}
