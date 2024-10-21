import java.util.*;

public class insertSortAndSearch {
    public static void main(String[] args) {
        int arr[] = {19,452,7,1,4,8,9,3,64,2,1,8,69,54,153};
        int wantedNum = 64;

        int[] newArr = insertionSort(arr);
        int result = binarySearch(newArr, wantedNum, 0, arr.length);

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

    public static int binarySearch(int[] nums, int target, int startPoint, int endPoint) {
        
        //Code runs while we have 2 points in the array
        while (startPoint <= endPoint) {
            
            //Stores midpoint as startPoint + endPoint / 2, finding the middle of the array
            int midPoint = (startPoint + endPoint)/2;

            //If target value is found, return it 
            if (nums[midPoint] == target) 
                return midPoint;

            /*If target value is less than the value at the mid point, run the method again
              but change the end point to the mid point, halving the array*/
            //This makes the method recursive
            else if (target < nums[midPoint])
                return binarySearch(nums, target, startPoint, midPoint -1);
            //As above, vice versa
            else
                return binarySearch(nums, target, midPoint+1, endPoint);
        }
        //If target value is not found, return -1
        return -1;
    }
}
