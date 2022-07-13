package lambdaInterface;

import java.util.Comparator;

public class ArrayExInter implements Comparator<Integer> {
    @Override
    public int compare(Integer t1, Integer t2) {
        //by default collection sort method sorts in ascending order,so we will sort in descending order.
        if(t1>t2)
         return -1;
        else if(t1<t2)
            return 1;
        else
            return 0;

    }
}
