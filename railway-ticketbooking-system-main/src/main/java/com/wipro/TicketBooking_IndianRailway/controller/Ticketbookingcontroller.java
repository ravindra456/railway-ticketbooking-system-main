package com.wipro.TicketBooking_IndianRailway.controller;

import com.wipro.TicketBooking_IndianRailway.dto.Ticketbookingdto;
import com.wipro.TicketBooking_IndianRailway.service.Ticketbookingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticketbooking")
public class Ticketbookingcontroller {

    private Ticketbookingservice service;
    @Autowired
    public Ticketbookingcontroller(Ticketbookingservice service) {
        this.service = service;
    }

    @PostMapping("/book")
    public ResponseEntity<Ticketbookingdto> bookTicket(@RequestBody Ticketbookingdto request) {
        System.out.println("book the tickets ");
        return new ResponseEntity<>(service.bookticket(request), HttpStatus.CREATED);
    }


}
