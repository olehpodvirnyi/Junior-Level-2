package DesignPatterns.Structural.Bridge;

public class ConcreteSlabWallCreator implements IWallCreator {
    @Override
    public void BuildWallWithDoor() {
        System.out.println("Concrete slab wall with door.");
    }

    @Override
    public void BuildWall() {
        System.out.println("Concrete slab wall.");
    }

    @Override

    public void BuildWallWithWindow() {
        System.out.println("Concrete slab wall with window.");
    }

}
