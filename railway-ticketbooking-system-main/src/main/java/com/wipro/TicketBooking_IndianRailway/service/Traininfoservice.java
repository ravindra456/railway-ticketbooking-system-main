package com.wipro.TicketBooking_IndianRailway.service;

import com.wipro.TicketBooking_IndianRailway.dto.Traininfodto;

import java.util.List;

public interface Traininfoservice {
    Traininfodto addtraininfo( int bookingid,Traininfodto traininfodto);

    List<Traininfodto> gettraininfo(int bookingid);
}
