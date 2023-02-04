import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        for(int i =1 ; i<=N; i++){
        System.out.println(i+"  "+isPrime(i));
        }
    }
    // function to return no is prime or not 
    static boolean isPrime (int num){
      if (num == 1){
        return false;
      }
      if(num == 2  || num == 3){
        return true;
      }
      if (num%2 == 0 || num %3 == 0){
        return false;
      }
      // i*i = num is an alternative for underroot
      for (int i = 5; i*i <= num; i = i+6){
         if (num%i == 0 || num%(i+2) == 0){
            return false;
         }
      }
      return true;
    } 
}