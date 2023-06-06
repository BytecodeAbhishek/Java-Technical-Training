public class PatternUsingRecursion{
    public static void main(String[] args) {
        final int MAX_ROW = 5;
        final int STAR = 1;
        pattern1(MAX_ROW, STAR);
    }
    // pattern 1
    // *
    // ** and so on
    private static void pattern1(int row , int star){
        if(row == 0) return;
        printStar(star);
        System.out.println();
        pattern1(row-1, star+1);
    }
    private static void printStar(int row){
        if(row == 0) return;
        System.out.print("*");
        printStar(row-1);
    }
}