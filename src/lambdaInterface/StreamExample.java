package lambdaInterface;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    //private static Function1;

    public static void main(String[] args) {
        Employee e = new Employee(1, "Suja", "13333", Arrays.asList("Pune", "Eng"));
        Employee e1 = new Employee(2, "Suja", "53833", Arrays.asList("Pune", "Eng"));
        Employee e2 = new Employee(3, "Suja", "1233", Arrays.asList("Pune", "Eng"));
        Employee e3 = new Employee(4, "Suja", "39033", Arrays.asList("Pune", "Eng"));
        List l = new ArrayList();
        l.add(e);
        l.add(e1);
        l.add(e2);
        l.add(e3);
        //List<Employee> oi=l.stream()
        /*if (stream.isPresent() ){

        System.out.println(stream.get());
        }
        else
            System.out.println("Some");
    }*/
    }
}
