public class Child2 extends Parent {

    private double salary;

    public Child2(String name, int age, String nationality,double salary){
        super(name, age, nationality);
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public void workInfo() {
        System.out.println("Welcome to our service. It is " + getClass().getName().toLowerCase()+  ". For this month your salary is "+ getSalary());
        
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void test() {
        // TODO Auto-generated method stub
        
    } 
    
}
