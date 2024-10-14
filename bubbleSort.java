public class bubbleSort {
    public static void main(String[] args) 
    {
        //Bubble sort, not efficient but simple

        //Declare and initialize variables
        int[] nums = {10,9,8,7,6,5,4,3,2,1};
        int size = nums.length;
        int temp = 0;
        int steps = 0;

            //Print the array before we sort it
            System.out.println("Before sorting");
            for (int num : nums) 
            {
                System.out.print(num + "  ");
            }

            for (int i = 0; i < size; i++) 
            {
                steps++;
                for (int j = 0; j < size - i - 1; j++) 
                {
                    steps++;
                    //If the first value bigger than the second, swap
                    if(nums[j] > nums[j+1])
                    {
                        //Swap the values of nums[j] and nums[j+1]
                        steps++;
                        temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }

            /*Print the array after sorting
             * Print the size of the array we sorted
             * Print the number of steps it took to do so
             */
            System.out.println("");
            System.out.println("After sorting");

            for (int num : nums) 
            {
                System.out.print(num + "  ");
            }
            System.out.println("");
            System.out.println("Size of array: " + size);
            System.out.println("Steps: " + steps);
            

        //Big O of n^2


    }
}
