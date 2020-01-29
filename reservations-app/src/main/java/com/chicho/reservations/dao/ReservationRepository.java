package com.chicho.reservations.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.chicho.reservations.domain.Reservation;

public interface ReservationRepository
		extends JpaRepository<Reservation, BigDecimal>, JpaSpecificationExecutor<Reservation> {

	@Query("select r from Reservation r where r.parametersCode = :machineId and r.pin = :PIN")
	Reservation gerReservation(BigDecimal machineId, String PIN);

}
