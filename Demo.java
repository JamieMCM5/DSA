public class Demo {
    public static void main(String[] args) {
        int nums[] = new int[1000];
        int target = 18;

        
        int result2 = binarySearch(nums, target, 0, nums.length-1);

        if (result2 != -1){
            System.out.println("The index is: " + result2);
        }
        
    }

    public static int binarySearch(int[] nums, int target, int startPoint, int endPoint) {
        while (startPoint <= endPoint) {
            
            int midPoint = (startPoint + endPoint)/2;
            if (nums[midPoint] == target) {
                return midPoint;
            }
            else if (target < nums[midPoint])
            {
                return binarySearch(nums, target, startPoint, midPoint -1);
            }
            else {
                return binarySearch(nums, target, midPoint+1, endPoint);
            }
        }
        return -1;
    }
} 