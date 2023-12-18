import java.util.Scanner;
public class NumberSumTest {

    public static int checkAddition(int num){
        int sum = 0,dig;
        while (num!=0) {
            dig = num%10;
            sum = sum+dig;
            num = num/10;
        }
        if(sum/10!=0){
            sum = checkAddition(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");
        int number = sc.nextInt();
        sc.close();
        int numbercopi = number;
        int sum1 = checkAddition(numbercopi);
        if(number ==0){
            System.out.println("true");
            return;
        }
        while(number !=0){
            if(number%10 == sum1){
                System.out.println("True");
                return;
            }
            else{
                number = number /10;
            }
        }
        System.out.println("False");
        
}
    
}