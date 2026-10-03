package com.example.BookMyShowBe.controller;


import com.example.BookMyShowBe.dto.ShowResponse;
import com.example.BookMyShowBe.service.CatalogService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/shows")
public class ShowController {

    private final CatalogService catalogService;

    public ShowController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }


    @GetMapping
    public List<ShowResponse> shows(@RequestParam String city,
                                    @RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)LocalDate date)
    {
      return catalogService.shows(city, date);
    }
}
