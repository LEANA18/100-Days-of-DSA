 Remove Duplicate Letters
************************
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
the smallest in lexicographical order
 among all possible results.

 Smallest in Lexographical order
*****************************
Lexicographically Smaller
A string a is lexicographically smaller than a string b if in the first position where a and b differ, string a has a letter that 
appears earlier in the alphabet than the corresponding letter in b.
If the first min(a.length, b.length) characters do not differ, then the shorter string is the lexicographically smaller one.


Program
*******
class Solution {
    public String removeDuplicateLetters(String s) {
        int lastIndex[]=new int[26];
        //by default all 26 are set to 0
        //adding last index of each character in the String to lastIndex[] array
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=(int)(ch-'a');
            lastIndex[index]=i;
        }

        boolean present[]=new boolean[26];
        //by default all 26 are false
        Stack<Character> st=new Stack<>();
        // Stack st of type character is created
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=(int)(ch-'a');

            if(present[index]==false){
                while(st.size()>0 && st.peek()>ch && lastIndex[(int)(st.peek()-'a')]>i){
                    present[(int)(st.peek()-'a')]=false;
                    st.pop();
                }
                st.push(ch);
                present[index]=true;
            }
        }
        // to return value in string -> use StringBuilder
        StringBuilder sb = new StringBuilder("");
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.reverse().toString();

    }
}


Example 1:

Input: s = "bcabc"
Output: "abc"

Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
