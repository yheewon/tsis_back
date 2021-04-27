package com.tsis.heewon.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tsis.heewon.movie.dto.Movie;

@Repository
@Mapper
public interface SeatDAO {
	public List<String> getReservedSeat(String timeMovie); //예약된 좌석 가져오기
	public List<Movie> getTheater(Integer idMovie);//상영관 크기 
	
}
