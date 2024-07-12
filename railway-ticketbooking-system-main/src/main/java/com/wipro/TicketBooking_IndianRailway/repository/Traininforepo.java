package com.wipro.TicketBooking_IndianRailway.repository;

import com.wipro.TicketBooking_IndianRailway.model.Traininfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Traininforepo extends JpaRepository<Traininfo,Integer> {

    List<Traininfo> findByBookingBookingid(int bookingid);
}
