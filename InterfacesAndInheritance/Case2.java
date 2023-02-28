package InterfacesAndInheritance;

//Методи, які вже перевизначені іншими кандидатами, ігноруються. Ця обставина може виникнути, коли супертипи мають спільного предка.
public class Case2 {
    public interface Animal {
        default public String identifyMyself() {
            return "I am an animal.";
        }
    }
    public interface EggLayer extends Animal {
        default public String identifyMyself() {
            return "I am able to lay eggs.";
        }
    }
    public interface FireBreather extends Animal { }
    //The method Dragon.identifyMyself returns the string I am able to lay eggs.
    public class Dragon implements EggLayer, FireBreather {
        public void main (String... args) {
            Dragon myApp = new Dragon();
            System.out.println(myApp.identifyMyself());
        }
    }
}
