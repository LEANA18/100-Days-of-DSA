Median of Two Sorted Arrays
****************************
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Program
********
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] arr=Merge(nums1,nums2);
        double median;
        if(arr.length%2==0)
        {
            median=(double)(arr[arr.length/2]+arr[arr.length/2 -1])/2;
        }
        else
        {
            median=(double)(arr[arr.length/2]);
        }

        return median;
    }
    public int[] Merge(int[] nums1,int[] nums2)
    {
        int[] ans=new int[nums1.length+nums2.length];
        int p1=0;
        int p2=0;
        int p3=0;
        while(p1<nums1.length || p2<nums2.length)
        {
            int val1=p1<nums1.length? nums1[p1]:Integer.MAX_VALUE;
            int val2=p2<nums2.length? nums2[p2]:Integer.MAX_VALUE;
            if(val1<val2)
            {
                ans[p3]=val1;
                p1++;
            }
            else
            {
                ans[p3]=val2;
                p2++;
            }
            p3++;
        }
        return ans;

    }
}

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
