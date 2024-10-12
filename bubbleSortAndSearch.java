//Learning to combine sorting and searching algorithms

public class bubbleSortAndSearch 
{
    public static void main(String[] args) 
    {
        int[] nums = {0,1,7,3,67,9,45,3,1,4,6,8,9,5,23,2};
        int target = 7;

        int[] newnums = bubbleSort(nums);
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

    public static int[] bubbleSort(int[] arr)
    {
        //Bubble sort, not efficient but simple

        int temp = 0;
        int size = arr.length;
        
            //Print the array before we sort it
            System.out.println("Before sorting");
            for (int num : arr) 
            {
                System.out.print(num + "  ");
            }

            for (int i = 0; i < size; i++) 
            {
                for (int j = 0; j < size - i - 1; j++) 
                {
                    //If the first value bigger than the second, swap
                    if(arr[j] > arr[j+1])
                    {
                        //Swap the values of nums[j] and nums[j+1]
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            /*Print the array after sorting
             *Print the size of the array we sorted*/
             
            System.out.println("");
            System.out.println("After sorting");

            for (int num : arr) 
            {
                System.out.print(num + "  ");
            }
            System.out.println("");
            System.out.println("Size of array: " + size);
            return arr;
            
        //Time complexity: Big O of n^2
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

}
