public class PatternPrinting{
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
    }
    static void pattern1(int n){
        for(int i =1 ; i<=n; i++){
            int totalcolumn = i;
            for (int j =1; j<= totalcolumn; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern2 (int n){
        for(int i =1 ; i<=n; i++){
            int totalcolumn = i;
            char ch = 'A'; 
            for (int j =1; j<= totalcolumn; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        char ch = 'A'; 
        for(int i =1 ; i<=n; i++){
            int totalcolumn = i;
            for (int j =1; j<= totalcolumn; j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }  
    }
    static void pattern4(int n){
        for(int i =1 ; i<=n; i++){
            int totalcolumn = i;
            for (int k =0; k<= n-totalcolumn; k++){
                System.out.print(" ");
            }
            for (int j =1; j<= totalcolumn; j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}