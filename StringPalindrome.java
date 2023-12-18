import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        String[] arrOfStr = s.split("");
        s.length();
        for (String a : arrOfStr)
            System.out.println(a);
        
    }
}
