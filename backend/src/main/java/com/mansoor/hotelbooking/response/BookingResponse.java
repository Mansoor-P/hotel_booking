package com.mansoor.hotelbooking.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
    private Long id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String guestFullName;

    private String guestEmail;

    private int NumOfAdults;

    private int NumOfChildren;

    private int totalNumOfGuests;

    private String bookingConfirmationCode;

    private RoomResponse room;


    public BookingResponse(Long bookingId, LocalDate checkInDate,
                           LocalDate checkOutDate, String bookingConfirmationCode) {
        this.id = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }


}
