package org.example.service;

import java.util.Scanner;

public class CabService {

    public int genetateInvoice(int distance, int time) {


//        distance in meter
        int fare = 0;
        if (distance < 1000 && distance > 0) {
            return 5;
        } else if (distance > 1000) {
            fare = (distance * 10) + time;
        }
        return fare;
    }
}
