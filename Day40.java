Longest Consecutive Sequence
****************************
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Program
*******
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],false);
        }
      //to find 1st element in the sequence
        for(int key:hm.keySet()){
            if(hm.containsKey(key-1)==false){
                hm.put(key,true);
            }
        }
      // to find the remaining elements in the sequence
        int max=0;
        for(int key:hm.keySet()){
            int k=0;
            if(hm.get(key)==true){
                while(hm.containsKey(key+k)==true){
                    k++;
                }
            }
            max=Math.max(k,max);

        }
      // returns length of the sequence
        return max;
        
    }
}

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
