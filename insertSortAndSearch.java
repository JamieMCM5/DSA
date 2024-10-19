import java.util.*;

public class insertSortAndSearch {
    public static void main(String[] args) {
        int arr[] = {19,452,7,1,4,8,9,3,64,2,1,8,69,54,153};
        int wantedNum = 64;

        int[] newArr = insertionSort(arr);
        int result = binSearch(newArr, wantedNum, 0, arr.length);

        System.out.println("The sorted array is " + Arrays.toString(newArr));
        System.out.println("The index of " + wantedNum + " is " + result);
        
    }

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static int binSearch(int[] arr, int target, int left, int right){
        while (left <= right) {
            int middle = (left + right)/2;
            if (target == arr[middle]) {
                return middle;
            }
            else if(target < arr[middle]){
                return binSearch(arr, target, left, middle - 1);
            }
            else{
                return binSearch(arr, target, middle + 1, right);
            }
        }
        return -1;
    }
}
