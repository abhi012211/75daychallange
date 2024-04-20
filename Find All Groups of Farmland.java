class Solution {
    public int[][] findFarmland(int[][] land) {
     int n=land.length,m=land[0].length;

     List<int[]> result=new ArrayList<>();

     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(land[i][j]==1){
                int k=i,l=j;
                for(k=i;k<n && land[k][j]==1;k++){
                    for(l=j;l<m && land[k][l]==1;l++){
                        land[k][l]=0;
                    }
                }
                result.add(new int[]{i,j,k-1,l-1});
            }
        }
     }  
     return result.toArray(new int[result.size()][]); 
    }
}
