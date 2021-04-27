package com.tsis.heewon.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsis.heewon.movie.dto.Movie;
import com.tsis.heewon.movie.service.MovieServiceImpl;
import com.tsis.heewon.movie.service.SeatServiceImpl;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/tsis-movie")
public class MovieController {
	@Autowired
	private MovieServiceImpl movieServiceImpl;
	
	@Autowired
	private SeatServiceImpl seatServiceImpl;
	
	@ApiOperation(value = "영화정보 & 상영시간 반환")
	@GetMapping("/movie")
	public ResponseEntity<List<Movie>> selectAllSeats() {

		return new ResponseEntity<List<Movie>>(movieServiceImpl.selectMovie(), HttpStatus.OK);
	}
	
	@ApiOperation(value = "예약좌석 반환")
	@GetMapping("/getSeat")
	public ResponseEntity<List<String>> getReservedSeat(@RequestParam String timeMovie) {

		return new ResponseEntity<List<String>>(seatServiceImpl.getReservedSeat(timeMovie), HttpStatus.OK);
	}
	
	@ApiOperation(value = "상영관크기 반환")
	@GetMapping("/getSize")
	public ResponseEntity<List<Movie>> getTheater(@RequestParam Integer idMovie) {

		return new ResponseEntity<List<Movie>>(seatServiceImpl.getTheater(idMovie), HttpStatus.OK);
	}

	
}
