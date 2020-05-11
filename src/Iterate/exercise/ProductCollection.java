package Iterate.exercise;

import java.util.Iterator;
import java.util.Stack;

public class ProductCollection {
    Stack<Product> products = new Stack<>();

    public void add(Product p) {
        products.push(p);
    }

    public Iterator getIterator() {
        return new StackIterator(this);
    }

    class StackIterator implements Iterator<Product> {
        ProductCollection p;
        int index;

        public StackIterator(ProductCollection p) {
            this.p = p;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < p.products.size();
        }

        @Override
        public Product next() {
            if (index < p.products.size())
                return p.products.elementAt(index++);
            return null;
        }
    }
}
