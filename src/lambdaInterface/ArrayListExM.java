package lambdaInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExM {
    public static void main(String[] args) {
        List<Integer> list1;
        Integer i[]=new Integer[]{1,3,2,6,4};
        list1= Arrays.asList(i);
        System.out.println(list1);
        Collections.sort(list1,new ArrayExInter());
        System.out.println("After sort"+list1);



    }
}
