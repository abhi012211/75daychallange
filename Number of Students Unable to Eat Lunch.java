class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count1=0,count2=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                count1++;
            }else{
                count2++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0 && count1==0){
                return count2;
            }else if(sandwiches[i]==1 && count2==0){
                return count1;
            }else if(sandwiches[i]==0){
                count1--;
            }else{
                count2--;
            }
        }
        return 0;
    }
}
