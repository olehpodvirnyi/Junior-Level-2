package DesignPatterns.Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        Brain brain  = new Brain();

        Ear ear = new Ear(brain);
        ear.HearSomething();

    }
}
