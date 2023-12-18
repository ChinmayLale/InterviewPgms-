import java.util.Scanner;
public class RomanToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        romanToInt(s);
        sc.close();
    }

    public static int romanToInt(String s) {
        int result =0;
        for(int i=0 ; i<s.length() ; i++){
            System.out.println("Result At Start : "+result);
            if(s.charAt(i)=='I' && (i+1)<=s.length()-1){
                    if(s.charAt(i+1)=='X' ){
                        result = result + 9;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1)=='V'){
                        result = result + 4;
                        i++;
                        continue;
                    }
                    result = result + 1;
            }
            else if(s.charAt(i)=='V'){
                    result = result + 5;
            }
            else if(s.charAt(i)=='X' && (i+1)<=s.length()-1){
                    if(s.charAt(i+1)=='C'){
                        result = result + 90;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1)=='L'){
                        result = result + 40;
                        i++;
                        continue;
                    }
                    result = result + 10;
            }
            else if(s.charAt(i)=='L'){
                    result = result + 50;
            }
            else if(s.charAt(i)=='C' && (i+1)<=s.length()-1){
                    if(s.charAt(i+1)=='D'){
                        result = result + 400;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1)=='M'){
                        result = result + 900 ;
                        i++;
                        continue;
                    }
                    // System.out.println("Result in 'C' is "+result);
                    result = result + 100;
            }
            else if(s.charAt(i)=='D'){
                    result = result + 500;
            }
            else if(s.charAt(i)=='M'){
                    result = result + 1000;
            }
            System.out.println("Result At End of loop "+result);
        }
        
        if(s.charAt(s.length()-1)=='I' && 2>s.length()){
             return ++result; 
        }
        if(s.charAt(s.length()-1)=='X' && 2>s.length()){
             return result=result+10; 
        }
        
        return result;
    }

    
}