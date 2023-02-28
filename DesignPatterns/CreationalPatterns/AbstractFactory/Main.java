package DesignPatterns.CreationalPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Спочатку створимо «дерев'яну» фабрику
        IToyFactory toyFactory = new WoodenToysFactory();
        Bear bear = toyFactory.GetBear();
        Cat cat = toyFactory.GetCat();
        System.out.printf("I've got {0} and {1}%n", bear.name, cat.name);
        // Вивід на консоль буде: [I've got Wooden Bear and Wooden Cat]


        // А тепер створимо «плюшеву» фабрику, наступна лінійка є єдиною різницею в коді
        IToyFactory toyFactory1 = new TeddyToysFactory();
        // Як бачимо код нижче не відрізняється від наведеного вище
        Bear bear1 = toyFactory1.GetBear();
        Cat cat1 = toyFactory1.GetCat();
        System.out.printf("I've got {0} and {1}%n", bear.name, cat.name);
        // А вивід на консоль буде інший: [I've got Teddy Bear and Teddy Cat]


    }
}
