import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class Product {
    protected final int code;
    protected String name;
    protected String brand;
    protected BigDecimal price;
    protected BigDecimal vat;

    public Product() {
        this.code = new Random().nextInt(1, 100000000);
    }

    public Product(String name, String brand, BigDecimal price, BigDecimal vat) {
        this();
        this.name = name;
        this.brand = brand;
        this.price = price.setScale(2);
        this.vat = vat.setScale(2);

    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public Product setVat(BigDecimal vat) {
        this.vat = vat;
        return this;
    }

    public BigDecimal getVatPrice() {
        return applyVat(this.price);
    }

    public String getProductName() {
        String stringCode = String.valueOf(this.code);
        int codeLength = stringCode.length();
        return "0".repeat(8 - codeLength) + stringCode + "-" + this.name;
    }

    public BigDecimal getDiscount() {
        return new BigDecimal(2);
    }

    public BigDecimal calculateFinalPrice(boolean hasFidelty) {
        if (hasFidelty) return applyVat(applyDiscount(this.price, this.getDiscount())).setScale(2, RoundingMode.HALF_EVEN);
        else return applyVat(this.price).setScale(2, RoundingMode.HALF_EVEN);

    }
    private BigDecimal applyDiscount(BigDecimal price, BigDecimal discount) {
        return price.subtract(price.multiply(discount.divide(new BigDecimal(100), RoundingMode.HALF_EVEN)));

    }

    private BigDecimal applyVat(BigDecimal price) {
        return price.add(price.multiply(this.vat.divide(new BigDecimal(100), RoundingMode.HALF_EVEN)));
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
