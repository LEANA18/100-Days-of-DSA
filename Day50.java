Redistribute Characters to Make All Strings Equal
************************************************
You are given an array of strings words (0-indexed).

In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].

Return true if you can make every string in words equal using any number of operations, and false otherwise.


Program
*******
class Solution {
    public boolean makeEqual(String[] words) {
        int[] frequency = new int[26];

        for(int i=0;i<words.length;i++){
            String word = words[i];
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                int index=(int)(ch-'a');
                frequency[index]=frequency[index]+1;
            }
        }
        for(int i=0;i<26;i++){
            if(frequency[i]%words.length!=0){
                return false;
            }
        }
        return true;
    }
}

Example 1:

Input: words = ["abc","aabc","bc"]
Output: true
Explanation: Move the first 'a' in words[1] to the front of words[2],
to make words[1] = "abc" and words[2] = "abc".
All the strings are now equal to "abc", so return true.

Example 2:

Input: words = ["ab","a"]
Output: false
Explanation: It is impossible to make all the strings equal using the operation.
