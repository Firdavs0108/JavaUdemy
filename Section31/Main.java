import product.Shirt;
import product.Shirt.Size;
import product.Pants;
import product.Product;


public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(90.0, "Blue", "Nike", Size.SMALL);
   
        shirt.fold();
        productStore(shirt);




        Pants pants = new Pants(89.0, "Red", "Fila", 89, 230);


        pants.fold();
        productStore(pants);

    }

    public static void productStore(Product product){
        System.out.println("Thank you for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice());
    }

}
