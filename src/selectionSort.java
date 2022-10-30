public class selectionSort {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {7,8,2,1,3};

        //selection sort
        for(int i=0;i<arr.length;i++){
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
        printarray(arr);
    }
}

