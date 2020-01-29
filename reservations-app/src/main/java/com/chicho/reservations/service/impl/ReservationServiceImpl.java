package com.chicho.reservations.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chicho.reservations.dao.ReservationRepository;
import com.chicho.reservations.domain.Reservation;
import com.chicho.reservations.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public void saveOrUpdateResevation(Reservation reservation) {
		if (reservation.getReservationCode() != null) {
			// udpate reservation
		} else {
			// create new reservation
			reservationRepository.save(reservation);
		}

	}

	@Override
	public Reservation getReservation(BigDecimal machineId, String pin) {

		return reservationRepository.gerReservation(machineId, pin);
	}

	@Override
	public void cancelReservation(String reservatonCode) {
		Reservation reservationToUpdate = new Reservation();
		reservationToUpdate.setReservationCode(reservatonCode);
		reservationRepository.delete(reservationToUpdate);

	}

}
