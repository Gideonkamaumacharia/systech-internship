package org.example.exercisesAndAssignments.trafficLight;

import java.util.Scanner;

//Red: Stop
//Yellow: Prepare to stop
//Green: Go
//Blinking Red: Treat as stop sign
//Blinking Yellow: Proceed with caution
public class TrafficLightSystem {
    public static void main(String[] args) {
        trafficLightSystem();
    }

    public static void trafficLightSystem(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color: ");
        String color = scanner.nextLine().toLowerCase();

        String action;
        switch (color){
            case "red":
                action = "Stop!";
                break;
            case "yellow":
                action = "Prepare to stop!";
                break;
            case "green":
                action = "Go!";
                break;
            case "blinking red":
                action = "Treat as stop sign!";
                break;
            case "blinking yellow":
                action = "Proceed with caution!";
                break;
            default:
                action = "Error: Invalid color!";
        }
        System.out.println("Action: " + action);
        scanner.close();
    }

}
