public class PrintTables {
    public static void main(String[] args) {
        int num = 2;
       for(int i =1 ; i<=10; i++){
         System.out.println(num+" X "+i+" = "+table(num, i));
       } 
    }
    // finction to print table 
    static int table (int num , int i){
        return num*i;
    }
}
