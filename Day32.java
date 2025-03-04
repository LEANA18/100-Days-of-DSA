 Largest Number
***************
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

Program
********

class Solution {
    public String largestNumber(int[] nums) {
        String[] array=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            array[i]=nums[i]+"";
        }
        Arrays.sort(array,(s1,s2)->(s1+s2).compareTo(s2+s1));

        StringBuilder sb=new StringBuilder("");

        for(int i=array.length-1;i>=0;i--){
            sb.append(array[i]);
        }
        if(sb.charAt(0)=='0'){
            return "0";
        }
        else{
            return sb.toString();
        }
        
    }
}

Example 1:

Input: nums = [10,2]
Output: "210"
  
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
