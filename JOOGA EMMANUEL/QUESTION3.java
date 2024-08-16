/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.question3;

/**
 *
 * @author J
 */
public class QUESTION3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Distance from Kampala to Kabale
        int totalDistance = 1000;
        
        // Distance intervals for stopping
        int passengerStopInterval = 150;
        int refuelStopInterval = 200;
        
        // Calculate the number of stops for passengers and refueling
        int passengerStops = totalDistance / passengerStopInterval;
        int refuelStops = totalDistance / refuelStopInterval;
        
        // Print the result
        System.out.println("Number of stops for passengers: " + passengerStops);
        System.out.println("Number of stops for refueling: " + refuelStops);
        
        // The total number of stops could include common stops when both happen at the same location
        System.out.println("Total stops without considering overlaps: " + (passengerStops + refuelStops));
        
        // For simplicity, assuming no overlap in stopping intervals, this is the total number of stops  }
}
    }

