class Solution {
    public static void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[j][n-i-1];
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        rotate(matrix);
    }
}