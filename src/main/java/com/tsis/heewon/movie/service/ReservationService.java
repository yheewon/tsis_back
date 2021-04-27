package com.tsis.heewon.movie.service;


import java.util.List;

import com.tsis.heewon.movie.dto.EmptySeat;
import com.tsis.heewon.movie.dto.Reservation;

public interface ReservationService {
	public boolean insertReservation(Reservation res);
	public boolean updateEmptySeat(EmptySeat emptyseat);
	public List<Reservation> selectReservation(String phoneNum);

}
