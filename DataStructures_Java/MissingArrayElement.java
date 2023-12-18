import java.util.Scanner;
public class MissingArrayElement{
    public static void main(String[]args){
        int [] arr = {1,2,6,5,3,9,8,0};
        System.out.println("The Array is :");
        int count=0;
        for(int i: arr){
        System.out.print(i);
        count = count + 1;
        }
        System.out.println("\nThe Sorted Array is : ");
        int[] s = sort(arr,count);
        for(int i:s){
        System.out.print(i);
        }
        System.out.println("\nMissing Elements Are : ");
        for(int i=0 ; i<count ; i++){
            if(i!=s[i]){
                System.out.println(i);
            }
        }
    }

    public static int[] sort(int[] arr,int count){
        int [] a = arr;
        for(int i = 0 ; i<count ; i++){
            for(int j=0; j<=i ; j++){
                if(a[j]>a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}