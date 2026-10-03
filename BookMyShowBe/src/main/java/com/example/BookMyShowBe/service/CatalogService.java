package com.example.BookMyShowBe.service;

import com.example.BookMyShowBe.dto.MovieResponse;
import com.example.BookMyShowBe.dto.ShowResponse;
import com.example.BookMyShowBe.dto.TheatreResponse;
import com.example.BookMyShowBe.entity.Movie;
import com.example.BookMyShowBe.entity.Theatre;
import com.example.BookMyShowBe.repository.MovieRepository;
import com.example.BookMyShowBe.repository.ShowRepository;
import com.example.BookMyShowBe.repository.ShowSeatRepository;
import com.example.BookMyShowBe.repository.TheatreRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


// showing a data
@Service
public class CatalogService {


    private final MovieRepository movieRepository;
    private final TheatreRepository theatreRepository;
    private final ShowRepository showRepository;
    private final ShowSeatRepository showSeatRepository;

    public CatalogService(MovieRepository movieRepository, TheatreRepository theatreRepository, ShowRepository showRepository, ShowSeatRepository showSeatRepository) {
        this.movieRepository = movieRepository;
        this.theatreRepository = theatreRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }

    public List<MovieResponse> movies()
    {
        return movieRepository.findByActiveTrueOrderByTitle().stream().map(MovieResponse::from).toList();
    }

    public List <TheatreResponse> theatres(String city)
    {
        return theatreRepository.findByCityIgnoreCaseOrderByName(city).stream().map(TheatreResponse::from).toList();
    }

    public List<ShowResponse> shows(String city, LocalDate date)
    {

        LocalDateTime from=date.atStartOfDay();
        return showRepository.findByActiveShows(city,from,from.plusDays(1)).stream()
                .map(show -> ShowResponse.from(show,showSeatRepository.findAvailableLabels(show.getId()))).toList();
    }

}
