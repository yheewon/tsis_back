package com.tsis.heewon.movie.dto;

import lombok.Data;

@Data
public class Reservation {
	private Integer idReservation;
	private String phoneNum;
	private Integer peopleReservation;
	private String seatReservation;
	private String timeMovie;
	private Integer priceReservation;
	private Integer idMovie;
	private String nameMovie;
}
