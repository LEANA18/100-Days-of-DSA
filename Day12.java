Squares of a Sorted Array
**********************
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Program
*******
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int ptr=ans.length-1;
        while(start<=end)
        {
            int startsq=nums[start]*nums[start];
            int endsq=nums[end]*nums[end];
            if(startsq>endsq)
            {
                ans[ptr]=startsq;
                start++;
            }
            else
            {
                ans[ptr]=endsq;
                end--;
            }
            ptr--;

        }
        return ans;
        
    }
}

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
  
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
