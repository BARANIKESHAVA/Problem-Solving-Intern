import java.util.Scanner;

public class missingnumber1 {

    public static boolean isMatched(int[] arr , int temp) {
        for(int hai:arr){
            if (temp==hai)
                return true;
        }
         return false;
    }

    public static void main(String[] args) {
        int [] invoice ={45,91,90,97,99,46};
        int missing = invoice[0];

        for(int each : invoice){
            if (missing>=each) {
                missing=each;              
            }
            while (true) {
                int temp=missing+1;
                System.out.println(temp);
                if (isMatched(invoice, temp)) {
                    System.out.println("Matched");
                    missing=temp;
                }
                else{
                    System.out.println(temp);
                    break;
                }
                
            }
        }
    
        
    }
    
}
