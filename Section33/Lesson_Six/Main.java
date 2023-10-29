import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};


        // Creating Stream from Datasource: File
        Path path = Paths.get("path to file");

            double number = (int)(Math.random() * 6);

            System.out.println(number);

            char [] abc = {'a', 'b' , 'c', '1', '2', '3'};

            for (int i = 0; i < abc.length; i++) {
                System.out.println(abc[i]);
            }
    

    }
}