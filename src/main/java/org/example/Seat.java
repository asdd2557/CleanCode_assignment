package org.example;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Seat {
    String seatNumber;
    SeatStatus status;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.status = SeatStatus.AVAILABLE;
    }
    public void bookSeat() {
        if (status == SeatStatus.BOOKED) {
            throw new IllegalStateException("Seat " + seatNumber + " is already booked.");
        }
        this.status = SeatStatus.BOOKED;
        System.out.println("Seat " + seatNumber + " has been successfully booked.");
    }

}
