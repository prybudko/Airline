package airline.airplanesExtends;

import airline.airlanesAbstract.PassengerAirplaneAbstract;

public class PassengerAirplaneExtends extends PassengerAirplaneAbstract {

    private int capacity;
    private int carryingCapacity;
    private int flightRange;
    private int fuelConsumption;
    private String nameAirplane;
    private int numberOfSeats;
    private String schedule;

    public PassengerAirplaneExtends(int capacity, int carryingCapacity, int flightRange, int fuelConsumption, String nameAirplane) {
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.nameAirplane = nameAirplane;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getNameAirplane() {
        return nameAirplane;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString(){
        return "Name airplane: " + nameAirplane + "; fuel consumption = " + fuelConsumption +
                " liters per hour; flight range = " + flightRange + " kilometers.";
    }

}
