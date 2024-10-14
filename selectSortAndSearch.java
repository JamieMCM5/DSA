/**
 * selectSortAndSearch
 */
public class selectSortAndSearch {

    public static void main(String[] args) {
        int[] nums = {0,1,7,3,67,9,45,3,1,4,6,8,9,5,23,2};
        int target = 7;

        int[] newnums = selectSort(nums);
        int result = binarySearch(newnums, target, 0, newnums.length-1);
        System.out.println("");

        if (result != -1) 
        {
        System.out.println("The index is: " + result);

        }
        else
        {
            System.out.println("Element " + target + " not found");
        }
    }

    public static int binarySearch(int[] arr, int target, int left, int right)
    {
        //Code runs while we have 2 points in the array
        while (left <= right) 
        {
              //Stores midpoint as startPoint + endPoint / 2, finding the middle of the array
            int mid = (left + right)/2;
              //If target value is found, return it    
            if (target == arr[mid]) 
                return mid;
            /*If target value is less than the value at the mid point, run the method again
              but change the end point to the mid point, halving the array*/
              //This makes the method recursive
            else if(target > arr[mid])
                return binarySearch(arr, target, mid + 1, right);
              //As above, vice versa
            else
                return binarySearch(arr, target, left, mid - 1);
            
        }
        //If target value is not found, return -1
        return -1;
        
        //Time complexity: Big O of log2n
    }

    public static int[] selectSort(int[] arr){
        int temp = 0;
        int minIndex = 0;
        int size = arr.length;

         //Print the array before we sort it
         System.out.println("Before min sorting");
         for (int num : arr) 
         {
             System.out.print(num + "  ");
         }
        //For elements (i) in array, set min index to i
        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            //For the second element (i+1), check if its smaller than the current minIndex
            //If so, J is the new minIndex
            for (int j = i+1; j < size; j++) {
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            //Swap the current value with the minIndex
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("");
        System.out.println("After min sorting");

        for (int num : arr) 
        {
            System.out.print(num + "  ");
        }
        System.out.println("");
        System.out.println("Size of array: " + size);
        System.out.println();


        return arr;
        //Time complexity: Big O of n^2 (Nested loops)
    }
}