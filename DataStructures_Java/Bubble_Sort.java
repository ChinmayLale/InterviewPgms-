// import java.util.*;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {3,4,7,2,1,8,5};
        
        //bubblesort
        for(int i=0 ; i<arr.length-1; i++){
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);

    }

    public static void printArray(int[] array){
        for(int i=0 ; i<array.length ;i++ ){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}