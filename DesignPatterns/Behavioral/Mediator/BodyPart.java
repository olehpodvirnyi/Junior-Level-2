package DesignPatterns.Behavioral.Mediator;

public class BodyPart {
    private  Brain _brain;
    public BodyPart(Brain brain) {
        _brain = brain;
    }
    public void Changed() {
        _brain.SomethingHappenedToBodyPart(this);
    }
}
