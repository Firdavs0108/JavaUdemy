import java.util.Arrays;

public class Person {

   private String name;
   private String nationality;
   private String dateOfBirth;
   private String[] passport;
   private int seatNumber;
   private int comeBackTime;

        public Person(String name, String nationality, String dateOfBirth, int seatNumber, int comeBackTime){
            this.name = name;
            this.nationality = nationality;
            this.dateOfBirth = dateOfBirth;
            this.seatNumber =seatNumber;
            this.comeBackTime = comeBackTime;
        };

        public Person(Person source){
            this.name = source.name;                                  // Now database is       
            this.dateOfBirth = source.dateOfBirth;                    //Copying first constructor
        }




    public String getName() {
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getPassport() {
        return this.passport;
    }

    public void setPassport(String[] passport) {
        this.passport = passport;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getComeBackTime(){
        return comeBackTime;
    }

    public void setComeBackTime(int comeBackTime){
        this.comeBackTime = comeBackTime;
    }

    public void drive(){
        System.out.println("Hello everyone My name is " + name + ". And I am from " + nationality + ".  I was born in " + dateOfBirth + ". Thank you");
    }

    // public String toString(){
    //           return "Name: " + this.name + ".\n" 
    //         +  "Nationality: " + this.nationality + ".\n"
    //         +  "DateofBirth: " + this.dateOfBirth + ".\n"
    //         +  "SeatNumber: " + this.seatNumber + ".\n"
    //         +  "Passport: " + Arrays.toString(passport) + ".\n";
    // }


    @Override
    public String toString() { 
        return "{" +
            " name='" + getName() + "'" +
            ", nationality='" + getNationality() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", passport='" + getPassport() + "'" +
            ", seatNumber='" + getSeatNumber() + "'" +
            ", comeBackTime='" + getComeBackTime() + "'" +
            "}";
    }
   
   
}
