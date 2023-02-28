package DesignPatterns.CreationalPatterns.Builder;

public abstract class LaptopBuilder {
    protected Laptop Laptop;

    public void CreateNewLaptop() {
        Laptop = new Laptop();
    }

    // Метод, який повертає готовий ноутбук назовні
    public Laptop GetMyLaptop() {
        return Laptop;
    }

    // Кроки, необхідні щоб створити ноутбук
    public abstract void SetMonitorResolution();

    public abstract void SetProcessor();

    public abstract void SetMemory();

    public abstract void SetHDD();

    public abstract void SetBattery();

    public Laptop getLaptop() {
        return Laptop;
    }

    public void setLaptop(Laptop laptop) {
        Laptop = laptop;
    }

}
