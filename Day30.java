Trapping Rain Water
*******************
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Program
******
class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int[] lowerMax=new int[n];
        lowerMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            lowerMax[i]=Math.max(lowerMax[i-1],height[i]);
        }

        int[] upperMax=new int[n];
        upperMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            upperMax[i]=Math.max(upperMax[i+1],height[i]);
        }

        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=Math.min(lowerMax[i],upperMax[i])-height[i];
        }
        return ans;

    }
}

Example 1:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
  
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 
