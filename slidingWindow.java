/**
 * slidingWindow
*/

import java.util.HashMap;

public class slidingWindow {

    public static void main(String[] args) {
        
        String s = "aaauuuissssooaaaaaaaaaaaaaalllsmkkkajm";
        int k = 2;

        System.out.println("Length of the longest substring with at most " + k + " distinct characters: " + longestDistinct(s, k));

         int[] arr = {0,1,6,13,2,8,4};
         int l = 3;

         System.out.println(maxSum(arr, l));
    }

    public static int maxSum(int[] arr, int k) {
        // Check if k is negative; if so, return -1 as an invalid input
        if (k < 0) return -1;
    
        // Variable to store the sum of the current window
        int windowSum = 0;
        // Variable to keep track of the maximum sum encountered
        int maxSum = 0;
    
        // Calculate the sum of the first 'k' elements to initialize the window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
    
        // Set the initial maximum sum to the sum of the first window
        maxSum = windowSum;
    
        // Slide the window across the array from index k to the end
        for (int i = k; i < arr.length; i++) {
            // Update the window sum by adding the next element and removing the first element of the previous window
            windowSum += arr[i] - arr[i - k];
    
            // Update the maximum sum if the current window sum is greater
            maxSum = Math.max(maxSum, windowSum);
        }
        
        // Return the maximum sum of any subarray of size k
        return maxSum;
    }
    
    
    // Method to find the length of the longest substring with at most k distinct characters
    public static int longestDistinct(String s, int k) {
        // If the string is empty or k is zero, return 0
        if (s.length() == 0 || k == 0) return 0;

        // HashMap to keep track of the count of each character in the current window
        HashMap<Character, Integer> count = new HashMap<>();
        // Initialize left pointer for the window and maxLength to track the longest valid substring
        int left = 0, maxLength = 0;

        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // Current character at the right pointer
            char current = s.charAt(right);
            // Update the count of the current character
            count.put(current, count.getOrDefault(current, 0) + 1);

            // If the number of distinct characters exceeds k, shrink the window from the left
            while (count.size() > k) {
                // Character at the left pointer
                char leftChar = s.charAt(left);
                // Decrease the count of the left character
                count.put(leftChar, count.get(leftChar) - 1);
                
                // If the count of the left character becomes zero, remove it from the map
                if (count.get(leftChar) == 0) {
                    count.remove(leftChar);
                }
                // Move the left pointer to the right to shrink the window
                left++;
            }

            // Update maxLength with the length of the current valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        // Return the maximum length found
        return maxLength;
    }
}
