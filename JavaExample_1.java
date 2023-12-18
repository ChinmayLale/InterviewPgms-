
import java.util.Scanner;
public class JavaExample_1 {
    public static int digit(int num){
        int sum=0,d;
    while(num!=0)
    {
        d=num%10;
        sum=sum+d;
        num=num/10;
    }
    return sum;
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int d=0,sum=0,finalsum=0;
    int temp=num;
    boolean flag=true;
    sum = digit(num);
    finalsum = digit(sum);
    System.out.println(finalsum+" ");
     while(temp!=0)
    {
        d=temp%10;
        if(finalsum==d)
        {
            flag = true;
            System.out.println("The number is magic number ");
            break;
        }
        else
        {
            flag = false;
        }
            temp=temp/10;
    }
    if(flag==false){
        System.out.println("Not a magical Number ");
    }
}
    
}