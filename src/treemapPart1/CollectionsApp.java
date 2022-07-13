package treemapPart1;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.HashMap;
import java.util.TreeSet;

public class CollectionsApp {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add("Sujata");
        t.add("Bipasha");
        TreeSet t1=new TreeSet();
        t1.addAll(t);
        t1.add("Lepard");
        //t1.add(null);
        //in treeset null is not allowed it will throw class cast exception only first time it will take null,after the 2nd value insert it will throw null pointer exception
        System.out.println(t);
        System.out.println(t1);
        String s="Subhasish";
        String s1=new String("Subhashish");
        StringBuffer s2=new StringBuffer("Subhashish");

        boolean b=s1.equals(s2);
        System.out.println(b);

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Su");
        map.put(2,"luki");
        //(String s)->return s.length();
        //s -> s.length();
        map.put(1,"lu");
        System.out.println(map);

    }

}
