import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{
    int IMEI;
    int memorySize;
    BigDecimal discount = new BigDecimal(5);

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, int memorySize) {
        super(name, brand, price, vat);
        this.IMEI = new Random().nextInt(1, 1000000000);
        this.memorySize = memorySize;
    }

    @Override
    public BigDecimal getDiscount() {
        return memorySize <= 32 ? discount : super.getDiscount();
    }
}
