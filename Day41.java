Find the Duplicate Number
*************************
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

Program
*********
class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;

        for(int i=0;i<nums.length;i++){

            int element=nums[i];
            element=Math.abs(element);

            if(nums[element]>0){
                nums[element]=-nums[element];
            }
            else{
                ans=element;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        return ans;
      
}
}
/*
Time Complexity=>O(NlogN)
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return nums[i];
            }
        }
        return 0;
    }
}
*/ 

Example 1:
**********
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
**********
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
***********
Input: nums = [3,3,3,3,3]
Output: 3
