package com.tsis.heewon.movie.service;

import java.util.List;

import com.tsis.heewon.movie.dto.Movie;

public interface SeatService {
	public List<String> getReservedSeat(String timeMovie); //예약된 좌석 가져오기
	public List<Movie> getTheater(Integer idMovie);//상영관 크기 

}
