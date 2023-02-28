package DesignPatterns.Behavioral.Mediator;

public class Leg extends BodyPart {
    public Leg(Brain brain) {
        super(brain);
    }

    public void StepForward() {
        System.out.println("Step forward...");
    }

    public void Kick() {
        System.out.println("Kick ...");
    }

    public void StepBack() {
        System.out.println("Step Back ...");
    }
}
