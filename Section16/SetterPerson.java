public class SetterPerson {

    public static void main(String[] args) {
        

        Person infPerson = new Person("Firdavs", "Uzbekistan", "2000.08.08", 24, 28);   

        //    Person infPerson2 = new Person("White", "Black", "20202022", 23);      // As usual creating new obj

        // System.out.println(infPerson2.getName());
        // System.out.println(infPerson2.getDateOfBirth());                
        // System.out.println(infPerson2.getNationality());

        Person infPerson2 = new Person(infPerson);                   //Copy Constructor;

        infPerson2.setName("Black");                               
        infPerson2.setDateOfBirth("2020.10.10");
        infPerson2.setNationality("Green");

        // infPerson.drive();

        System.out.println(infPerson);


 

    }
    
}
