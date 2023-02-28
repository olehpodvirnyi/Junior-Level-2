package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);

        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        String s1 = list1.get(0);   // no cast

        // Naming Conventions
        /*
        E - Element (used extensively by the Java Collections Framework)
        K - Key
        N - Number
        T - Type
        V - Value
        S,U,V etc. - 2nd, 3rd, 4th types
        */

        // Upper Bounded Wildcards
        // List<? extends Number> list

        // Unbounded Wildcards
        // List<?> list

        // Lower Bounded Wildcards [Integer , Number і Object]
        // List<? super Integer> list

        //Обмеження

        //1. Неможливо створити екземпляр загальних типів за допомогою примітивних типів
        //Pair< int, char > p = new Pair<>(8, 'a'); // помилка під час компіляції
        //Pair<Integer, Character> p = new Pair<>(8, 'a');

        //2.Неможливо створити екземпляри параметрів типу
        //public static <E> void append(List<E> list) {
        //    E elem = new E(); // помилка під час компіляції
        //    list.add(elem);
        //}
        //public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        //    E elem = cls.newInstance(); // OK
        //    list.add(elem);
        //}


        //3. Неможливо оголосити статичні поля, типи яких є параметрами типу
        //public class MobileDevice<T> {
        //    private static T os;
        //
        //    // ...
        //}

        //4. Не можна використовувати приведення або екземпляр із параметризованими типами
        //public static <E> void rtti(List<E> list) {
        //    if (list instanceof ArrayList<Integer>) { // помилка під час компіляції
        //        // ...
        //    }
        //}
        //public static void rtti(List<?> list) {
        //    if (list instanceof ArrayList<?>) { // OK; instanceof вимагає reifiable типу
        //        // ...
        //    }
        //}

        //5. Неможливо створити масиви параметризованих типів
        //List<Integer>[] arrayOfLists = new List<Integer>[2]; // помилка під час компіляції
        //
        //Object[] strings = new String[2];
        //strings[0] = "привіт"; // OK
        //strings[1] = 100; // Викликається виняткова ситуація ArrayStoreException.
        //
        //Object[] stringLists = new List<String>[2]; // помилка компілятора, але вдавайте, що це дозволено
        //stringLists[0] = new ArrayList<String>(); // OK
        //stringLists[1] = new ArrayList<Integer>(); // Має бути створено виняток ArrayStoreException,
        //                                          // але середовище виконання не може його виявити.

        //6. Не можна створювати, ловити або кидати об’єкти параметризованих типів
        // Розширює Throwable непрямим чином
        //class MathException<T> extends Exception { /* ... */ } // помилка під час компіляції
        // Розширює Throwable безпосередньо
        //class QueueFullException<T> extends Throwable { /* ... */ // компілювати - помилка часу
        //
        //Метод не може перехопити екземпляр параметра типу:
        //public static <T extends Exception, J> void execute(List<J> jobs) {
        //    try {
        //        for (J job : jobs)
        //            // ...
        //    } catch (T e) { // помилка під час компіляції
        //        // .. .
        //    }
        //}
        //
        //Однак ви можете використовувати параметр типу в пропозиції throws :
        //class Parser<T extends Exception> {
        //    public void parse(File file) throws T { // OK
        //        // ...
        //    }
        //}

        //7. Неможливо перевантажити метод, де формальні типи параметрів кожного перевантаження стираються до того самого необробленого типу
        //Клас не може мати два перевантажені методи, які матимуть однакову сигнатуру після стирання типу.
        //
        //public class Приклад {
        //    public void print(Set<String> strSet) { }
        //    public void print(Set<Integer> intSet) { }
        //}

    }
}