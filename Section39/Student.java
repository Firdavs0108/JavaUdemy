public class Student extends Person{

    public void setInfo(String name, String surname){
        super.name = name;
        super.surname = surname;

    }

    public void showInf(){
        System.out.println(super.name + " " + super.surname);
    }

    @Override
    public void intro() {
       System.out.println("Hello world");
        
    }

    @Override
    public void setInfoAb() {
        super.setInfoAb();
    }


    
}
