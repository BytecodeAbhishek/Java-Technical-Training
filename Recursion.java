public class Recursion {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //fact(3, 1);
        //System.out.println(zeroCount(100134326,0));
        System.out.println(rev("ab"));
    }
    // method to do sum of digits
    private static int sod(int num){
        if(num ==0) return 0;
        //int sum = num %10 + sod(num/10);
        int sum = sod(num/10);
        int singleDigit = num%10;
        sum += singleDigit;
        return sum;
    }
    // method to find factorial
    private static int factorial(int num){
        if(num <= 1) return 1;
        return num*factorial(num-1);
    }
    private static void fact(int num , int result){
        if(num == 0 || num ==1 ){
            System.out.println(result);
            return;
        }
        fact(num-1,result*num);
    }
    // method to calculate no of zeros in a number
    private static int zeroCount(int num , int count){
        if(num == 0) return count;
        if(num %10 == 0) 
         return zeroCount(num/10 , count+1);
        return zeroCount(num/10 , count);
    }
    // method to reverse a string
    private static String rev(String s){
        if(s.length() == 0){
            return "";
        }
        // we can use this also
        //if(str.length() == 1) return s;
        String rev = rev(s.substring(1));
        rev = rev + s.charAt(0);
        return rev;
    }
    // method to find array is sorted or not
    private static boolean sorted(int[] arr , int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]) return false;
        return sorted(arr,index+1);
    }
}
