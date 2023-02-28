package DesignPatterns.CreationalPatterns.Builder;

public class TripLaptopBuilder extends LaptopBuilder{
    @Override
    public void SetMonitorResolution()
    {
        Laptop.MonitorResolution = "1200X800";
    }
    @Override
    public void SetProcessor(){

    }

    @Override
    public void SetMemory() {

    }

    @Override
    public void SetHDD() {

    }

    @Override
    public void SetBattery() {

    }

}