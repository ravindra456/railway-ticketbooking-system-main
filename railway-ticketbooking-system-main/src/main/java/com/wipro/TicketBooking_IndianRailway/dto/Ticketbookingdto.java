package com.wipro.TicketBooking_IndianRailway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticketbookingdto {
    public int bookingid;//pk
    public String name;
    public String email;
    public String phonenumber;
    public String address;
    public String gender;
    public String password;
    public int age;
    public String noofticket;
}
