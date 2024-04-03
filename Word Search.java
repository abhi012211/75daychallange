class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length,c=board[0].length;
        boolean[][] bool=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0) && result(board,i,j,0,bool,word)){
                    return true;
                }
            }
        }
            return false;
    }
    public boolean result(char[][] board,int i,int j,int indx,boolean[][] bool,String word){
        if(indx==word.length()-1){
            return true;
        }
        bool[i][j]=true;
        int r=board.length,c=board[0].length;
        if(i-1>=0 && !bool[i-1][j] && board[i-1][j]==word.charAt(indx+1) && result(board,i-1,j,indx+1,bool,word)){
            return true;
        }
        if(i+1<=r-1 && !bool[i+1][j] && board[i+1][j]==word.charAt(indx+1) && result(board,i+1,j,indx+1,bool,word)){
            return true;
        }
        if(j-1>=0 && !bool[i][j-1] && board[i][j-1]==word.charAt(indx+1) && result(board,i,j-1,indx+1,bool,word)){
            return true;
        }
        if(j+1<=c-1 && !bool[i][j+1] && board[i][j+1]==word.charAt(indx+1) && result(board,i,j+1,indx+1,bool,word)){
            return true;
        }
        bool[i][j]=false;
        return false;
    }
}
