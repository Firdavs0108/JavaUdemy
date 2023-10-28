package Section_6;

public class Comparision {

    public static void main(String[] args) {
        int currentSpeed = 60;
        int limitedSpeed = 70;

        System.out.println("Hey Java I am driving slowly or not");       
        System.out.println("Java: " + (currentSpeed > limitedSpeed));

        int age = 70;
        int retirementAge = 65;

        System.out.println("I am old enough to retire.");
        System.out.println("Java: " + (age >= retirementAge));

        

        long Fergana = 1200L;
        long Termiz = 1500L;

        System.out.println("Hey Java Termiz is far from Fergana?");
        System.out.println("Java:" + (Fergana != Termiz));

        String word = "Ona";
        String word2 = "Ota";

        System.out.println(" Hey Java! Value of Ota and ona are the same ");
        System.out.println(" Java: " + (word2.equals(word)));

    }
    
}
