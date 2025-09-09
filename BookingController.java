package com.example.ticketbooking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @GetMapping("/api/ping")
    public String ping() {
        return "pong";
    }
}
