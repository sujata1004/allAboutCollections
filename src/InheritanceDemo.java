public class InheritanceDemo {
    public static void main(String[] args) {
    A a =new B();
    a.f2();
    B b =new B();
    b.f1();
    a=b;
    a.f2();
    A p=new A();
    p.f2();
    p=b;
    p.f2();
    }

}
class A{
    public void f1(){
        System.out.println("Base Class");

    }
    public void f2(){
        System.out.println("Base Class");

    }

}
class B extends A{
    public void f2(){
        System.out.println("Sub Class");

    }

}
