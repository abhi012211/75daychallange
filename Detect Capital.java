class Solution {
    public boolean detectCapitalUse(String word) {
        int small=0;
        int capital=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                small++;
            }else{
                capital++;
            }
        }
        if((capital==1 && (word.charAt(0)>='A' && word.charAt(0)<='Z'))||capital==word.length() || word.length()==1 || capital==0){
            return true;
        }else{
            return false;
        }
    //    int a=0;
    //    int first=0;
    //    int c=0;
    //    for(char ch:word.toCharArray()){
    //        if(ch>=65 && ch<=90){
    //            a++;
    //            if(first==0){
    //                first++;
    //            }
    //        }else{
    //            c++;
    //            if(first==0){
    //                first++;
    //            }
    //        }
    //    }
    //    if(a==0 || first==1 || c==0 && a==1){
    //        return true;
    //    }else{
    //        return false;
    //    }
    }
}
