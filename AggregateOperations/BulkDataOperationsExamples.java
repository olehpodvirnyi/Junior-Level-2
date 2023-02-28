package AggregateOperations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class BulkDataOperationsExamples {
    public static void main(String... args) {


        List<Person> roster = Person.createRoster();

        // 1. Print names of members, for-each loop
        System.out.println("Members of the collection (for-each loop):");
        for (Person p : roster) {
            System.out.println(p.getName());
        }
        // 2. Print names of members, forEach operation
        System.out.println("Members of the collection (bulk data operations):");
        roster
                .forEach(e -> System.out.println(e.getName()));



        // 4. Print names of male members, for-each loop
        System.out.println("Male members of the collection (for-each loop):");
        for (Person p : roster) {
            if (p.getGender() == Person.Sex.MALE) {
                System.out.println(p.getName());
            }
        }
        // 3. Print names of male members, forEach operation
        System.out.println("Male members of the collection (bulk data operations):");
        roster.stream()
                .filter(e -> e.getGender() == Person.Sex.MALE)
                .forEach(e -> System.out.println(e.getName()));



        // КОНВЕЄРНІ ОПЕРАЦІЇ
        double average = roster
                .stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println("Average age of male members (bulk data operations): " + average);


        //The Stream.reduce Method
        Integer totalAge = roster
            .stream()
            .mapToInt(Person::getAge)
            .sum();

        Integer totalAgeReduce = roster
           .stream()
           .map(Person::getAge)
           .reduce(
               0, (a, b) -> a + b);

        //The Stream.collect Method
        Averager averageCollect = roster.stream()
                .filter(p -> p.getGender() == Person.Sex.MALE)
                .map(Person::getAge)
                .collect(Averager::new, Averager::accept, Averager::combine);

        System.out.println("Average age of male members: " +
                averageCollect.average());


        List<String> namesOfMaleMembersCollect = roster
                .stream()
                .filter(p -> p.getGender() == Person.Sex.MALE) .map
                        (p -> p.getName())
                .collect(Collectors.toList() );

        Map<Person.Sex, List<Person>> byGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(Person::getGender));

        Map<Person.Sex, Integer> totalAgeByGender =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getGender,
                                        Collectors.reducing(
                                                0,
                                                Person::getAge,
                                                Integer::sum)));

        Map<Person.Sex, Double> averageAgeByGender = roster
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getGender,
                                Collectors.averagingInt(Person::getAge)));




        //parallel

        Map<Person.Sex, List<Person>> byGender1 =
                roster
                        .stream()
                        .collect(
                                Collectors.groupingBy(Person::getGender));
        //parallel equivalent
        ConcurrentMap<Person.Sex, List<Person>> byGender2 =
                roster
                        .parallelStream()
                        .collect(
                                Collectors.groupingByConcurrent(Person::getGender));
    }
}
