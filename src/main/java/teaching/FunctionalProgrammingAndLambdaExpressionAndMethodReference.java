package teaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingAndLambdaExpressionAndMethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Daisy", "Piggy");

        // using lamda expression
        names.stream().filter(name -> name.startsWith("P")).forEach(System.out::println);

        // sort by method ref
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);

        // lamda
        List<Integer> nameLengths = names.stream().map(name -> {
            System.out.println(name + "-" + name.length());

            return  name.length();
        }).toList();
        System.out.println(nameLengths);

        // basic
        List<Integer> nameLengthsBasic = new ArrayList<>();
        for(String name : names) {
            System.out.println(name + "-" + name.length());
            nameLengthsBasic.add(name.length());
        }
        System.out.println(nameLengthsBasic);
    }
}
