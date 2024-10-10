 Find First and Last Position of Element in Sorted Array
*********************************************************
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


Program
*******
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1, -1};
        if(nums.length==0)
        {
            return ans;
        }
        ans[0]=firstOccurence(nums,target); 
        ans[1]=lastOccurence(nums,target);
        return ans; 
    }
     public int firstOccurence(int[] nums, int target) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid])
            {
                ans=mid;
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
        
    }
    public int lastOccurence(int[] nums, int target) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid])
            {
                ans=mid;
                start=mid+1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
        
    }
}

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
