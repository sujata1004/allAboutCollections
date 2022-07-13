import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet<>();
        List abj=new ArrayList();
        abj.add("Pune");
        abj.add("Noida");
        Employee ab=new Employee(1,"Name","2000",abj);
        hashSet.add(1);
        hashSet.add("String");
        hashSet.add(ab);
        System.out.println(hashSet);
        //TreeSet treeSet=new TreeSet(hashSet);
        Collections.sort(abj);
        System.out.println(abj);

    }
}
