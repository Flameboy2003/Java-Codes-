
/*
Question:
Write a Java program to determine the maximum profit that can be achieved from a given array of stock prices.
The program should read the length of the array and its elements from the user, 
then find the maximum profit that can be made by buying on one day and selling on another day in the future.


Example:

Enter the length of the array:
6
Enter the Array Elements:
7 1 5 3 6 4

The program should output:
Maximum Profit: 5
*/


import java.util.*;

class BuyAndSell {

    public void findProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = prices[i] - minPrice;
                if (maxProfit < profit) {
                    maxProfit = profit;
                }
            }
        }
        
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int length = sc.nextInt();

        System.out.println("Enter the Array Elements:");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        BuyAndSell obj = new BuyAndSell();
        obj.findProfit(arr);
    }
}
