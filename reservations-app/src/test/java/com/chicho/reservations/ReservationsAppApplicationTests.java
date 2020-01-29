package com.chicho.reservations;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chicho.reservations.domain.Reservation;
import com.chicho.reservations.service.ReservationService;

@SpringBootTest
class ReservationsAppApplicationTests {

	@Autowired
	private ReservationService reservationService;

	@Test
	void contextLoads() {
	}

	@Test
	public void createReservation() {
		Reservation r = new Reservation();
		r.setReservationId(new BigDecimal(2));
		r.setReservationCode("R00002");
		reservationService.saveOrUpdateResevation(r);

	}

}
