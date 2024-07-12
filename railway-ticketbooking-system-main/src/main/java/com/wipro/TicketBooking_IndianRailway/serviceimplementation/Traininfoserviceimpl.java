package com.wipro.TicketBooking_IndianRailway.serviceimplementation;

import com.wipro.TicketBooking_IndianRailway.dto.Traininfodto;
import com.wipro.TicketBooking_IndianRailway.model.Ticketbooking;
import com.wipro.TicketBooking_IndianRailway.model.Traininfo;
import com.wipro.TicketBooking_IndianRailway.repository.Ticketbookingrepo;
import com.wipro.TicketBooking_IndianRailway.repository.Traininforepo;
import com.wipro.TicketBooking_IndianRailway.service.Traininfoservice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Traininfoserviceimpl implements Traininfoservice {
    @Autowired
    private Traininforepo repo;
    @Autowired
    private Ticketbookingrepo ticketrepo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public Traininfodto addtraininfo(int bookingid,Traininfodto traininfodto) {

        Ticketbooking ticketbooking=ticketrepo.findByBookingid(bookingid)
                .orElseThrow(()->new RuntimeException("Booking id is not found"));
        Traininfo info=mapper.map(traininfodto,Traininfo.class);
        info.setBooking(ticketbooking);
        Traininfo savetraininfo = repo.save(info);
        return mapper.map(savetraininfo,Traininfodto.class);
    }

    @Override
    public List<Traininfodto> gettraininfo(int bookingid) {
        ticketrepo.findByBookingid(bookingid)
                .orElseThrow(()->new RuntimeException("Booking id is not found"));

       List<Traininfo> traininfos=repo.findByBookingBookingid(bookingid);
        return traininfos.stream().map(info->mapper.map(info,Traininfodto.class)).collect(Collectors.toList());
    }
}
