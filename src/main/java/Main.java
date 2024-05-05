import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int persons = -1;
        Scanner scaner = new Scanner(System.in);
        while (persons <= 1) {
            System.out.println("Введите количество человек");
            if (scaner.hasNextInt()) {
                persons = scaner.nextInt();
                if (persons <= 1){
                    System.out.println("Введено некорректное значение (должно быть больше 1)");
                }
            } else {
                System.out.println("Введено некорректное значение (должно быть число)");
                scaner.next();
            }
        }
        System.out.println("Количество человек для расчета " + persons);

        Calculator calculator = new Calculator();
        while (true)
        {
            System.out.println("Введите название товара (для завершения введите \"Завершить\"):");
            String name = scaner.next();
            if (name.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                double price = askForPrice(scaner);
                calculator.addProduct(new Product(name, price));
            }
        }
        scaner.close();
        calculator.printProducts();
        calculator.calculateForPersons(persons);
    }
    public static double askForPrice(Scanner scanerPrice) {
        while (true) {
            System.out.println("Введите стоимость товара (в формате рубли.копейки)");
            if (scanerPrice.hasNextFloat()){
                double price = scanerPrice.nextDouble();
                if (price > 0) {
                    return price;
                }
                else
                    System.out.println("Стоимость не может быть меньше или равна нулю");
            }else {
                System.out.println("Формат стоимости должен быть: рубли.копейки");
                scanerPrice.next();
            }
        }
    }
}