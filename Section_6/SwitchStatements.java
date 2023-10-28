package Section_6;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Section 1: Weather conditions
        String weather = "sunny";

        switch (weather) {
            case "rainy": System.out.println("Take an umbrella");
            break;
            case  "sunny": System.out.println(" Weak a shirt"); 
            break;        
            case  "snowy" : System.out.println("Wear a sweater");
            break;

        
            default: 
            System.out.println("Stay home!");
                break;
        }

        if (weather.equals("Rainy")) {
            System.out.println("Take an unbrella");  
        } else if (weather.equals("sunny")){
            System.out.println(" Weak a shirt");
        }


        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        System.out.println("Enter first temparature and humidity!!");
        int temperature = scanner.nextInt();
        int humidity = scanner.nextInt();

        if (temperature >= 80 && humidity >= 70) {
            System.out.println("It's too much"); 
        } else if(temperature <= 40 && humidity <= 60) {
            System.out.println("It's not too much");
     
        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "green";

        switch (lightColor) {
            case "red": System.out.println("Stop!!"); break;
            case "yellow": System.out.println("Prepare!!"); break;
            case "green": System.out.println("Goo!!");
                break;
        
            default: System.out.println("Inside of water");
                break;
        }
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}}
