package com.wipro.TicketBooking_IndianRailway.repository;

import com.wipro.TicketBooking_IndianRailway.model.Ticketbooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Ticketbookingrepo  extends JpaRepository<Ticketbooking,Integer> {
    Optional<Ticketbooking> findByBookingid(int bookingid);
}
