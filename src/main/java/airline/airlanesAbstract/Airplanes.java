package airline.airlanesAbstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Airplanes {

     public abstract int getCapacity();

     public abstract int getCarryingCapacity();

     public abstract int getFlightRange();

     public abstract int getFuelConsumption();

     public abstract  String getNameAirplane();

     public Date dispatchTime(String dispatch) {

          SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd HH:mm:ss");
          Date dispatchTime = null;
          try {
               dispatchTime = ft.parse(dispatch);
          } catch (ParseException e) {
               e.printStackTrace();
          }
          return dispatchTime;
     }

     public Date arrivalTime(String arrival) {
          SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd HH:mm:ss");
          Date arrivalTime = null;
          try {
               arrivalTime = ft.parse(arrival);
          } catch (ParseException e) {
               e.printStackTrace();
          }
          return arrivalTime;
     }

     public String schedule(Date dispatchTime, Date arrivalTime, String placeOfDispatch, String placeOfArrival) {

          String  schedule = dispatchTime + " " + placeOfDispatch + " -- " + arrivalTime + " " + placeOfArrival;
          return schedule;
     }

}
