package com.tsis.heewon.movie.dto;

import lombok.Data;

@Data
public class Movie {
	private Integer idMovie;
	private String nameMovie;
	private Integer theater;
	private Integer seatNum;
	private Integer priceMovie;
	private Integer theaterLine;
	private Integer theaterHor;
	
	//상영시간 테이블과 join
	private String timeMovie;
	private Integer emptySeat;
}
