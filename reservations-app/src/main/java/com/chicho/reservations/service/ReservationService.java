package com.chicho.reservations.service;

import java.math.BigDecimal;

import com.chicho.reservations.domain.Reservation;

public interface ReservationService {

	void saveOrUpdateResevation(Reservation reservation);

	Reservation getReservation(BigDecimal machineId, String pin);

	void cancelReservation(String reservatonCode);

}
