package Database;

import java.util.ArrayList;

public class Db {
    public static ArrayList<Customers> customerData = new ArrayList<>();

    static {
        customerData.add(new Customers("kj","kj1234"));
    }
}
