package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> seats = new ArrayList<>();
        seats.add("A1");
        seats.add("A2");
        seats.add("A3");
        List<String> seatsClient = List.of("A2", "A3", "A1", "A4");
        BookingManager bookingManager = new BookingManager(seats);

        for(String seatClients : seatsClient){
            bookingManager.bookSeat(seatClients);
        }
        bookingManager.countSeatToPrint();

    }
}