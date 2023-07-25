import java.math.BigDecimal;

public class TV extends Product{
    int inches;
    boolean smart;
    BigDecimal discount = new BigDecimal(10);

    public TV(String name, String brand, BigDecimal price, BigDecimal vat, int inches, boolean smart) {
        super(name, brand, price, vat);
        this.inches = inches;
        this.smart = smart;
    }

    @Override
    public BigDecimal getDiscount() {
        return smart ? discount : super.getDiscount();
    }
}
