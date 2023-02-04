import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(isArmstrong(num));
    }
    // function to return no is armstrong or not
    static boolean isArmstrong( int num){
        int sum = 0;
        int temp = num;
      while (num > 0){
        int rem = num %10;
        sum += (int)(Math.pow(rem,3));
        num = num/10;
      }
      if (sum == temp){
        return true;
      }
      return false;
    }
}
