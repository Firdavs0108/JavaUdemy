
import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        

        String [] staffLastYear = {"Abdulhamid", "AbduMo'min", "Abduhakim"};
        System.out.println( "This is Last year's information:" + Arrays.toString(staffLastYear));

        // String [] staffThisYear = new String[3];  //first way to create new array
        String [] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);  //second way to create and copy new array

        // for (int i = 0; i < staffLastYear.length; i++) {
        //     staffThisYear[i] = staffLastYear[i];                   // first way to copy array;
        // }
        staffThisYear[2] = "Abdumalik";
        System.out.println("This is new year's information:" +Arrays.toString(staffThisYear));
    }
    
}
