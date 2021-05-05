package com.thecheapest.journeymanager.repo;

import com.thecheapest.journeymanager.model.CustomerBookings;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerBookingsRepo extends JpaRepository<CustomerBookings, String>{

	CustomerBookings findCustomerBookingsByEmail(String email);

    CustomerBookings findCustomerBookingsByBookingReferenceNumber(Integer bookingReferenceNumber);

	CustomerBookings findCustomerBookingsByTicketReferenceNumber(Integer ticketReferenceNumber);
    
}
