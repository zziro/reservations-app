package com.chicho.reservations.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parameters", schema = "public")
public class Parameter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1509434420081162983L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "parameters_id", unique = true, nullable = false)
	private BigDecimal parameterId;
	@Column(name = "code")
	private String code;
	@Column(name = "description")
	private String description;
	@Column(name = "reference_code")
	private String referenceCode;

	public Parameter() {
		// TODO Auto-generated constructor stub
	}

	public BigDecimal getParameterId() {
		return parameterId;
	}

	public void setParameterId(BigDecimal parameterId) {
		this.parameterId = parameterId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

}
