public class Parameters {

    public static void main(String[] args) {
        calculateArea(2.3, 3.4);       
        calculateArea(3.3, 3.4);
        calculateArea(4.3, 3.4);

        calculateBill(50.8, 10.00);


    }

    public static void calculateArea(double length, double width) {

    
        double area = length * width;
        System.out.println("Area: " + area);

    }

    public static void calculateBill(double payment, double gift) {
         System.out.println(" I hope you enjoyed your meal. Bill was 50.8$");
         payment = 50.8;

        System.out.println("Your service was wonderful! 10.0$ is for you");
        double overAll = payment + gift;
        System.out.println("OverAll: " +overAll);
    }
    
}
