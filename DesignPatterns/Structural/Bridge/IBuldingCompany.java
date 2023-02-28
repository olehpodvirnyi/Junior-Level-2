package DesignPatterns.Structural.Bridge;

public interface IBuldingCompany {

    void BuildFoundation();

    void BuildRoom();

    void BuildRoof();

    void setIWallCreator(IWallCreator iWallCreator);

}