	package com.example.demo;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeCompare {
    public static void main(String[] args) {
        String time1 = "1h 5min";
        String time2 = "1:02:37";
        int diff = extractMinutes(time2)- extractMinutes(time1);

        boolean minutesAreSame = compareMinutes(time1, time2);

        if (minutesAreSame) {
            System.out.println("Minutes are the same.");
        } else {
            System.out.println("Minutes are different.");
            System.out.println("Different : " + Math.abs(diff) + " Minutes");
        }
    }

    public static boolean compareMinutes(String time1, String time2) {
        int minutes1 = extractMinutes(time1);
        int minutes2 = extractMinutes(time2);

        return minutes1 == minutes2;
    }

    public static int extractMinutes(String timeStr) {
        if (timeStr.contains("h")) {
            String[] parts = timeStr.split(" ");
            int minutes = Integer.parseInt(parts[1].replace("min", ""));
            return  minutes;
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
            LocalTime localTime = LocalTime.parse(timeStr, formatter);
            return  localTime.getMinute();
        }
    }
}
