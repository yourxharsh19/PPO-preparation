class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean zerorow[]=new boolean[row];
        boolean zerocol[]=new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    zerorow[i]=true;
                    zerocol[j]=true;
                }
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(zerorow[i] ||zerocol[j]){
                    matrix[i][j]=0;
                }
            }
         }
    }
}