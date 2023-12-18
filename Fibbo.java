import java.util.*;
//import java.lang.*;
public class Fibbo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int temp=num;
    int finalNum=num;
    double length=0;
    double sum=0;
    while(num!=0)
    {
        length=length+1;
        num=num/10;
    }
    while(temp!=0)
    {
        double digit=temp%10;
        sum=sum+Math.pow(digit,length);
        temp=temp/10;
    }
    if(finalNum==sum)
    {
        System.out.println("Armstrong number");
    }
    else 
        System.out.println("not an armstrong number");
}
    
}