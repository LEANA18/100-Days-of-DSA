Matrix Diagonal Sum
*******************
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Program
*******
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j || i+j == length-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}

Example 1:

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
  
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
  
Example 3:

Input: mat = [[5]]
Output: 5
