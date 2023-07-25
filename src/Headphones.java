import java.math.BigDecimal;

public class Smartphone extends Product{
    int IMEI;
    int memorySize;
    BigDecimal discount = new BigDecimal(5);

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, int IMEI, int memorySize) {
        super(name, brand, price, vat);
        this.IMEI = IMEI;
        this.memorySize = memorySize;
    }

    @Override
    public BigDecimal getDiscount() {
        return memorySize <= 32 ? discount : super.getDiscount();
    }
}
