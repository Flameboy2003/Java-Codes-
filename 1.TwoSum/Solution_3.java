import java.util.HashMap;

class Solution {
    /**
     * This method finds two indices in the array such that the values at these indices add up to the target.
     * It uses a HashMap to store the array values and their indices for fast lookups.
     * 
     * @param nums the input array of integers
     * @param target the target sum we are trying to find
     * @return an array containing two indices whose values add up to the target
     */
    public int[] twoSum(int[] nums, int target) {
        
        // HashMap to store the value of the elements as keys and their indices as values
        HashMap<Integer, Integer> map = new HashMap<>();
        int rem = 0;  // Variable to store the remainder when subtracting the current value from the target
        
        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            rem = target - nums[i];  // Calculate the complement (remainder) needed to reach the target
            
            // Check if the complement is already in the HashMap
            if (map.containsKey(rem)) {
                // If found, return the indices of the complement and the current element
                return new int[]{map.get(rem), i};
            } else {
                // If not found, add the current value and its index to the HashMap
                map.put(nums[i], i);
            }
        }
        
        // If no valid pair is found, return an empty array
        return new int[]{};
    }
}
