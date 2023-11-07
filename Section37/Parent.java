
public abstract class Parent implements Interface {

    private String name;
    private int age;
    private String nationality;

    public Parent(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNationality(){
        return this.nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void exMethod(){
        System.out.println("Hello "+ getName());
    }

    public abstract void workInfo();

   
}