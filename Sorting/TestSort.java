package Sorting;

public class TestSort {
    public static void main(String[] args) {
        int[] toBeSorted = new int[]{10, 21, 25, 50, 32, 493, 2, 32, 12, 45};
        MergeSort sortThis = new MergeSort(toBeSorted);
        sortThis.merge(toBeSorted);

        for(int i : toBeSorted){
            System.out.print(i + " ");
        }
    }
}
