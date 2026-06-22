
class Solution {
    public int numOfSubarrays(int[] a, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++)    sum=sum+a[i];
        int count=0;
        if(sum/k >= threshold)  count++;
        for(int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            if(sum/k >= threshold)  count++;
        }
        return count;
    }
}