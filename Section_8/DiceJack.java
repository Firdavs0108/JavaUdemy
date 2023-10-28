import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      int roleNum1 =  roleDice();
      int roleNum2 =  roleDice();
      int roleNum3 =  roleDice();

      System.out.println("Enter three numbers between 1 and 6");
      
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int num3 = scanner.nextInt();

      if(isLessThan1(num1, num2, num3) || isGreaterThan6(num1, num2, num3));{
            System.out.print("You entered number(s) outside the valid range");
            System.exit(0);
      }

      int sumOfNumbers = num1 + num2 + num3;
      int  sumOfDiceRolls = roleNum1 + roleNum2 + roleNum3;

      System.out.println("Your Sum: " + sumOfNumbers+ "Dice Sum: " + sumOfDiceRolls);

      if (userWon(sumOfNumbers, sumOfDiceRolls)) {
        System.out.println("Congratulations, you win!");
        
      } else {
        System.out.println("Next time!");
      }

      scanner.close();
      
    }

    public static boolean isLessThan1(int num1, int num2, int num3){
             return (num1<1 || num2 <1 || num3 <1);
    }

      public static boolean isGreaterThan6(int num1, int num2, int num3){
             return (num1>6 || num2 >6 || num3 >6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) <3);
    }

    public static int roleDice(){

            double randomNumer = Math.random() * 6;
            
            return (int)randomNumer;
    }
    
}
