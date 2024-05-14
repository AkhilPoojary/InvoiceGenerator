package org.example;

import org.example.entity.Cab;
import org.example.service.CabService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CabService c=new CabService();

        Scanner sc =new Scanner(System.in);

        System.out.println("enter the distance in meter");

      int distance=sc.nextInt();


        System.out.println("enter the time taken to reach the destination");

       int time=sc.nextInt();

       c.genetateInvoice(distance,time);

    }
}