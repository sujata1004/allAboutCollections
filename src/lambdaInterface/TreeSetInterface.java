package lambdaInterface;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetInterface  {
    public static void main(String[] args) {
        //jehetu treesey by default ascending sorting provide kore tai amra ekhanei comparator object create kore dite pari
        TreeSet<Integer> treeSet=new TreeSet<>((obj1,obj2)->(obj1>obj2)?-2:(obj1<obj2)?3:0);
        treeSet.add(54);
        treeSet.add(45);
        treeSet.add(104);
        treeSet.add(34);
        treeSet.add(0);
        System.out.println("after:"+treeSet);

    }
}
