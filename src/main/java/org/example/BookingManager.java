package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookingManager {
   private final List<Seat> SEATS;

   public BookingManager(List<String> seatNumbers){
       this.SEATS = new ArrayList<>();
       for(String seatNumber : seatNumbers){
           this.SEATS.add(new Seat(seatNumber));
       }
   }
    public void bookSeat(String seatNumber){
       for(Seat seat : SEATS){
            if(seat.getSeatNumber().equals(seatNumber)){
                seat.bookSeat();
                return;
            }
       }
        System.out.println("Seat " + seatNumber + " does not exist.");
    }

    public void countSeatToPrint(){
        int count = 0;
        for (Seat seat :SEATS) {
            if (seat.getStatus() == SeatStatus.BOOKED) {
                count++;
            }
        }
        System.out.println("Total booked seats: " + count);
    }



}
