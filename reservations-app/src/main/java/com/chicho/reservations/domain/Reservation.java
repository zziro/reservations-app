package com.chicho.reservations.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation", schema = "public")
public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6111021892048154306L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservation_id", unique = true, nullable = false)
	private BigDecimal reservationId;
	@Column(name = "reservation_code")
	private String reservationCode;
	@Column(name = "date_of_reservation")
	private LocalDate dataOfReservation;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "pin")
	private String pin;
	@Column(name = "email_address")
	private String emailAddress;
	@Column(name = "parameters_code")
	private String parametersCode;

	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getReservationId() {
		return reservationId;
	}

	public void setReservationId(BigDecimal reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationCode() {
		return reservationCode;
	}

	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}

	public LocalDate getDataOfReservation() {
		return dataOfReservation;
	}

	public void setDataOfReservation(LocalDate dataOfReservation) {
		this.dataOfReservation = dataOfReservation;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getParametersCode() {
		return parametersCode;
	}

	public void setParametersCode(String parametersCode) {
		this.parametersCode = parametersCode;
	}

}
