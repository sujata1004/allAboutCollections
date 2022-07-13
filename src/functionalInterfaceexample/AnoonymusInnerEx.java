package functionalInterfaceexample;

public class AnoonymusInnerEx {
    public static void main(String[] args) throws InterruptedException {

        Runnable r=()->{
                for(int i=0;i<4;i++)
                    System.out.println("Child thread");
        };
        Thread t =new Thread(r);
        t.start();
        for(int i=0;i<4;i++)
            System.out.println("Main thread");

        //t.wait(2L);
        Thread t1=new Thread();
        t1.start();

    }
}
