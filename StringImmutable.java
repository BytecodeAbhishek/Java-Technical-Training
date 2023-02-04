public class StringImmutable {
    public static void main(String[] args) {
        // String type = "shoes";
        // String SQL = "select * from products where type= "+type;
        // double price = 3000;
        // SQL = SQL + "and price > = "+price;
        // double rating = 4.0;
        // SQL = SQL + "and rating > = "+rating;
        // this is not a very good method since strings are immutable, it uses a lot of memory
        // which is a waste of resources
        String type = "shoes";
        StringBuffer SQL = new StringBuffer("select * from products where type= "+type);
        System.out.println("Length : "+SQL.length());
        int price = 4000;
        SQL.append("and price > =").append(price);
        double rating = 4.0;
        SQL.append("and rating >= ").append(rating);
        System.out.println(SQL.length());
        // all methods of buffer are synchronised and threading is not possible , they maintain lock
        // String buffer alternate is builder
        StringBuilder sql = new StringBuilder();
        System.out.println(sql.length());
        sql.append("Abhishek");
        System.out.println(sql.length());
        // all the three are refernce types
    }
}
