class Solution {
    /**
     * This method finds two indices in the array such that the values at these indices add up to the target.
     * It does this by iterating over each element, calculating its complement, and checking if the complement exists in the rest of the array.
     * 
     * @param nums the input array of integers
     * @param target the target sum we are trying to find
     * @return an array containing two indices whose values add up to the target
     */
    public int[] twoSum(int[] nums, int target) {
        
        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement by subtracting the current element from the target
            int complement = target - nums[i];
            
            // For each element at index i, iterate over the remaining elements in the array
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the complement matches any of the remaining elements
                if (complement == nums[j]) {
                    // If a match is found, return the indices of the current element and the complement
                    return new int[]{i, j};
                }
            }
        }
        
        // If no valid pair is found, return an empty array
        return new int[]{};
    }
}
