package airline.initialAirplanes;

import airline.airplanesExtends.PassengerAirplaneExtends;
import airline.airplanesExtends.TransportAirplaneExtends;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InitialAirplanes {
    private List<PassengerAirplaneExtends> passengerAirplaneExtendsList;
    private List<TransportAirplaneExtends> transportAirplaneExtendsList;

    public List<PassengerAirplaneExtends> getPassengerAirplaneExtendsList() {
        return passengerAirplaneExtendsList;
    }

    public List<TransportAirplaneExtends> getTransportAirplaneExtendsList() {
        return transportAirplaneExtendsList;
    }

    public List<PassengerAirplaneExtends> initialPassengerAirplanes(){
        passengerAirplaneExtendsList = new ArrayList<>();
        // first airplane, name = "Boeing 747"
        PassengerAirplaneExtends passengerAirplaneExtends = new PassengerAirplaneExtends(222,90,9800, 5000 ,"Boeing 747");
        passengerAirplaneExtends.setNumberOfSeats(821);
        Date data1 = passengerAirplaneExtends.dispatchTime("2018.2.3 11:12:12");
        Date data2 = passengerAirplaneExtends.arrivalTime("2018.2.4 11:12:12");
        passengerAirplaneExtends.setSchedule(passengerAirplaneExtends.schedule(data1,data2,"Kyiv","New-York"));

        passengerAirplaneExtendsList.add(passengerAirplaneExtends);
        // second airplane, name = "Boeing 747-400ER"
        PassengerAirplaneExtends passengerAirplaneExtends1 = new PassengerAirplaneExtends(212,110,14205,6000,"Boeing 747-400ER");
        passengerAirplaneExtends1.setNumberOfSeats(911);
        Date data11 = passengerAirplaneExtends1.dispatchTime("2018.2.3 11:12:12");
        Date data22 = passengerAirplaneExtends1.arrivalTime("2018.2.4 11:12:12");
        passengerAirplaneExtends1.setSchedule(passengerAirplaneExtends1.schedule(data11,data22,"Kyiv","Egypt"));
        passengerAirplaneExtendsList.add(passengerAirplaneExtends1);
        // third airplane, name = "Тu-144"
        PassengerAirplaneExtends passengerAirplaneExtends2 = new PassengerAirplaneExtends(171,85,2920,5400,"Тu-144");
        passengerAirplaneExtends2.setNumberOfSeats(614);
        Date data111 = passengerAirplaneExtends2.dispatchTime("2018.2.3 11:12:12");
        Date data222 = passengerAirplaneExtends2.arrivalTime("2018.2.4 11:12:12");
        passengerAirplaneExtends2.setSchedule(passengerAirplaneExtends2.schedule(data111,data222,"Kyiv","Pekin"));
        passengerAirplaneExtendsList.add(passengerAirplaneExtends2);

        return passengerAirplaneExtendsList;
    }

    public List<TransportAirplaneExtends> initialTransportAirplanes(){
        transportAirplaneExtendsList = new ArrayList<>();
        // first airplane, name = "An-225 Mriya"
        TransportAirplaneExtends transportAirplaneExtends = new TransportAirplaneExtends(400,250,7000 ,6500,"An-225 Mriya");
        transportAirplaneExtends.setCargoCompartmentSize(5,7,43);
        transportAirplaneExtends.setMaximumVolume(850);
        Date data1 = transportAirplaneExtends.dispatchTime("2018.2.2 11:12:12");
        Date data2 = transportAirplaneExtends.arrivalTime("2018.2.3 11:12:12");
        transportAirplaneExtends.setSchedule(transportAirplaneExtends.schedule(data1,data2,"Kyiv","London"));
        transportAirplaneExtendsList.add(transportAirplaneExtends);
        // second airplane, name = "An-124 Ruslan"
        TransportAirplaneExtends transportAirplaneExtends1 = new TransportAirplaneExtends(380,240,6800,6202,"An-124 Ruslan");
        transportAirplaneExtends1.setCargoCompartmentSize(4,6,40);
        transportAirplaneExtends1.setMaximumVolume(800);
        Date data11 = transportAirplaneExtends.dispatchTime("2018.2.3 11:12:12");
        Date data22 = transportAirplaneExtends.arrivalTime("2018.2.4 11:12:12");
        transportAirplaneExtends1.setSchedule(transportAirplaneExtends1.schedule(data11,data22,"Kyiv","Paris"));
        transportAirplaneExtendsList.add(transportAirplaneExtends1);

        return transportAirplaneExtendsList;
    }

}
