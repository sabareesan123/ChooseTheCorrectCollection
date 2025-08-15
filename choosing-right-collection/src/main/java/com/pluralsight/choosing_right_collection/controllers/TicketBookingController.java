package com.pluralsight.choosing_right_collection.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@AllArgsConstructor
public class TicketBookingController {

    //8. Ticket Booking: Waitlist Management
    @GetMapping("/waitlist")
    public Deque<String> getWaitlist() {
        Deque<String> waitlist = new ArrayDeque<>();
        waitlist.add("User A");
        waitlist.add("User B");
        waitlist.add("User C");
        waitlist.removeFirst(); // Simulate confirmation
        return waitlist;
    }


    //    3. Ticket Booking: Available Movies

    @GetMapping("/movies")
    public List<String> getAvailableMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("Oppenheimer");
        movies.add("Jawan");
        movies.add("Barbie");
        Collections.sort(movies);
        return movies;
    }


}
