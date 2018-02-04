package airline.console;

import airline.initialAirplanes.InitialAirplanes;
import java.util.Scanner;

public class Console {
    private Scanner scanner;
    private InitialAirplanes initialAirplanes;
    private Project project;

    public Console() {
        this.scanner = new Scanner(System.in);
        initialAirplanes = new InitialAirplanes();
        initialAirplanes.initialPassengerAirplanes();
        initialAirplanes.initialTransportAirplanes();
        project = new Project();
    }

    public void userInterface() {
        System.out.println("Chose what do you want?");
        System.out.println("General information, press 1.");
        System.out.println("Information about passenger aircraft, press 2.");
        System.out.println("Information about transport aircraft, press press 3.");
        int choice = choice();
        switch (choice) {
            case 1:
                variant1();
                break;
            case 2:
                variant2();
                break;
            case 3:
                variant3();
                break;
        }
    }

    private void variant1() {

        System.out.println("Total capacity and carrying capacity, press 1.");
        System.out.println("Sorting from the minimum to the maximum in range of flight, press 2.");
        System.out.println("Range of fuel consumption, press 3.");
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int choice = choice();
        switch (choice) {
            case 1:
                chose1Variant1();
                break;
            case 2:
                chose2Variant1();
                break;
            case 3:
                chose3Variant1();
                break;
            case 5:
                userInterface();
                break;
            default:
                System.exit(0);
        }
    }

    private void chose1Variant1() {
        project.totalCapacity(initialAirplanes.initialPassengerAirplanes(), initialAirplanes.initialTransportAirplanes());
        System.out.println("Total capacity =" + " " + project.getTotalCapacityAirplane() + " kH.");
        System.out.println("Total carrying capacity =" + " " + project.getTotalCarryingCapacityAirplane() + " tons.");
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5) {
            variant1();
        } else {
            System.exit(0);
        }
    }

    private void chose2Variant1() {
        project.sortedAirplanes(initialAirplanes.initialPassengerAirplanes(), initialAirplanes.initialTransportAirplanes());
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5) {
            variant1();
        } else {
            System.exit(0);
        }
    }

    private void chose3Variant1() {
        System.out.println("Please, chose your interval.");
        System.out.print("First number is ");
        int firstNumber = scanner.nextInt();
        System.out.print("Last number is ");
        int lastNumber = scanner.nextInt();
        if (firstNumber < 0 || lastNumber < 0) {
            System.out.println("Press 5 and try again.");
            System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5){
            variant1();
        }else System.exit(0);
        }
        project.airplanesByFuelConsumption(firstNumber, lastNumber, initialAirplanes.initialPassengerAirplanes(), initialAirplanes.initialTransportAirplanes());
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5){
            variant1();
        }else{
        System.exit(0);
        }
    }

    private void variant2() {

        System.out.println("Schedule of passenger aircraft, press 1.");
        System.out.println("Number of seats, press 2.");
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int choice = choice();
        switch (choice) {
            case 1:
                chose1Variant2();
                break;
            case 2:
                chose2Variant2();
                break;
            case 5:
                userInterface();
                break;
            default:
                System.exit(0);
        }
    }

    private void chose1Variant2(){
        project.scheduleForPassengersAirplanes(initialAirplanes.getPassengerAirplaneExtendsList());
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5) {
            variant2();
        } else {
            System.exit(0);
        }
    }

    private void chose2Variant2(){
        project.numberOfSeatsPassengerAirplanes(initialAirplanes.getPassengerAirplaneExtendsList());
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5) {
            variant2();
        } else {
            System.exit(0);
        }
    }

    private void variant3(){

        System.out.println("Schedule of transport aircraft, press 1.");
        System.out.println("Dimensions of aircraft, press 2.");
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int choice = choice();
        switch (choice) {
            case 1:
                chose1Variant3();
                break;
            case 2:
                chose2Variant3();
                break;
            case 5:
                userInterface();
                break;
            default:
                System.exit(0);
        }
    }

    private void chose1Variant3(){
        project.scheduleForTransportAirplanes(initialAirplanes.getTransportAirplaneExtendsList());
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5) {
            variant3();
        } else {
            System.exit(0);
        }
    }

    private void chose2Variant3(){
        project.overallDimensionsTransportAirplanes(initialAirplanes.getTransportAirplaneExtendsList());
        System.out.println("If you want back, press 5.");
        System.out.println("If you want exit, press any other number.");
        int back = choice();
        if (back == 5) {
            variant3();
        } else {
            System.exit(0);
        }
    }

    private int choice(){
        int choice = 0;
        if (scanner.hasNextInt()){
            choice = scanner.nextInt();
        }else {
            System.err.println("You did not enter a number.");
        }
        return choice;
    }
}
