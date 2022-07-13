package functionalInterfacesdemo;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //int y=9;
        Function<Integer,Integer> f1=i-> {
            int i1 = i + i;
            System.out.println("Print i  "+ i1);
            i1=2;
            int y=8;
            System.out.println(y+i1);
            return i1;
        };
        System.out.println("I value"+f1.apply(5));
    }
    //method reference esche functional interface implementation reusuability jnno

}
