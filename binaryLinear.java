public class binaryLinear {
    public static void main(String[] args) {
        //Declares and initializes the sorted array and the target value
        int nums[] = new int[1000];
        int target = 18;

        //Stores the return value of the binarySearch method in the variable result
        int result = binarySearch(nums, target, 0, nums.length-1);

        //Prints the index of the target value if the value is found
        if (result != -1){
            System.out.println("The index is: " + result);
        }
        
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