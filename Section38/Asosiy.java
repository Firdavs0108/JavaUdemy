public class Asosiy {

    public static void main(String[] args) {

        Interface inter = new Child();
        inter.test();
        inter.detail();
        String ex = inter.company;
        int age = inter.minAge;
        System.out.println(age);
        System.out.println(ex);
      

        Interface2 inter2 = new Child();
        inter2.run();
        
    }
    
}
