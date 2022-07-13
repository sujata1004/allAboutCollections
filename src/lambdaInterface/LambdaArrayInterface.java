package lambdaInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaArrayInterface {
    public static void main(String[] args) {
        List<Integer> list1;
        Integer i[]=new Integer[]{1,3,2,6,10};
        list1= Arrays.asList(i);
        System.out.println(list1);
        //implementing lambda expression using comparator and turnary operator
        //ekhane interface er direct defination and procedure bole dicchi karon Comparator akta
        // Functional interface tai oke lambda expression through define kora jaye
        Collections.sort(list1,(t1,t2)->(t1>t2)?-1:(t1<t2)?1:0);
        System.out.println("After sorting using lambda:"+list1);
    }

}
