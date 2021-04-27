package com.tsis.heewon.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsis.heewon.movie.dao.SeatDAO;
import com.tsis.heewon.movie.dto.Movie;

@Service
public class SeatServiceImpl implements SeatService{
	@Autowired
	SeatDAO seatDao;

	@Override
	public List<String> getReservedSeat(String timeMovie) {
		// TODO Auto-generated method stub
		return seatDao.getReservedSeat(timeMovie);
	}

	@Override
	public List<Movie> getTheater(Integer idMovie) {
		// TODO Auto-generated method stub
		return seatDao.getTheater(idMovie);
	}
	

}
