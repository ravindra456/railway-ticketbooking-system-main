package com.wipro.TicketBooking_IndianRailway.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "traininfo")
public class Traininfo {
    @Id
    public int trainnumber;
    public String trainname;
    public String source;
    public String destination;
    public String departuretime;
    public String arrivaltime;
    public String status;
    public String fare;
    public String duration;
    public String classs;
    public String distance;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    public Ticketbooking booking;


}
