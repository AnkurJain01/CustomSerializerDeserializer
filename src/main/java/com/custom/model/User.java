package com.custom.model;

import java.util.Date;

import com.custom.deserializer.CustomDateDeserializer;
import com.custom.serializer.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class User {

	private String name;
	private Date dob;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	@JsonDeserialize(using = CustomDateDeserializer.class)
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	@JsonSerialize(using = CustomDateSerializer.class)
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", dob=" + dob + "]";
	}
}
