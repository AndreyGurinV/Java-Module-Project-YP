public class Formatter {
    double price;
    public Formatter(double price){
        this.price = price;
    }
    public String getStringPrice() {
        double prc = Math.floor(price);
        prc %= 100;
        if (prc >= 5 && prc <= 20){
            return String.format("%.2f", price) + " рублей";
        }
        else {
            prc %= 10;
            if (prc == 1) {
                return String.format("%.2f", price) + " рубль";
            } else if (prc > 1 && prc < 5){
                return String.format("%.2f", price) + " рубля";
            } else {
                return String.format("%.2f", price) + " рублей";
            }
        }
    }
}
