package com.wipro.TicketBooking_IndianRailway.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ticketbooking",uniqueConstraints = {@UniqueConstraint(columnNames = {"email","phonenumber"})})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticketbooking {
    @Id
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
