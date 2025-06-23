import java.util.Arrays;

public class IRCTC {

    public static void main(String[] args) {
        int[]   ticket={1,2,0,1,2,0,2,0};
        int start=0, current=0,end=ticket.length-1;
        while (current<=end) {
            if(ticket[current]==0){
            ticket[start]+=ticket[current];
            ticket[current]=ticket[start]-ticket[current];
            ticket[start]-=ticket[current];
            start++;
            current++; 
            }
            else if(ticket[current]==1){
                current++;
            }       
            else{
                ticket[end]+=ticket[current];
                ticket[current]=ticket[end]-ticket[current];
                ticket[end]-=ticket[current];
                end--;
            }    
        }
        System.out.println(Arrays.toString(ticket));
    }
}