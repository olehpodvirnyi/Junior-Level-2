package DesignPatterns.Structural.Bridge;

class BuldingCompany implements IBuldingCompany {
    public IWallCreator WallCreator;

    @Override
    public void BuildFoundation() {
        System.out.println("Foundation is built.\n");
    }

    @Override
    public void BuildRoom() {
        WallCreator.BuildWallWithDoor();
        WallCreator.BuildWall();
        WallCreator.BuildWallWithWindow();
        WallCreator.BuildWall();
        System.out.println("Room finished.\n");
    }

    @Override
    public void BuildRoof() {
        System.out.println("Roof is done.");
    }

    @Override
    public void setIWallCreator(IWallCreator iWallCreator) {
        this.WallCreator=iWallCreator;
    }

}