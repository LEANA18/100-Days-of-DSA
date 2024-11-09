Valid Palindrome
***************
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Program
*******
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else if(ch>='A' && ch<='Z'){
                ch=(char)(ch-'A'+'a');
                sb.append(ch);
            }
            else if(ch>='0'&&ch<='9'){
                sb.append(ch);
            }
        }

        int start=0;
        int end=sb.length()-1;
        while(start<end){
            int schar=sb.charAt(start);
            int echar=sb.charAt(end);

            if(schar!=echar){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
