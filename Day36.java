Average Salary Excluding the Minimum and Maximum Salary
******************************************************
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

Program
*******
class Solution {
    public double average(int[] salary) {
       int max=salary[0];
       int min=salary[0];
       int sum=salary[0];
       for(int i=1;i<salary.length;i++){
        if(max<salary[i]){
            max=salary[i];
        }
        else if(min>salary[i]){
            min=salary[i];
        }
        sum=sum+salary[i];
       }
       sum=sum-min-max;
       double avg=(double)sum/(salary.length-2);
       return avg;
    }
}
/*
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        int count=0;
        for(int i=1;i<salary.length-1;i++)
        {
            sum=sum+salary[i];
            count++;
        }
        double avg=(double)sum/count;
        return avg;
        
    }
}
*/



Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
