package com.wipro.TicketBooking_IndianRailway.controller;

import com.wipro.TicketBooking_IndianRailway.dto.Traininfodto;
import com.wipro.TicketBooking_IndianRailway.service.Traininfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traininfo")
public class Traininfocontroller {

    @Autowired
    private Traininfoservice service;

    @PostMapping("/{bookingid}/addtraininfo")
    public ResponseEntity<Traininfodto> addtraininfo
            ( @PathVariable(name="bookingid") int bookingid,@RequestBody Traininfodto traininfodto) {
        Traininfodto savetraininfodto = service.addtraininfo( bookingid,traininfodto);
        return new ResponseEntity<>( savetraininfodto,HttpStatus.CREATED);
    }

    @GetMapping("/{bookingid}/gettraininfo")
    public ResponseEntity<List<Traininfodto>>gettraininfo(@PathVariable(name="bookingid") int bookingid) {
        List<Traininfodto> gettraininfodto = service.gettraininfo(bookingid);
        return new ResponseEntity<>(gettraininfodto, HttpStatus.OK);
    }




}
