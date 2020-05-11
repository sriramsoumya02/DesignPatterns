package Iterate.exercise;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(123, "abc"));
        productCollection.add(new Product(234, "bcd"));
        productCollection.add(new Product(345, "cde"));
        Iterator e = productCollection.getIterator();
        while (e.hasNext()) {
            System.out.println(e.next().toString());
        }
    }
}
