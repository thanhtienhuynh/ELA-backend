package com.example.demo.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtils {

    public static String getCurrentTime() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd-MM-yyyy");
        dateFormat.format(date);
        return dateFormat.format(date);
    }

    public static boolean compareWithRejectFeedbackEvent(String endDate, int field, int value) {
        try {
            Date today = new Date(System.currentTimeMillis());
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = dateFormat.parse(endDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(field, value);
            date = calendar.getTime();
            return date.compareTo(today) <= 0;
        } catch (Exception e) {
        }
        return true;
    }

    public static boolean compareWithRejectFeedbackSupplyPost(String endDate, int field, int value) {
        try {
            Date today = new Date(System.currentTimeMillis());
            DateFormat dateFormat = new SimpleDateFormat("HH:mm dd-MM-yyyy");
            System.out.println("end date " + endDate);
            Date date = dateFormat.parse(endDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(field, value);
            date = calendar.getTime();
            System.out.println("Comp " + date.compareTo(today));
            return date.compareTo(today) <= 0;
        } catch (Exception e) {

        }

        return true;
    }
}
