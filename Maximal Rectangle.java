class Solution {
    public int maximalRectangle(char[][] matrix) {
      if(matrix.length==0 || matrix==null || matrix[0].length==0){
        return 0;
      }  
      int ans=0;
      int n=matrix[0].length;
      int[] arr=new int[matrix[0].length];
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]=='1'){
                arr[j]+=1;
            }else{
                arr[j]=0;
            }
        }
        int cur=largRec(arr);
        ans=Math.max(ans,cur);
      }

    //   for(char[] row:matrix){
    //     for(int i=0;i<row.length;i++){
    //         arr[i]=row[i]=='0'?0:arr[i]+1;
    //         ans=Math.max(ans,largRec(arr));
    //     }
    //   }
      return ans;
    }
    private int largRec(int[] height){
        // int result=0;
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Deque<Integer> de=new ArrayDeque<>();
          for (int i = 0; i < n; i++) {
            while (!de.isEmpty() && height[de.peek()] >= height[i]) {
                de.pop();
            }
            left[i] = de.isEmpty() ? 0 : de.peek() + 1;
            de.push(i);
        }
        de.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!de.isEmpty() && height[de.peek()] >= height[i]) {
                de.pop();
            }
            right[i] = de.isEmpty() ? n - 1 : de.peek() - 1;
            de.push(i);
        }
        int maxa=0;
        for(int i=0;i<n;i++){
            maxa=Math.max(maxa,height[i]*(right[i]-left[i]+1));
        }
        return maxa;
    }
}
