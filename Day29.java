Maximum Subarray
****************
Given an integer array nums, find the  subarray with the largest sum, and return its sum.

Program
********
class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        int currentSum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentSum+nums[i]>nums[i]){
                currentSum=currentSum+nums[i];
            }
            else{
                currentSum=nums[i];
            }
            max=Math.max(currentSum,max);
        }
        return max;
        
    }
}

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
