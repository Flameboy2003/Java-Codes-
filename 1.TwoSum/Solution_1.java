class Solution {
    /**
     * This method finds two indices in the array such that the values at these indices add up to the target.
     * 
     * @param nums the input array of integers
     * @param target the target sum we are trying to find
     * @return an array containing two indices whose values add up to the target
     */
    public int[] twoSum(int[] nums, int target) {
        
        // Iterate over each element in the array
        for (int i = 0; i < nums.length; i++) {
            // For each element at index i, iterate over the remaining elements in the array
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the elements at index i and index j equals the target
                if (nums[i] + nums[j] == target) {
                    // If the sum matches the target, return the indices as a new array
                    return new int[]{i, j};
                }
            }
        }
        
        // If no valid pair is found, return an empty array
        return new int[]{};
    }
}
