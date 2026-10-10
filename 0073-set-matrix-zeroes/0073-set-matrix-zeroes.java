class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean zerorow[]=new boolean[matrix.length];
        boolean zerocol[]=new boolean[matrix[0].length];
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
                if(zerorow[i] || zerocol[j]){
                    matrix[i][j]=0;
                }
            }
         }
    }
}