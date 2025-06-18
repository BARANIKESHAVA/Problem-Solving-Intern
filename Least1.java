import java.util.Scanner;
public class Least1{
    public static void main(String[]args){
        Scanner amount = new Scanner(System.in);
        System.out.println("how many token Distributed:");
        int token = 0, cash=0,least= Integer.MAX_VALUE;
        token=amount.nextInt();
        while(token>0){
            System.out.println("Tell the amount to Deposited");
            cash = amount.nextInt();
            if (cash<=least) {
                least=cash;                
            }
            token--;
        }
        System.out.println("todays least deposit amount is :"+least);
        amount.close();
    }
}