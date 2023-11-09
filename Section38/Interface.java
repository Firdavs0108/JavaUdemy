public interface Interface {

    int minAge = 19;
    String company =  "O'qi bilim ol kompaniyasi";

    void test();

    default void detail(){
        System.out.println("For checking");
    }

   public static String info(){
        return "For checking";
    }
    
}
