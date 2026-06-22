class Solution {
    public double findMaxAverage(int[] a, int k) {
        int sum=0;
        for(int i=0;i<k;i++)    sum=sum+a[i];
        int maxS=sum;
        for(int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            maxS=Math.max(sum,maxS);
        }
        return (double) maxS/k;
    }
}
