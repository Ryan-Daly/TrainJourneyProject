package com.thecheapest.journeymanager;

import com.thecheapest.journeymanager.model.CustomerBookings;
import com.thecheapest.journeymanager.service.CustomerBookingsService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerBookingsResource {
    private final CustomerBookingsService customerBookingService;

    public CustomerBookingsResource(CustomerBookingsService customerBookingService){
        this.customerBookingService = customerBookingService;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/search/email/{email}")
    public ResponseEntity<CustomerBookings> findCustomerBookingByEmail(@PathVariable("email") String email){
        CustomerBookings customerBooking = customerBookingService.findCustomerBookingsByEmail(email);
        return new ResponseEntity<>(customerBooking, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/search/booking/{bookingReferenceNumber}")
    public ResponseEntity<CustomerBookings> findCustomerBookingsByBookingReferenceNumber(@PathVariable("bookingReferenceNumber") Integer bookingReferenceNumber){
        CustomerBookings customerBooking = customerBookingService.findCustomerBookingsByBookingReferenceNumber(bookingReferenceNumber);
        return new ResponseEntity<>(customerBooking, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/search/ticket/{ticketReferenceNumber}")
    public ResponseEntity<CustomerBookings> findCustomerBookingsByTicketReferenceNumber(@PathVariable("ticketReferenceNumber") Integer ticketReferenceNumber){
        CustomerBookings customerBooking = customerBookingService.findCustomerBookingsByTicketReferenceNumber(ticketReferenceNumber);
        return new ResponseEntity<>(customerBooking, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/add")
    public ResponseEntity<CustomerBookings> addCustomerBookings(@RequestBody CustomerBookings customerBookings){
        CustomerBookings newCustomerBooking = customerBookingService.addCustomerBookings(customerBookings);
        return new ResponseEntity<>(newCustomerBooking, HttpStatus.CREATED);
    }
}
