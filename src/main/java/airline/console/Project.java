package airline.console;

import airline.airplanesExtends.PassengerAirplaneExtends;
import airline.airplanesExtends.TransportAirplaneExtends;
import java.util.Collections;
import java.util.List;

public class Project {
    private int totalCapacityAirplane;
    private int totalCarryingCapacityAirplane;

    public int getTotalCapacityAirplane() {
        return totalCapacityAirplane;
    }

    public int getTotalCarryingCapacityAirplane() {
        return totalCarryingCapacityAirplane;
    }

    public void totalCapacity (List<PassengerAirplaneExtends> passenger, List<TransportAirplaneExtends> transport){
        int sumCapacityPassengerAir = 0;
        int sumCapacityTransportAir = 0;
        int sumCarryingCapacityPassengerAir = 0;
        int sumCarryingCapacityTransportAir = 0;

        for (PassengerAirplaneExtends passengerAirplaneExtends :passenger) {
            sumCapacityPassengerAir += passengerAirplaneExtends.getCapacity();
            sumCarryingCapacityPassengerAir += passengerAirplaneExtends.getCarryingCapacity();
        }

        for (TransportAirplaneExtends transportAirplaneExtends : transport) {
            sumCapacityTransportAir += transportAirplaneExtends.getCapacity();
            sumCarryingCapacityTransportAir += transportAirplaneExtends.getCarryingCapacity();
        }
        totalCapacityAirplane = sumCapacityPassengerAir + sumCapacityTransportAir;
        totalCarryingCapacityAirplane = sumCarryingCapacityPassengerAir + sumCarryingCapacityTransportAir;
    }

    public void sortedAirplanes (List<PassengerAirplaneExtends> passenger, List<TransportAirplaneExtends> transport){

        Collections.sort(passenger, (one,  other) ->  new Integer(one.getFlightRange()).compareTo(other.getFlightRange()));
        Collections.sort(transport, (one,  other) ->  new Integer(one.getFlightRange()).compareTo(other.getFlightRange()));

        System.out.println("Sort the passenger airplanes by flight range.");
        for (PassengerAirplaneExtends passengers : passenger) {
                System.out.println(passengers);
        }
        System.out.println("\nSort the transport airplanes by flight range.");
        for (TransportAirplaneExtends transports : transport) {
                System.out.println(transports);
        }
    }

    public void airplanesByFuelConsumption(int firstNumber, int lastNumber, List<PassengerAirplaneExtends> passenger, List<TransportAirplaneExtends> transport){
        int countPassengerAirplane = 0;
        int countTransportAirplane = 0;
        if (firstNumber > lastNumber){
            int number = firstNumber;
            firstNumber = lastNumber;
            lastNumber = number;
        }
        for (PassengerAirplaneExtends passengers : passenger) {
            if (firstNumber <= passengers.getFuelConsumption() && lastNumber >= passengers.getFuelConsumption()){
                System.out.println(passengers);
                countPassengerAirplane++;
            }
        }
        if (countPassengerAirplane == 0) System.out.println("In the indicated interval there were no passenger planes.");
        for (TransportAirplaneExtends transports : transport) {
            if (firstNumber <= transports.getFuelConsumption() && lastNumber >= transports.getFuelConsumption()){
                System.out.println(transports);
                countTransportAirplane++;
            }
        }
        if (countTransportAirplane == 0) System.out.println("In the indicated interval there were no transport planes.");
    }

    public void scheduleForPassengersAirplanes(List<PassengerAirplaneExtends> passenger){

        for (PassengerAirplaneExtends pas:passenger) {
            System.out.println(pas.getNameAirplane() + ":");
            System.out.println(pas.getSchedule());
        }
    }

    public void scheduleForTransportAirplanes(List<TransportAirplaneExtends> transport){
        for (TransportAirplaneExtends transp:transport) {
            System.out.println(transp.getNameAirplane()+ ":");
            System.out.println(transp.getSchedule());
        }
    }

    public void numberOfSeatsPassengerAirplanes(List<PassengerAirplaneExtends> passenger){
        for (PassengerAirplaneExtends pas:passenger) {
            System.out.print(pas.getNameAirplane() + ": ");
            System.out.println(pas.getNumberOfSeats());
        }

    }

    public void overallDimensionsTransportAirplanes(List<TransportAirplaneExtends> transport){
        for (TransportAirplaneExtends transp:transport) {
            System.out.println(transp.getNameAirplane()+ ":");
            System.out.println("Maximum value = " + transp.getMaximumVolume() + ", "
                    + "cargo compartment size = " + transp.getCargoCompartmentSize() + " cubic meter.");
        }
    }
}
