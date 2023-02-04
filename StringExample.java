public class StringExample {
    public static void main(String[] args) {
        String name1 = "Abhishek";
        String name2 = "Abhishek";
        System.out.println("Reference : "+(name1 == name2)); // refernce same
        String c = new String("Abhishek"); // new object is created reference different
        System.out.println(name1 == c);
        System.out.println(name1.equals(c)); // true because value is compared
        String d = new String("Abhishek").intern();  // true because refernce is conserved
        System.out.println("After Intern : "+(name1 == d));
    }
}
