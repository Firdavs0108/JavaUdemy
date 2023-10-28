public class ExampleWhileLoop {
    

    public static void main(String[] args) {

        int supposeNumber = 70;

        while(supposeNumber <= 80){
            supposeNumber = randomNum();
            System.out.println(supposeNumber);
        
        }
        // int randomNum = 89;
        // while (randomNum <= 90 ) {
        //     randomNum = generateRandomNumber(); 
        //     System.out.println(randomNum); 
        // }

        
    }


    public static int randomNum(){
       return (int) (Math.random() * 100) + 1;
        
    }

    public static int generateRandomNumber() {
       return (int) (Math.random() * 100) + 1;
    }

}
