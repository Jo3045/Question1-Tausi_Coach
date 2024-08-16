/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.questioniv;

/**
 *
 * @author J
 */
public class Questioniv {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        // Given valuesc static void main(String[] args) {
        int totalDistanceKm = 1000; // Total distance from Kabale to Kampala in km
        double speedMetersPerSecond = 225.5; // Speed of the coach in meters per second

        // Convert total distance to meters
        double totalDistanceMeters = totalDistanceKm * 1000.0;

        // Calculate total travel time in seconds
        double travelTimeSeconds = totalDistanceMeters / speedMetersPerSecond;

        // Convert travel time to hours and minutes
        double travelTimeHours = travelTimeSeconds / 3600.0;

        // Define the departure time at 09:00 hrs
        LocalTime departureTime = LocalTime.of(9, 0); // 09:00 hrs

        // Calculate arrival time
        LocalTime arrivalTime = departureTime.plusSeconds((long) travelTimeSeconds);

        // Format the arrival time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedArrivalTime = arrivalTime.format(formatter);

        // Print the results
        System.out.printf("Total travel time: %.2f hours\n", travelTimeHours);
        System.out.println("Approximate arrival time: " + formattedArrivalTime);
 
    }
}
