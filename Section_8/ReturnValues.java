public class ReturnValues {

    public static void main(String[] args) {
      double area  = calculateArea(2.3, 3.4);       
      String uzbLanguage = languageSelect("Uzbek");    
      exampleLan(uzbLanguage);    
  

    }

    public static double calculateArea(double length, double width) {

    
            double area = length * width;
        return area;

    }

    public static String languageSelect( String language) {

        switch (language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spain": return "La surface est egale a la longueur * la largeur";
            
            default: return "La surface est egale a la longueur * la largeur";
        }

    }


    public static void exampleLan(String language){
            System.out.println(language);
    }

    
}




// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"