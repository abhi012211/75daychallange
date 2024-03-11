class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al=new ArrayList<>();
        int row=matrix.length;
        if(row<1){
            return al;
        }
        int col=matrix[0].length;
        int startR=0;
        int startC=0;
        int i=0;
        while(startR<row && startC<col){
            for(i=startC;i<col;++i){
                al.add(matrix[startR][i]);
            }
            startR++;
            for(i=startR;i<row;++i){
                al.add(matrix[i][col-1]);
            }
            col--;

            if(startR<row){
                for(i=col-1;i>=startC;--i){
                    al.add(matrix[row-1][i]);
                }
                row--;
            }
            if(startC<col){
                for(i=row-1;i>=startR;--i){
                    al.add(matrix[i][startC]);
                }
                startC++;
            }
        }
      return al;
    } 
}
