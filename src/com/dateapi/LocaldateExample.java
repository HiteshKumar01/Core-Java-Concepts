package com.dateapi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocaldateExample {
    public static void main(String[] args) {
        LocalDate d= LocalDate.now();
        System.out.println(d);

        LocalDate d1=LocalDate.of(2004,10,4);
        System.out.println(d1);

        LocalDate d2=LocalDate.of(2005, Month.SEPTEMBER,9);
        System.out.println(d2);

        //LocalTime
        LocalTime t= LocalTime.now();
        System.out.println(t);

        LocalTime t1=LocalTime.of(4,34,23,4445);
        System.out.println(t1);

        LocalTime t2=LocalTime.now(ZoneId.of("GMT"));
        System.out.println(t2);

//       for(String s:ZoneId.getAvailableZoneIds()){
//           System.out.println(s);
//       }

        //machine-readable time format
        Instant i=Instant.now();
        System.out.println(i);
        //human-readable
        LocalDateTime t3=LocalDateTime.now();
        System.out.println(t3);

        LocalDateTime t4=LocalDateTime.now(ZoneId.of("Asia/Rangoon"));
        System.out.println(t4);

        //date time formatter
        DateTimeFormatter a=DateTimeFormatter.ofPattern("dd-MM-yyyy       hh:mm:ss");
        String formatedDateTime=t4.format(a);
        System.out.println(formatedDateTime);
    }
}