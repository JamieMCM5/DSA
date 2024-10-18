/**
 * Hashmaps
 */

import java.util.*;
public class Hashmaps {

    public static void main(String[] args) {
        int[] numbers = {1,1,2,4,5,6};
        //twoSum
        int target = 2;
        System.out.println("Two Sum answer is: " + Arrays.toString(twoSum(numbers, target)));
        //Occurrences
        HashMap<Integer, Integer> occurrences = countOccurences(numbers);
        System.out.println(occurrences);
        //UniqueChar
        String s = "aabbccdde";
        System.out.println(uniqueChar(s));
    }

    public static int[] twoSum(int[] nums, int target){
        //Declare variables. complement is important, it is the number that equals the target - nums[i].
        int n = nums.length;
        int complement = 0;
        //Declare the hashmap of type int, int to store the value at the current index, nums[i], and the current index.
        Map<Integer, Integer> map = new HashMap<>();
        //Iterate over nums and check if the hashmap contains the key of complement.
        for (int i = 0; i < n; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) 
            {
                    //If so, return the current index, and the value of complement
                    //(Which is the index at which it was found).
                    return new int[]{map.get(complement), i};
            }
            //If not, add the value at index i and the current index to the hashmap, to
            //later compare it for the complement.
            map.put(nums[i], i);
        }
        //If there is no 2 indices that when summed = target, return an empty array.
        return new int[]{};
    }

    public static HashMap<Integer, Integer> countOccurences(int[] nums){
        //Declare the hashmap of type int, int to store the value at the current index, nums[i], and
        //the count of said value.
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        //Iterate over nums and add an entry to map
        for (int i = 0; i < n; i++) {
            //Adds the key of the int at the current index, and adds
            //1 to the current value of said key. Basically increments the count.
            map.merge(nums[i], 1, Integer :: sum);
        }
        //Returns map
        return map;
    }

    public static int uniqueChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.merge(c, 1, Integer :: sum);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    
}