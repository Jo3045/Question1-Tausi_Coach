/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.question11;

/**
 *
 * @author J
 */
public class Question11 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Given values
        int totalDistance = 1000; // Total distance from Kampala to Kabale in km
        int speed = 250; // Train speed in km/h
        int passengerStopInterval = 150; // Passenger stop every 150 km
        int refuelStopInterval = 200; // Refuel stop every 200 km
        int stopDurationMinutes = 5; // Duration of each stop in minutes

        // Calculate the number of stops for passengers and refueling
        int passengerStops = totalDistance / passengerStopInterval;
        int refuelStops = totalDistance / refuelStopInterval;

        // Total number of stops (not accounting for overlap)
        int totalStops = passengerStops + refuelStops;

        // Convert stop duration from minutes to hours
        double stopDurationHours = stopDurationMinutes / 60.0;

        // Calculate total time without stops (distance/speed)
        double travelTimeWithoutStops = (double) totalDistance / speed;

        // Calculate the total stop time
        double totalStopTime = totalStops * stopDurationHours;

        // Calculate total travel time
        double totalTravelTime = travelTimeWithoutStops + totalStopTime;

        // Print the results
        System.out.println("Number of stops (without overlap consideration): " + totalStops);
        System.out.printf("Total travel time: %.2f hours\n", totalTravelTime);

    }
}
