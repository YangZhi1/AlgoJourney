public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 23, 45, 64, 2, 4, 1, 30, 2, 12, 46};
        for(int index = 0; index  < arr.length-1; index++){
            System.out.print(arr[index] + ", ");
        }
        System.out.println(arr[arr.length-1]);
        arr = heapSort(arr);

        for(int index = 0; index  < arr.length-1; index++){
            System.out.print(arr[index] + ", ");
        }
        System.out.println(arr[arr.length-1]);
    }

    public static int[] maxHeapify(int[] group, int size, int index){
        int current = group[index];
        boolean leftChildValid = true;
        boolean rightChildValid = true;
        int leftChild = 0;
        int rightChild = 0;

        if(index * 2 + 1 < size){
            leftChildValid = true;
            leftChild = group[index * 2 + 1];
        }
        else{
            leftChildValid = false;
        }

        if(index * 2 + 2 < size){
            rightChildValid = true;
            rightChild = group[index * 2 + 2];
        }
        int largest = Math.max(Math.max(leftChild, rightChild), current);
        int newIndex = index;

        if(index * 2 + 1 <= group.length && leftChild == largest){
            newIndex = index*2 + 1;
        }

        if(index * 2 + 2 <= group.length && rightChild == largest){
            newIndex = index*2 + 2;
        }
        if(newIndex != index){
            group[index] = largest;
            group[newIndex] = current;
            maxHeapify(group, size, newIndex);
        }
        return group;
    }

    public static int[] buildMaxHeap(int[] group){
        for(int i = Math.floorDiv(group.length, 2); i >= 0; i--){
            maxHeapify(group, group.length-1, i);
        }
        return group;
    }

    public static int[] heapSort(int[] group){
        buildMaxHeap(group);        // turn this array into a max heap
        for(int i = group.length-1; i >= 0; i--){
            int temp = group[0];
            group[0] = group[i];
            group[i] = temp;

            maxHeapify(group, i, 0);
        }
        return group;
    }
}
