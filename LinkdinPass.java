import java.util.*;
public class LinkdinPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur String");
        String pass = sc.nextLine();
        StringBuilder inp = new StringBuilder(pass);
        inp.reverse();
        pass = inp.toString();
        System.out.println("Reve Str : "+inp);
        int x = inp.length();
        System.out.println("Length : "+x);
        int i = 0;
        sc.close();
        while(i<x){
            int temp = Integer.parseInt(pass.substring(i,i+2));
            if(temp == 32){
                System.out.print(" ");
            }
            else if(temp>=65 && temp<=90 || temp>=97 && temp<100){
                char c = (char)temp;
                System.out.print(c);
            }
            else if(temp<65){
                temp = Integer.parseInt(pass.substring(i,i+3));
                char c = (char)temp;
                System.out.print(c);
                i++;
            }
            i = i+2;
        }
    }
}