package DesignPatterns.Behavioral.Mediator;

// Медіатор
public class Brain {
    public Ear Ear;
    public Eye Eye;
    public Face Face;
    public Hand Hand;
    public Leg Leg;

    public Brain() {
        CreateBodyParts();
    }

    private void CreateBodyParts() {
        Ear = new Ear(this);
        Eye = new Eye(this);
        Face = new Face(this);
        Hand = new Hand(this);
        Leg = new Leg(this);
    }

    public void SomethingHappenedToBodyPart(BodyPart bodyPart) {
        if (bodyPart instanceof Ear) {
            String heardSounds = ((Ear) bodyPart).GetSounds();
            if (heardSounds.contains("stupid")) {
                // Атакуємо образника
                Leg.StepForward();
                Hand.HitPersonNearYou();
                Leg.Kick();
            } else if (heardSounds.contains("cool")) {
                Face.Smile();
            }
        } else if (bodyPart instanceof Eye) {
            // Мозок може проаналізувати, що ви бачите і
            // прореагувати відповідно, використовуючи різні частини тіла
        } else if (bodyPart instanceof Hand) {
            var hand = (Hand) bodyPart;
            boolean hurtingFeeling = hand.DoesItHurt();
            if (hurtingFeeling) {
                Leg.StepBack();
            }
            boolean itIsNice = hand.IsItNice();
            if (itIsNice) {
                Leg.StepForward();
                Hand.Embrace();
            }
        } else if (bodyPart instanceof Leg) {
            // Якщо на ногу впаде цегла, змінюємо вираз обличчя 
        }
    }
}
