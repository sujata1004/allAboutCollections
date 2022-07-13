package lambdaInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapInterface {
    public static void main(String[] args) {


        TreeMap<Integer, Integer> map1 = new TreeMap<>((obj1, obj2)->(obj1>obj2)?-3:(obj1<obj2)?9:0);
        map1.put(1,4);
        map1.put(3,8);
        map1.put(9,1);
        map1.put(0,3);
        //(obj1,obj2)->(obj1>obj2)?-3:(obj1<obj2)?9:0
        TreeMap<Integer,Integer> map2=map1;
        System.out.println(map2);

    }

}
