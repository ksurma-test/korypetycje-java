package input_output2;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private String name;
    private List<Product> products;

    public Cart(String name) {
        this.name = name;
        products = new ArrayList<>();

    }

    public void addProduct(Product product) {

        products.add(product);

    }

    @Override
    public String toString() {
        return "Cart{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
