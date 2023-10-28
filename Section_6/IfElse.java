package Section_6;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // int chemistryGrade = 95;
        // int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java: Enter your biology scoore");
        int chemistryGrade = 95;
        int biologyGrade = scanner.nextInt();    
   

        if (biologyGrade > chemistryGrade) {
            System.out.println("Yes,Goog luck!");
        } else {
            System.out.println(" Java: Next time...");
        }
        // Add if-else statement here

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");

        if (costs > sales) {
            System.out.println("No,sorry");  
        } else{
            System.out.println("Yes,congrats");
        }
        // Add if-else statement here

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");

        if (temperature > targetTemperature) {
            System.out.println("Yes.it is");

        } else {
            System.out.println("No.it's okay");
        }
        // Add if-else statement here

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");

        if (word.equals(secondWord)) {
            System.out.println("Yes.it's");
            
        } else {
            System.out.println("No. it isn't");
        }
        // Add if-else statement here

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");

        if (!thirdWord.equals(fourthWord)) {
            System.out.println("Yes.they're");
            
        } else{
            System.out.println("No, they're not");
        }
        // Add if-else statement here
    }
}
