/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.question3111;

/**
 *
 * @author J
 */
public class Question3111 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Given values
        int totalDistance = 1000; // Total distance from Kabale to Kampala in km
        int speed = 250; // Train speed in km/h
        int refuelStopInterval = 200; // Refuel stop every 200 km
        int stopDurationMinutes = 5; // Duration of each stop in minutes

        // Calculate the number of refuel stops
        int refuelStops = totalDistance / refuelStopInterval;

        // Convert stop duration from minutes to hours
        double stopDurationHours = stopDurationMinutes / 60.0;

        // Calculate total travel time without stops
        double travelTimeWithoutStops = (double) totalDistance / speed;

        // Calculate total stop time
        double totalStopTime = refuelStops * stopDurationHours;

        // Calculate total travel time
        double totalTravelTime = travelTimeWithoutStops + totalStopTime;

        // Print the results
        System.out.println("Number of refuel stops: " + refuelStops);
        System.out.printf("Total travel time on return journey: %.2f hours\n", totalTravelTime);
        
    }
    
}
