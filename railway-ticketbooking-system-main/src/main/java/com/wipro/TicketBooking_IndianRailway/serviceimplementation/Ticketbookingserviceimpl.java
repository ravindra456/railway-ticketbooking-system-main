package com.wipro.TicketBooking_IndianRailway.serviceimplementation;

import com.wipro.TicketBooking_IndianRailway.dto.Ticketbookingdto;
import com.wipro.TicketBooking_IndianRailway.model.Ticketbooking;
import com.wipro.TicketBooking_IndianRailway.repository.Ticketbookingrepo;
import com.wipro.TicketBooking_IndianRailway.service.Ticketbookingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticketbookingserviceimpl implements Ticketbookingservice {
    @Autowired
    private Ticketbookingrepo repo;

    @Override
    public Ticketbookingdto bookticket(Ticketbookingdto request) {
        Ticketbooking booking=TicketbookingDtoToEntity(request);
        Ticketbooking savedBooking=repo.save(booking);
        return entityToTicketbookingDto(savedBooking);
    }
    private Ticketbooking TicketbookingDtoToEntity(Ticketbookingdto request) {
        Ticketbooking dto=new Ticketbooking();
        dto.setBookingid(request.getBookingid());
        dto.setName(request.getName());
        dto.setAge(request.getAge());
        dto.setGender(request.getGender());
        dto.setEmail(request.getEmail());
        dto.setPhonenumber(request.getPhonenumber());
        dto.setAddress(request.getAddress());
        dto.setNoofticket(request.getNoofticket());
        dto.setPassword(request.getPassword());
        return dto;
    }

    private Ticketbookingdto entityToTicketbookingDto(Ticketbooking savedBooking) {
        Ticketbookingdto dto=new Ticketbookingdto();
        dto.setBookingid(savedBooking.getBookingid());
        dto.setName(savedBooking.getName());
        dto.setAge(savedBooking.getAge());
        dto.setGender(savedBooking.getGender());
        dto.setEmail(savedBooking.getEmail());
        dto.setPhonenumber(savedBooking.getPhonenumber());
        dto.setAddress(savedBooking.getAddress());
        dto.setNoofticket(savedBooking.getNoofticket());
        dto.setPassword(savedBooking.getPassword());
        return dto;
    }
}
