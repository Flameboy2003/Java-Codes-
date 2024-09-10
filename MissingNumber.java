import java.util.Scanner;

public class MissingNumber {
    /*
    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
    Explanation: n = 9 since there are 9 numbers,
    so all numbers are in the range [0,9].
    8 is the missing number in the range since it does not appear in nums.
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

        //All the numbers of nums are unique.

        int[] arr = {0, 1, 2, 3, 4};
        MissingNumber obj = new MissingNumber();

        int result = obj.findMissingNumber(arr);
        System.out.println(result);
    }
}
