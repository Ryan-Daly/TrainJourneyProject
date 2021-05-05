package com.thecheapest.journeymanager.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CustomerBookingsID implements Serializable{
    private String email;
    private Integer bookingReferenceNumber;
    private Integer ticketReferenceNumber;

    public CustomerBookingsID(){}

    public CustomerBookingsID(String email, Integer bookingReferenceNumber, Integer ticketReferenceNumber){
        this.email = email;
        this.bookingReferenceNumber = bookingReferenceNumber;
        this.ticketReferenceNumber = ticketReferenceNumber;
    }

}
