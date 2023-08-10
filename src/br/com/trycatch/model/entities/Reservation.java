package br.com.trycatch.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date chekIn;
    private Date checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date chekIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.chekIn = chekIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getChekIn() {
        return chekIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = chekIn.getTime() - checkOut.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDate(Date chekIn, Date checkOut){
        this.chekIn = chekIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room "
                + roomNumber
                + " - Check-in: "
                + sdf.format(chekIn)
                + " - Check-out: "
                +sdf.format(checkOut)
                + " - "
                + duration()
                + " Nigths";

    }

}
