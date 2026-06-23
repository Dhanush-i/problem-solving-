class Solution {
    public int longestOnes(int[] a, int k) {
        int i =0;
        int zeros=0;
        int maxc = 0;
        for(int j=0;j<a.length;j++){
            if(a[j]==0) zeros++;
            while(zeros>k){
                if(a[i]==0) zeros--;
                i++;
            }
            maxc=Math.max(j-i+1,maxc);
        }
        return maxc;
        
        
    }
}