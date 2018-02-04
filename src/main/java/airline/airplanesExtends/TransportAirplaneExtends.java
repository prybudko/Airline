package airline.airplanesExtends;

import airline.airlanesAbstract.TransportAirplaneAbstract;

public class TransportAirplaneExtends extends TransportAirplaneAbstract {

    private int capacity;
    private int carryingCapacity;
    private int flightRange;
    private int fuelConsumption;
    private String nameAirplane;
    private int maximumVolume;
    private String schedule;
    private int cargoCompartmentSize;

    public TransportAirplaneExtends(int capacity, int carryingCapacity, int flightRange, int fuelConsumption, String nameAirplane) {
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.nameAirplane = nameAirplane;
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

    public void setCargoCompartmentSize(int length, int width, int height) {
        if(length <= 0 || width <= 0 || height <= 0){
            System.err.println("Invalid parameters");
        }
        cargoCompartmentSize = length * width * height;
    }

    public int getCargoCompartmentSize() {
        return cargoCompartmentSize;
    }

    public int getMaximumVolume() {
        return maximumVolume;
    }

    public void setMaximumVolume(int maximumVolume) {
        if(maximumVolume <= 0){
            System.err.println("Invalid parameter");
        }
        this.maximumVolume = maximumVolume;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString(){
        return "Name airplane: " + nameAirplane + "; fuel consumption= " + fuelConsumption +
                " liters per hour; flight range= " + flightRange + " kilometers.";
    }
}
