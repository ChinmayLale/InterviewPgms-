import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int num2=num;
        int num3=num;
        double sum=0;
        double length=0;
        while(num!=0)
        {
            length=length+1;
            num=num/10;
        }
        while(num2!=0)
        {
            double digit=num2%10;
            sum=sum+Math.pow(digit,length);
            num2=num2/10;
        }
        if(num3==sum)
        {
            System.out.println("Armstrong number");
        }
        else
            System.out.println("Not an Armstrong number");
    }
}
