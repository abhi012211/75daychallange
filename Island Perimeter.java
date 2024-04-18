class Solution {
    public int islandPerimeter(int[][] grid) {
       int pera=0,row=grid.length,col=grid[0].length;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(grid[i][j]==0){
                continue;
            }
            pera+=4;
            pera-=(i>0 && grid[i-1][j]==1)?2:0;
             pera-=(j>0 && grid[i][j-1]==1)?2:0;
            // pera+=(i==0||grid[i-1][j]==0)?1:0;
            // pera+=(i==row-1||grid[i+1][j]==0)?1:0;
            // pera+=(j==0||grid[i][j-1]==0)?1:0;
            // pera+=(i==col-1||grid[i][j+1]==0)?1:0;
        }
       } 
       return pera;
    }
}
