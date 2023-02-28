package DesignPatterns.CreationalPatterns.AbstractFactory;

public class WoodenToysFactory implements IToyFactory{
    public Bear GetBear() {
        return new WoodenBear();
    }
    public Cat GetCat() {
        return new WoodenCat();
    }

}
