package product;
import java.util.Objects;

public class Shirt extends Product {


    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}


    public Shirt(double price, String color, String brand,Size size) {
        super(price, color, brand);
        this.size = size;
    }
        

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getBrand2() {
        return "Nike";
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return Objects.equals(size, shirt.size);
    }



    @Override
    public String toString() {
        return "{" +
            " size='" + getSize() + "'" +
            "}";
    }


}
