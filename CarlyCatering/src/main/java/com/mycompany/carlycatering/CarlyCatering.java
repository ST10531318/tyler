/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carlycatering;

import java.util.Scanner;

/**
 *
 * @author tylertinka
 */
public class CarlyCatering {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Event Name:");
        String Ename = inp.next();
        System.out.println("How Many Guest: ");
        int numGuests = inp.nextInt();
        CateringServices event1 = new CateringServices(Ename, numGuests);
        event1.GenBookingCode();
        for(int i = 1; i < numGuests; i++){
            System.out.println("Enter guest Name " + i);
            String Gname = inp.next();
            event1.Guests(Gname);
            int sit = event1.GensitNumber(Gname);
            System.out.println("Sit Number: "+ sit);
            System.out.println("Booking Code: "+ event1.getCode());
        }
        
    }
}
