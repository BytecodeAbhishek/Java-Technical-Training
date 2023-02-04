import java.math.BigInteger;
import java.util.LinkedList;

public class WrapperTypes {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 200;
        String str = b.toString();
        System.out.println(str);
        System.out.println(Integer.toBinaryString(a));
        char s = 's';
        System.out.println(Character.isLowerCase(s));
        LinkedList <String> list = new LinkedList<>();
        list.add("Abhishek");
        BigInteger y = new BigInteger("2000000000000000000000000000000000000000000000");
        System.out.println(y);
        // wrapper type is also reference type
    }
}
