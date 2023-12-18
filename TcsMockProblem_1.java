import java.util.Scanner;
public class TcsMockProblem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0 ; i<length ; i++){
            arr[i] = sc.nextInt();
        }     
        int[] sortedarr = sortArray(arr,length);
        for(int i=0 ; i<length ; i++){
            System.out.println(sortedarr[i]);
        }
        int reminder = arr[0];
        int factorial=1;
        int checknum = 1;
        boolean flag = false;
        int flagcheck=0;
        for(int i=1 ; i<length ; i++){
            factorial = factorial *arr[i];
        }
        System.out.println("Factorial is : "+factorial);
        while(true){
            for(int i=1;i<length;i++){
                if(checknum%arr[i]==reminder){
                    flag =true;
                    flagcheck = flagcheck+1;
                }
                else{
                    flag = false;
                }
            }
            if(flagcheck == (length-1)){
                flagcheck = 0;
                checkisPrime(checknum);
                // return;
            }
            checknum = checknum+1;
        }
    }  


    public static void checkisPrime(int num){
        int fact = 0;
        for(int i=1 ; i<=num ; i++){
            if(num%i==0){
                fact = fact+1;
            }
        }
        if(fact == 2){
            System.out.println(num);
            return;
        }
        else{
            System.out.println("None");
            return;
        }
    }


    public static int[] sortArray(int[] arr , int len){
        int temp;
        for(int i =0; i<len;i++){
            for(int j=0 ; j<len ; j++){
                if(arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}




