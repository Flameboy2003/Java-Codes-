//Question : 268

import java.util.Scanner;

public class MissingNumber {
    /*
Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
Example 2:
Input: nums = [0,1]
Output: 2

Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
     */
    public int findMissingNumber(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        int newSum = 0;
        for (int j = 0; j < nums.length; j++) {
            newSum += nums[j];
        }
        System.out.println(newSum);

        int diff = sum - newSum;
        return diff;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4};
        MissingNumber obj = new MissingNumber();

        int result = obj.findMissingNumber(arr);
        System.out.println(result);
    }
}
