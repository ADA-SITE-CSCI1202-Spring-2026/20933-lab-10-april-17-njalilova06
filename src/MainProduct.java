import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainProduct {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Bag", 799.99, true));
        products.add(new Product("Jeans", 5.99, true));
        products.add(new Product("Shoes", 45.0, true));
        products.add(new Product("Sweatshirts", 60.0, true));
        products.add(new Product("Jacket", 25.0, false));

        Predicate<Product> isAffordable = p -> p.price < 50 && p.inStock;

        products.removeIf(p -> !isAffordable.test(p));

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
