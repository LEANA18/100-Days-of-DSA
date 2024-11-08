Consecutive Characters
***********************
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

Program
*******
class Solution {
    public int maxPower(String s) {
        int max=1;
        int count=1;

        for(int i=1;i<s.length();i++){

            char current=s.charAt(i);
            char previous=s.charAt(i-1);

            if(current==previous){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
