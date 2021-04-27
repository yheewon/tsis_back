package com.tsis.heewon.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsis.heewon.movie.dto.EmptySeat;
import com.tsis.heewon.movie.dto.Reservation;
import com.tsis.heewon.movie.service.ReservationServiceImpl;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/tsis-reservation")
public class ReserveController {
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private ReservationServiceImpl reservationServiceImpl;
	
	@ApiOperation(value = "예매 테이블 입력")
	@PostMapping("/reservataion")
	public ResponseEntity<String> insertReservation(@RequestBody Reservation res) {

		if (reservationServiceImpl.insertReservation(res)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@ApiOperation(value = "빈 좌석 수정")
	@PostMapping("/emptyseat")
	public ResponseEntity<String> updateEmptySeat(@RequestBody EmptySeat emptyseat) {

		if (reservationServiceImpl.updateEmptySeat(emptyseat)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	
	@ApiOperation(value = "예약정보 반환")
	@GetMapping("/checkreservation")
	public ResponseEntity<List<Reservation>> selectReservation(@RequestParam String phoneNum) {

		return new ResponseEntity<List<Reservation>>(reservationServiceImpl.selectReservation(phoneNum), HttpStatus.OK);
	}
	
}
