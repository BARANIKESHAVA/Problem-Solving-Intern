import java.util.Scanner;

public class taxpayer{
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        double income=0.0,firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE;
        
        for(int payer=1;payer<=10;payer++)
        {
            System.out.println("Enter your income :");
            income=scan.nextDouble();
            if(firstMax<income){
                    secondMax=firstMax;
                    firstMax=income;
            }
            else if(secondMax<=income&&income==firstMax)
            {
                secondMax=income;
            }
        }
        System.out.println("the First and the second Tax payers are " +firstMax+ "and"+secondMax);
        scan.close();
    }
}