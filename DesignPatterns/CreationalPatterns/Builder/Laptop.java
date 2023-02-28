package DesignPatterns.CreationalPatterns.Builder;

public class Laptop {
    String MonitorResolution;
    String Processor;
    String Memory;
    String HDD;

    public Laptop() {
    }

    String Battery;

    public Laptop(String monitorResolution, String processor, String memory, String hdd, String battery) {
        MonitorResolution = monitorResolution;
        Processor = processor;
        Memory = memory;
        HDD = hdd;
        Battery = battery;
    }

    @Override
    public String toString() {
        return "[Laptop: " + MonitorResolution + ", " + Processor + ", " + Memory + ", " + HDD + ", " + Battery + "]";
    }
}
