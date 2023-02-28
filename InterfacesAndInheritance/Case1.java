package InterfacesAndInheritance;

//Методи екземплярів мають перевагу над методами інтерфейсу за замовчуванням.
public class Case1 {
    public class Horse {
        public String identifyMyself() {
            return "I am a horse.";
        }
    }
    public interface Flyer {
        default public String identifyMyself() {
            return "I am able to fly.";
        }
    }
    public interface Mythical {
        default public String identifyMyself() {
            return "I am a mythical creature.";
        }
    }
    //The method Pegasus.identifyMyself returns the string I am a horse.
    public class Pegasus extends Horse implements Flyer, Mythical {
        public void main(String... args) {
            Pegasus myApp = new Pegasus();
            System.out.println(myApp.identifyMyself());
        }
    }

}
