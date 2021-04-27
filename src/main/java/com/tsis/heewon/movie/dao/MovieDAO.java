package com.tsis.heewon.movie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.tsis.heewon.movie.dto.Movie;

@Repository
@Mapper
public interface MovieDAO {
	public List<Movie> selectMovie();
}
