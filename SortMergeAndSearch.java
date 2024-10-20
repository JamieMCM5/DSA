import java.util.*;

public class SortMergeAndSearch {
    public static void main(String[] args) {
        int[] arr = {6,2,6,8,2,1,7,1,3,7,8,53};
        int[] arr2 = {15,76,3,4};
        processArrays(arr, arr2, 76);
    }
    
    public static int[] processArrays(int[] array1, int[] array2, int wanted){
        System.out.println("Initial arrays: " + "\n" + Arrays.toString(array1) + "\n" + Arrays.toString(array2) + "\n");

        array1 = selectionSort(array1);
        array2 = selectionSort(array2);

        System.out.println("Arrays 1 and 2 sorted:\n" + Arrays.toString(array1) + "\n" + Arrays.toString(array2) + "\n");

        array1 = addX(array1, array2);

        System.out.println("Arrays to merge:\n" + Arrays.toString(array1) + "\n" + Arrays.toString(array2));

        array1 = merge(array1, array1.length - array2.length, array2, array2.length);
        
        System.out.println("Merged array:\n" + Arrays.toString(array1) + "\n");

        int result = binarySearch(array1, wanted, 0, array1.length-1);
        
        System.out.println("The index of " + wanted + " is " + "[" + result + "]\n");

        return array1;
    }

    public static int[] addX(int[] initArr, int[] arrToAdd){
        int m = initArr.length;
        int n = arrToAdd.length;
        int[] array = new int[m + n];
        for (int i = 0; i < m; i++) {
            array[i] = initArr[i];
        }
  
        return array;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        int mIndex = m-1;
        int nIndex = n-1;
        int checkIndex = n + m - 1;
        while(nIndex >= 0){
            if(mIndex >= 0 && nums1[mIndex] > nums2[nIndex]){
                nums1[checkIndex] = nums1[mIndex];
                mIndex--;
            }
            else{
                nums1[checkIndex] = nums2[nIndex];
                nIndex--; 
            }
            checkIndex--;
        }
        return nums1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right){
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                return binarySearch(nums, target, left, mid - 1);
            }
            else{
                return binarySearch(nums, target, mid + 1, right);
            }
        }
        return -1;
    }

    public static int[] selectionSort(int[] arr){
        int size = arr.length;
        int minIndex = -1;
        int temp = 0;

        for (int i = 0; i < size-1; i++) 
        {   
            
            minIndex = i;
            for (int j = i+1; j < size; j++) {   
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;   
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
