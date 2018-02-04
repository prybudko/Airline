package airline.airlanesAbstract;

public abstract class TransportAirplaneAbstract extends Airplanes {

    public abstract void setCargoCompartmentSize(int length, int width, int height);

    public abstract int getCargoCompartmentSize();

    public abstract   int getMaximumVolume();

    public abstract  void setMaximumVolume(int maximumVolume);

}
