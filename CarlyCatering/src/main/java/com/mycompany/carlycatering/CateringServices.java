/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carlycatering;

import java.util.Random;

/**
 *
 * @author tylertinka
 */
public class CateringServices {
    private String eventName;
    private int numGuests;
    private String bookingCode;
    
    public String getCode(){
        return bookingCode;
    }
    
    public CateringServices(String eventName, int guests){
        this.eventName = eventName;
        numGuests = guests;
    }
    public void GenBookingCode(){
       String code = eventName.substring(0,2);
       bookingCode += code + "Carlyl";
    }
    public void Guests(String name){
        System.out.println("Welcome: "+ name);
    }
    public int GensitNumber(String name){
        Random rand = new Random();
        int sitNum = rand.nextInt(numGuests)+1;
        System.out.println(name+ "sitted @" + sitNum);
        return sitNum;
    }
    public int sum2num(int num, int num2){
        return num + num2;
}
    public boolean isCapps(char ch){
        return Character.isUpperCase(ch);
    }
}