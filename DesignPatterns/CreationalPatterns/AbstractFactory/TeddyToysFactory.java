package DesignPatterns.CreationalPatterns.AbstractFactory;

public class TeddyToysFactory implements IToyFactory{
    public Bear GetBear() {
        return new TeddyBear();
    }
    public Cat GetCat() {
        return new TeddyCat();
    }
}
