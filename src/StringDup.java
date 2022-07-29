import java.util.Scanner;

public class StringDup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int n=s.length();
        Comprison comprison=new Comprison(s,n);
        comprison.fun();
    }
}
class Comprison{
    String s;
    int N;
    Comprison(String s,int N){
        this.s=s;
        this.N=N;
    }
    public void fun(){
        char c[]=s.toCharArray();
        char temp[]=new char[s.length()];
        int count=0;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]==c[j] && c[j]!='\b' && c[i]!='\b'){
                    count++;
                    c[j]=0;
                }
                else if(c[i]!=32 &&  c[i]!='\b') {
                    temp[i] = c[i];
                }

            }
            if(count>=1 && c[i]!=0 && c[i]!=32) {
                System.out.println("Duplicates elements " + c[i] + count + "times");
                count=0;
            }
            else if(c[i]!=32 && count<1 &&  c[i]!=0)
                System.out.println("Distinct element   "+temp[i]);

            c[i]=0;

        }

    }
}
