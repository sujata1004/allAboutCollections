public class StringEx {
    public static void main(String[] args) {
        String a="Sujata";
        String sb=new String("Sujata");
        System.out.println(a==sb);
        if(a.equals(sb))
            System.out.println("True");
        else System.out.println("False");
        StringBuffer s1=new StringBuffer("Loki");
        //String s2="Loki";
        StringBuffer s2=new StringBuffer("Loki");
        sb=a.intern();
        System.out.println(a==sb);
        System.out.println(s1==s2);
        System.out.println(Integer.MAX_VALUE);
    }
}
