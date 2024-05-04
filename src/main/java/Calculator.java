import java.util.ArrayList;

public class Calculator {

    ArrayList<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        if (products.add(product))
            System.out.println("Товар успешно добавлен");
    }

    public void printProducts() {
        System.out.println("Добавленные товары:");
        for (Product it : products){
            System.out.println(it.name + ": " + it.price);
        }
    }

    public void calculateForPersons(int persons) {
        double sum = 0f;
        for (Product it : products){
            sum += it.price;
        }
        double total = sum / persons;
        Formatter format = new Formatter(total);
        System.out.println("Сумма, которую должен заплатить каждый: " + format.getStringPrice());
    }
}
