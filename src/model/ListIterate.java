package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListIterate {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        Employee e=new Employee(101,"10001","Savi");
        Employee e1=new Employee(102,"10300","Saufjvi");
        Employee e2=new Employee(103,"9000","BSavi");
        Employee e3=new Employee(104,"129000","SBSavi");
        Employee e4=new Employee(105,"6000","SaBSavi");
        emp.add(e);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        //emp.addAll(4,e4);
        List<Employee> epp=new ArrayList<>();
        List<Employee> employees=emp.stream().filter(s->(s.getName().startsWith("S")) && (Integer.parseInt(s.getSal()))>10000).collect(Collectors.toList());
                //emp.stream().filter(s->(s.getName().startsWith("S")) && (Integer.parseInt(s.getSal()))>10000).map(d->d).forEach(s->System.out.println(s));
        for (Employee emp1:employees){
            System.out.println(emp1.toString());

        }
        IntStream.range(1,100).forEach(s->System.out.println(s));

    }
}
