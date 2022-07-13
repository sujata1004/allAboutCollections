import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.addElement(4);
        List ab=new ArrayList();
        ab.add(1);
        ab.add(2);
        for(Object dc:ab ){
            v.addElement(ab);
        }
        System.out.println("Print vector elements"+v);
    }
}
