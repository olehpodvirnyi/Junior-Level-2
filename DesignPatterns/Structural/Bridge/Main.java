package DesignPatterns.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        // Ми маємо дві бригади – одна працює із цеглою, інша із бетоном
        IWallCreator brickWallCreator = new BrickWallCreator();
        IWallCreator conctreteSlabWallCreator = new ConcreteSlabWallCreator();
        IBuldingCompany buildingCompany = new BuldingCompany();

        buildingCompany.BuildFoundation();
        buildingCompany.setIWallCreator(conctreteSlabWallCreator);
        buildingCompany.BuildRoom();
        // Компанія може легко переключитися на іншу команду, яка буде будувати
        // стіни із інших матеріалів
        buildingCompany.setIWallCreator(brickWallCreator);
        buildingCompany.BuildRoom();
        buildingCompany.BuildRoom();

        buildingCompany.BuildRoof();
    }

}