package Sorting;

public class MergeSort {
    private int[] arr;

    MergeSort(int[] arr){
        this.arr = arr;
    }

    public void merge(int[] arr){
        if(arr.length == 1){
            return;
        }

        int mid = Math.floorDiv(arr.length, 2);

        // split the array up to 2
        int[] Left = new int[mid];
        int[] Right = new int[arr.length - mid];

        // copy the array into the 2 new arrays, Left and Right
        for(int i = 0; i < mid; i++){
            Left[i] = arr[i];
        }
        for(int j = mid, k = 0; j < arr.length; j++, k++){
            Right[k] = arr[j];
        }

        merge(Left);
        merge(Right);

        int i = 0, j = 0, k = 0;
        // Rewriting the array
        while(i < Left.length && j < Right.length){
            if(Left[i] < Right[j]){
                arr[k] = Left[i];
                i++;
            } else{
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        // Check if there is any element left
        while(i < Left.length){
            arr[k] = Left[i];
            i++;
            k++;
        }
        while(j < Right.length){
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
}
