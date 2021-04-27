package com.tsis.heewon.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tsis.heewon.movie.dto.EmptySeat;
import com.tsis.heewon.movie.dto.Reservation;

@Repository
@Mapper
public interface ReservateDAO {
	public int insertReservation(Reservation res);
	public int updateEmptySeat(EmptySeat emptyseat);
	public List<Reservation> selectReservation(String phoneNum);

}
