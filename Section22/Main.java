import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        String username = scanner.nextLine();
        if (username.isBlank()) {
            System.out.println("Name cannot be null or blank");
        } else{
            user.setUsername(username);
        }
        
        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");

        if (scanner.hasNextInt()) {
            int userAge = scanner.nextInt();
                 if (userAge <= 0) {
            System.out.println("Sorry, check your age!! ");  
        } else{
            user.setAge(userAge);
        }
        } else {
            scanner.nextLine();
        }
        scanner.close();
    }     
}