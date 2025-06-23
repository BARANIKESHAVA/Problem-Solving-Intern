import java.lang.reflect.Array;
import java.util.Arrays;

public class maiden {
    public static void main(String[] args) {
        int [] ball={20,0,19,5,0,3,10,0,2};
        int index=0,valid=0,size=ball.length;

        while (index<size) {
            if (ball[index]!=0) {
                ball[valid]=ball[index];
                valid++;
            }   
            index++;
        }
            Arrays.fill(ball, valid,size,0);
            System.out.println(Arrays.toString(ball));
    }
    
}
