package DesignPatterns.Structural.Bridge;

public class BrickWallCreator implements IWallCreator {
    @Override
    public void BuildWallWithDoor() {
        System.out.println("Brick wall with door.");
    }

    @Override
    public void BuildWall() {
        System.out.println("Brick wall.");
    }

    @Override

    public void BuildWallWithWindow() {
        System.out.println("Brick wall with window. ");
    }

}
