public class Getter {

    public static void main(String[] args) {
       
        Person information = new Person("Firdavs", "Uzbek", "2000.00.00", 23);
        System.out.println(information.getName());
        System.out.println(information.getDateOfBirth());
        System.out.println(information.getNationality());

        System.out.println(information);
    }
    
}
