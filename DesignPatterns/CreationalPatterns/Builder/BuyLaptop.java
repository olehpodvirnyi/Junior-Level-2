package DesignPatterns.CreationalPatterns.Builder;

public class BuyLaptop {
    private LaptopBuilder _laptopBuilder;
    public void SetLaptopBuilder(LaptopBuilder lBuilder)
    {
        _laptopBuilder = lBuilder;
    }
    public Laptop GetLaptop()
    {
        return _laptopBuilder.GetMyLaptop();
    }
    public void ConstructLaptop()
    {
        _laptopBuilder.CreateNewLaptop();
        _laptopBuilder.SetMonitorResolution();
        _laptopBuilder.SetProcessor();
        _laptopBuilder.SetMemory();
        _laptopBuilder.SetHDD();
        _laptopBuilder.SetBattery();
    }

}
