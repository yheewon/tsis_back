package com.tsis.heewon.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsis.heewon.movie.dao.MovieDAO;
import com.tsis.heewon.movie.dto.Movie;

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	MovieDAO movieDao;

	@Override
	public List<Movie> selectMovie() {
		// TODO Auto-generated method stub
		return movieDao.selectMovie();
	}
	
}
