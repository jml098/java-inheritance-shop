import java.math.BigDecimal;

public class Headphones extends Product{
    String color;
    boolean wireless;
    BigDecimal discount = new BigDecimal(7);

    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean wireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    @Override
    public BigDecimal getDiscount() {
        return wireless ? discount : super.getDiscount();
    }
}
