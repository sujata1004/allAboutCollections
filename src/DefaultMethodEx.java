public class DefaultMethodEx implements Left,Right{
    public void f1(){
        //System.out.println("Own implementation");
        Left.super.f1();
        Right.super.f1();
    }

    public static void main(String[] args) {
        DefaultMethodEx ex=new DefaultMethodEx();
        ex.f1();
        //Left.m2();
    }

}
interface Left{
     default void f1(){
        System.out.println("LEft default");
    }
    //static method overview this is to define some common util methods for multiple people for ease of use
    static void m2(){
        System.out.println("Static method implementation");
    }
}
interface Right{
    default void f1(){
        System.out.println("Right default");
    }
}
