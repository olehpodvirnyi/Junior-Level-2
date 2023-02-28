package DesignPatterns.Behavioral.Mediator;

import java.util.Scanner;

public class Ear extends BodyPart {
    private String _sounds = "";

    public Ear(Brain brain) {
        super(brain);
    }

    public void HearSomething() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what you hear:");
        _sounds = scanner.nextLine();
        Changed();
    }

    public String GetSounds() {
        return _sounds;
    }

}