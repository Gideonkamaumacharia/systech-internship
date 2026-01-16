package org.example.exercisesAndAssignments.trafficLight;


import java.util.Scanner;

public class SWitchExpressionTrafficLightSystem {
    public static void main(String[] args) {
        switchTrafficLightSystem();
    }

    public static void switchTrafficLightSystem(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color: ");
        String light = scanner.nextLine().toLowerCase();

        String action;
        switch (light) {
            case "red" -> action = "Stop!";
            case "yellow" -> action = "Prepare to stop!";
            case "green" -> action = "Go!";
            case "blinking red" -> action = "Treat as stop sign!";
            case "blinking yellow" -> action = "Proceed with caution!";
            default -> action = "Invalid light color";
        }
        System.out.println("Action: " + action);
        scanner.close();
    }
}
