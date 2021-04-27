package com.tsis.heewon.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsis.heewon.movie.dao.ReservateDAO;
import com.tsis.heewon.movie.dto.EmptySeat;
import com.tsis.heewon.movie.dto.Reservation;


@Service
public class ReservationServiceImpl implements ReservationService{
	@Autowired
	ReservateDAO reservationDao;

	@Override
	public boolean insertReservation(Reservation res) {
		// TODO Auto-generated method stub
		return reservationDao.insertReservation(res) == 1;
	}

	@Override
	public boolean updateEmptySeat(EmptySeat emptyseat) {
		// TODO Auto-generated method stub
		return reservationDao.updateEmptySeat(emptyseat) == 1;
	}

	@Override
	public List<Reservation> selectReservation(String phoneNum) {
		// TODO Auto-generated method stub
		return reservationDao.selectReservation(phoneNum);
	}

}
