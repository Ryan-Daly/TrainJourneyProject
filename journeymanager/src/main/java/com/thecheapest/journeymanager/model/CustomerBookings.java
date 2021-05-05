package com.thecheapest.journeymanager.model;
import com.thecheapest.journeymanager.model.CustomerBookingsID;

import java.io.Serializable;
import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(CustomerBookingsID.class)
public class CustomerBookings implements Serializable {
    @Id
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookingReferenceNumber;
    @Id
    private Integer ticketReferenceNumber;
    private String trainID;
    private String departureTime;
    private String arrivalTime;
    private DecimalFormat fare;
    private String departureStation;
    private String destinationStation;

    public CustomerBookings() {}

    public CustomerBookings(String email, Integer bookingReferenceNumber, Integer ticketReferenceNumber, String trainID, String departureTime, String arrivalTime, DecimalFormat fare, String departureStation, String destinationStation){
        this.email = email;
        this.bookingReferenceNumber = bookingReferenceNumber;
        this.ticketReferenceNumber = ticketReferenceNumber;
        this.trainID = trainID;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.fare = fare;
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBookingReferenceNumber() {
        return bookingReferenceNumber;
    }

    public void setBookingReferenceNumber(Integer bookingReferenceNumber) {
        this.bookingReferenceNumber = bookingReferenceNumber;
    }

    public Integer getTicketReferenceNumber() {
        return ticketReferenceNumber;
    }

    public void setTicketReferenceNumber(Integer ticketReferenceNumber) {
        this.ticketReferenceNumber = ticketReferenceNumber;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public DecimalFormat getFare() {
        return fare;
    }

    public void setFare(DecimalFormat fare) {
        this.fare = fare;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }
}