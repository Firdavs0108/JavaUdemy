public class LoopingDArrays {

    public static void main(String[] args) {

        int [][] loopingArrays = {
           {32,32,34,45},
           {67,67,89,32},
           {78,54,78,78},
        };
        //     System.out.print("Firdavs: ");
        // for (int j = 0; j < loopingArrays[0].length; j++ ){
        //     System.out.print(loopingArrays[0][j] + " ");
        // }
                                                                   //For looping it is not good practice;
        //     System.out.print("\nAli: ");
        // for (int j =0; j< loopingArrays[1].length; j++){
        //     System.out.print(loopingArrays[1][j] + " ");
        // }
        //     System.out.print("\nSanjar: ");
        //     for(int j =0; j< loopingArrays[2].length; j++){
        //     System.out.print(loopingArrays[2][j] + " ");
        // }

                
        for (int i =0; i < loopingArrays.length; i++){

            //  switch(i) {
            //     case 0: System.out.print("Firdavs: "); break;
            //     case 1: System.out.print("Ali: "); break;
            //     case 2: System.out.print("Sanjar: "); break;

            //  }
            
            for(int j = 0; j < loopingArrays[i].length; j++){
                System.out.print(loopingArrays [j][i] + " ");
            }
            System.out.print("\n");



        //     for (int j = 0; j < loopingArrays.length; j++) {  
        //     } 
        //         System.out.println(loopingArrays[i][]);
        }
        
    }
    
}
