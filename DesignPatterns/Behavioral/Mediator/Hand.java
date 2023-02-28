package DesignPatterns.Behavioral.Mediator;

public class Hand extends BodyPart {
    public Hand(Brain brain) {
        super(brain);
    }

    public void HitPersonNearYou() {
        System.out.println("Hit Person Near You...");

    }

    public boolean DoesItHurt() {
        return false;
    }

    public boolean IsItNice() {
        return false;
    }

    public void Embrace() {
    }
}
