package TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeMain {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= (ArrayList<Integer>) List.of(1,2,4,5,6,7,8,9,0,12,22,33,44,55);

        List<Integer> evenNumberList=numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        Long count=numbers.stream().count();

        Integer min=numbers.stream().min(Integer::compare).orElse(null);
        Integer max=numbers.stream().max(Integer::compare).orElse(null);

        Integer result=numbers.stream().reduce(0,(a,b)->a+b);

        Integer result3=numbers.stream().reduce(0,(a,b)->a-b);
        System.out.println(result);
        System.out.println(result3);

        boolean hasEven=numbers.stream().anyMatch(n->n%2==0);
        boolean hasOdd=numbers.stream().anyMatch(n->n%2!=0);



    }
}
