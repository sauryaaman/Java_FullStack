package com.example.BookMyShowBe.controller;


import com.example.BookMyShowBe.dto.BookingResponse;
import com.example.BookMyShowBe.dto.CreateProfileRequest;
import com.example.BookMyShowBe.dto.ProfileResponse;
import com.example.BookMyShowBe.service.BookingService;
import com.example.BookMyShowBe.service.CatalogService;
import com.example.BookMyShowBe.service.ProfileService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {

    private final ProfileService profileService;

    private final BookingService bookingService;


    public ProfileController(ProfileService profileService, BookingService bookingService) {
        this.profileService =  profileService;
        this.bookingService = bookingService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse create(@Valid @RequestBody CreateProfileRequest request)
    {

        return profileService.create(request);

    }

    @GetMapping("/login")
    public ProfileResponse login(@RequestParam String indentifier)
    {
        return profileService.login(indentifier);
    }


    @GetMapping("/{profileId}/bookings")
    public List<BookingResponse> booking (@PathVariable long profileId)
    {
        return bookingService.findByProfileId(profileId);
    }





}
