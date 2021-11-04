package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {



    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Billy", Person.Gender.MALE),
                new Person("Alice", Person.Gender.FEMALE),
                new Person("Aicha", Person.Gender.FEMALE),
                new Person("Fadoua", Person.Gender.FEMALE),
                new Person("Yassine", Person.Gender.MALE),
                new Person("Ines", Person.Gender.FEMALE)

        );

        //imperative approach
        List<Person> females1 = new ArrayList<>();

        for (Person person :people){

            if(person.gender.equals(Person.Gender.FEMALE)){

                females1.add(person);
            }

        }
        System.out.println("Imperative approach");
        for (Person fem: females1  ) {

            System.out.println(fem.toString());
        }


        //declarative approach
        List<Person> females = new ArrayList<>();
        //define a Predicate
        Predicate<Person> personPredicate = person -> Person.Gender.FEMALE.equals(person.gender);

        // Filter call a predicate api.
        females = people.stream().filter(personPredicate).collect(Collectors.toList());

        System.out.println("declarative approach");

        females.forEach(System.out::println);
    }


    public static class Person{

        private  final String name;
        private final  Gender gender;

        Person(String name,Gender gender){
            this.name= name;
            this.gender= gender;
        }

       public enum Gender{
            MALE,FEMALE
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}
