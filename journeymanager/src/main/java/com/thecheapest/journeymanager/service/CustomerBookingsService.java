package com.thecheapest.journeymanager.service;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thecheapest.journeymanager.model.CustomerBookings;
import com.thecheapest.journeymanager.repo.CustomerBookingsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;
import org.springframework.web.reactive.function.client.WebClient.UriSpec;

import reactor.core.publisher.Mono;

@Service
public class CustomerBookingsService {
    private final CustomerBookingsRepo customerBookingsRepo;

    @Autowired
    public CustomerBookingsService(CustomerBookingsRepo customerBookingsRepo) {
        this.customerBookingsRepo = customerBookingsRepo;
    }



    public CustomerBookings addCustomerBookings(CustomerBookings customerBookings) {
        return customerBookingsRepo.save(customerBookings);
    }

    public CustomerBookings findCustomerBookingsByEmail(String email) {
        return customerBookingsRepo.findCustomerBookingsByEmail(email);
    }

    public CustomerBookings findCustomerBookingsByBookingReferenceNumber(Integer bookingReferenceNumber) {
        return customerBookingsRepo.findCustomerBookingsByBookingReferenceNumber(bookingReferenceNumber);
    }

    public CustomerBookings findCustomerBookingsByTicketReferenceNumber(Integer ticketReferenceNumber) {
        return customerBookingsRepo.findCustomerBookingsByTicketReferenceNumber(ticketReferenceNumber);
    }
    
}
