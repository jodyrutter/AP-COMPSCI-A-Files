/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * FLVS 2007
 * @author B. Jordan
 * @version 6/13/2015 v2.0
 *
 * Modified by: Jody Rutter
 * Date: 6/13/2015
 * Side note: conversion rates supported by google unit converter, except celsius and farenheit.
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double feetPerMile = 5280;          //number of feet per 1 mile
        double kilometers;              //distance in kilometers.
        double kilometersPerMile = 1.60934;    //number of kilometers per 1 mile
        double kilograms;               //mass in kilograms
        double pounds;                  //mass in pounds
        double poundsPerKilogram = 2.20462;    //number of pounds per 1 kilogram
        double gallons;                 //volume in gallons
        double liters;                  //volume in liters
        double litersPerGallon = 3.78541;    //number of liters in 1 gallon
        double celsius;                 //temperature in celsius
        double farenheit;               //temperature in farenheit
        double celsiusPerFarenheit = 1.8;    //number of farenheit in 1 celsius, not acounting for the + 32 conversion
        int waterFreezingPointInFarenheit = 32;    //this number is used in the farenheitPerCelsius ratio to complete the calculation of temperature
        

        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 2.1;
        feet = miles*feetPerMile;
        System.out.println(miles + " mi. = " + feet + " mi. ");
        
        
        //convert kilometers to miles
        kilometers = 210.0;
        miles = kilometers / kilometersPerMile; 
        System.out.println(kilometers + " km. = " + miles + " mi. ");
        
        
        //convert miles to kilometers
        miles = 6.02;
        kilometers = miles*kilometersPerMile;
        System.out.println(miles + " mi. = " + kilometers + " km. ");
        
        
        //convert pounds to kilograms
        pounds = 185.2;
        kilograms = pounds / poundsPerKilogram;
        System.out.println(pounds + " lbs. = " + kilograms + " kg. ");
        
        
        //convert kilograms to pounds
        kilograms = 100.0;
        pounds = kilograms*poundsPerKilogram;
        System.out.println(kilograms + " kg. = " + pounds + " lbs. ");
        
        
        //convert liters to gallons 
        liters = 8.0;
        gallons = liters / litersPerGallon;
        System.out.println(liters + " L. = " + gallons + " gal. ");
        
        
        //convert gallons to liters
        gallons = 24.3;
        liters = gallons*litersPerGallon;
        System.out.println(gallons + " gal. = " + liters + " L. ");
        
        
        //convert farenheit to celsius
        farenheit = 425.3;
        celsius = (farenheit - waterFreezingPointInFarenheit) / celsiusPerFarenheit;
        System.out.println(farenheit + " Fº = " + celsius + " Cº ");
        
        
        //convert celsius to farenheit 
        celsius = 38.5;
        farenheit = (celsius * celsiusPerFarenheit) + waterFreezingPointInFarenheit;
        System.out.println(celsius + " Cº = " + farenheit + " Fº ");
        
        
    }//end of main method
}//end of class

