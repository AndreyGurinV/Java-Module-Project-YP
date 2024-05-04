public class Formatter {
    double price;
    public Formatter(double price){
        this.price = price;
    }
    public String getStringPrice() {

        if (Math.floor(price) < 2)
            return String.format("%.2f", price) + " рубль";
        else
            return String.format("%.2f", price) + " рубля";
    }
}
