package Iterate.exercise;

public class Product {
    private int code;
    private String name;

    public Product(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
