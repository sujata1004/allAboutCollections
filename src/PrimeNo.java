import java.util.Scanner;
import java.util.stream.IntStream;


/*Print the largest and smallest prime no in a range
from range left to range right count the sum of largest and smallest no
©Sujata Saha
*/
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the range:");
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(PrimeNo.primeVal(l,r));

    }
    static int primeVal(int left,int right){
        int sum=0,countl=0,countr=0;
        for(int i=left;i<=right;i++){
            boolean isPrime=checkPrime(i);
            if(isPrime) {
                countl = 1;
                if (countl == 1) {
                    sum = i;
                }
                break;
            }
        }
        for(int i=right;i>=left;i--) {
            boolean isPrime = checkPrime(i);
            if (isPrime) {
                countr = 1;
                if (countr == 1) {
                    sum = sum + i;
                }
                break;
            }
        }

        return sum;
        }
        static boolean checkPrime(int n){
        if(n==1 || n==0)
            return false;
            for(int i=2;i<=Math.abs(n)/2;i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }



    }


