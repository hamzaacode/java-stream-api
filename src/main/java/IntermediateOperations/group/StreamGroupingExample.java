package IntermediateOperations.group;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person2{name='" + name + "', age=" + age + '}';
    }
}

public class StreamGroupingExample {
    public static void main(String[] args) {
        List<Person2> peoples = Arrays.asList(
            new Person2("Alice", 25),
            new Person2("Bob", 30),
            new Person2("Charlie", 25),
            new Person2("David", 30)
        );

        Map<Integer, List<Person2>> peopleByAge = peoples.stream()
            .collect(Collectors.groupingBy(p -> p.age));

      Map<Integer ,List<Person2>>  list2=peoples.stream().collect(Collectors.groupingBy(p->p.age));

     //   System.out.println(peopleByAge);

       Map<Integer,List<Person2>> peopleByAge3=peoples.stream().collect(Collectors.groupingBy(person2 -> person2.age));

//       for(Map.Entry<Integer, List<Person2>> entry :peopleByAge3.entrySet()){
//           System.out.println(entry.getKey());
//           entry.getValue().forEach(person2 -> System.out.println(person2.name));
//        }

       peopleByAge3.forEach((k,v)->{
           System.out.println(k);
           v.stream().forEach(System.out::println);
          // System.out.println(v);
       });
    }
}