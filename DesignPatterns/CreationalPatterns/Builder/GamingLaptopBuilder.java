package DesignPatterns.CreationalPatterns.Builder;

public class GamingLaptopBuilder extends LaptopBuilder {
    @Override
    public void SetMonitorResolution() {
        Laptop.MonitorResolution = "1900X1200";
    }

    @Override
    public void SetProcessor() {
        Laptop.Processor = "Core 2 Duo, 3.2 GHz";
    }

    @Override
    public void SetMemory() {
        Laptop.Memory = "6144 Mb";
    }

    @Override
    public void SetHDD() {
        Laptop.HDD = "500 Gb";
    }

    @Override
    public void SetBattery() {
        Laptop.Battery = "6 lbs";
    }

}