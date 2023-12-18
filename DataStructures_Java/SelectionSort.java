public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,5,4,1,7,6,9,8};
        for(int i=0 ; i<arr.length-1 ; i++){
            printArray(arr); 
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] array){
        for(int i=0 ; i<array.length ;i++ ){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
