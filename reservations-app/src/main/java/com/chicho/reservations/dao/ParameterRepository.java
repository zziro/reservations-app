package com.chicho.reservations.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.chicho.reservations.domain.Parameter;

public interface ParameterRepository extends JpaRepository<Parameter, BigDecimal>, JpaSpecificationExecutor<Parameter> {

}
