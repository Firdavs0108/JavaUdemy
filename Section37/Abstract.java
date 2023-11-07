public class Abstract {

    public static void main(String[] args) {
        
        Child user = new Child("Firdavs", 22, "Uzbek", 123.12);
        user.exMethod();
        user.workInfo();

        Child2 user2 = new Child2("Ali", 23, "Uzbek", 1111.1);
        user2.exMethod();
        user2.workInfo();
    }
    
}
