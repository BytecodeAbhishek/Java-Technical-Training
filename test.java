public class test{
    public static void main(String[] args) {
        System.out.println("Hello World");
        String a = "Abhishek";
        String b = "Abhishek";
        //String b = new String("Abhishek");  will give false new reference
        //a = "Abhi"; new object is created will also give false
        System.out.println(a);
        if(a==b){
            System.out.println(true);
        }
        // Strings are immutable
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);   // this will convert 1 into string wrapper classs call to string method on it
        // atleast one object should be string to add complex things in sout , operator overloading
        // String does not allow us to modify values it cretes new object
        // for(int i =0; i<26; i++){
        //     char ch = (char) ('a' + i);
        //     //System.out.println(ch);
        //     String s = "" + ch;
        //     System.out.println(s);
        // }
        // therefore we use String builder class
        StringBuilder builder = new StringBuilder();
        for(int i =0; i<26; i++){
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        // String palin = "abcdcba";
        // palin = palin.toLowerCase();
        // int start =0;
        // int end = palin.length()-1;
        // while(start <= end){
        //     if(palin.charAt(start) == palin.charAt(end)){
        //         start ++;
        //         end --;
        //     }
        //     else{
        //         System.out.println(false);
        //     }
        // }
        // System.out.println(true);
    }
}