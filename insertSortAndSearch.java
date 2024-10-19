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

        //Declare standard variables
        int n = arr.length;

        //Iterate over arr, starting from index 1, set the key to the current value, and
        //set j to the index behind the current index
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;

            //While the value of index j is greater than the key
            while (j>=0 && arr[j] > key) {
                
                //Shift the value of arr[j] to the next index
                arr[j+1] = arr[j];
                j--;
            }
            //Make the key be the value of the index j+1;
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
