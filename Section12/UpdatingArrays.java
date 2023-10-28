import java.util.Arrays;

public class UpdatingArrays {

    public static void main(String[] args) {

       String [] menu = {"Choy", "Coffee", "Sut"};
        menu[2] = "Qora choy"; 

      System.out.println(Arrays.toString(menu));  

      String[] newMenu = new String[5];

      for (int i = 0; i < menu.length; i++) {
          newMenu[i] = menu[i];
        }

        newMenu[3] = "Fanta";
        newMenu[4] = "Cola";
        System.out.println(Arrays.toString(newMenu));
        
    }
    
}
