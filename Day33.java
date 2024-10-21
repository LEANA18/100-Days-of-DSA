Maximum Count of Positive Integer and Negative Integer
*****************************************************
Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.
 Can you solve the problem in O(log(n)) time complexity?

Program
*******
class Solution {
    public int maximumCount(int[] nums) {
        int NegativeIndex=LastNegative(nums)+1;
        int PositiveIndex=nums.length-FirstPositive(nums);

        int maximum=Math.max(NegativeIndex,PositiveIndex);
        return maximum;
        
    }
    public int LastNegative(int[] nums){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<0){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return ans;
    }
    public int FirstPositive(int[] nums){
        int start=0;
        int end=nums.length-1;
        int ans=nums.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>0){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}

Example 1:

Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
  
Example 2:

Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
  
Example 3:

Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
