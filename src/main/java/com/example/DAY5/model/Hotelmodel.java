package com.example.DAY5.model;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;




@Entity

@Table(name="hotelname")

public class Hotelmodel {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int hotelid;

	@Column(name="hotelname")

	private String hotelname;

	private String hoteladdress;

	public int getHotelid() {

		return hotelid;

	}

	public void setHotelid(int hotelid) {

		this.hotelid = hotelid;

	}

	public String getHotelname() {

		return hotelname;

	}

	public void setHotelname(String hotelname) {

		this.hotelname = hotelname;

	}

	public String getHoteladdress() {

		return hoteladdress;

	}

	public void setHoteladdress(String hoteladdress) {

		this.hoteladdress = hoteladdress;

	}

	




}