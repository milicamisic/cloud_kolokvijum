package io.jpabuddy.spring.demo.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    private FilmRepo filmRepository;

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }
}
