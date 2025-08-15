package com.pluralsight.choosing_right_collection.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;
import java.util.List;

@Service
public class TicketBookingService {

    //8. Ticket Booking: Waitlist Management

    public List<String> getWaitlist() {
        LinkedList<String> waitlist = new LinkedList<>();
        waitlist.add("User A");
        waitlist.add("User B");
        waitlist.add("User C");
        waitlist.removeFirst(); // Simulate confirmation
        return waitlist;
    }
}
