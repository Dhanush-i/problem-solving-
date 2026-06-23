class Solution {
    public int minSubArrayLen(int target, int[] a) {
        int i = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int j = 0; j<a.length; j++){
            sum = sum + a[j];
            while (sum>= target){
                minlen=Math.min(minlen, j-i+1);
                sum = sum -a[i];
                i++;
            }
        }
        if (minlen == Integer.MAX_VALUE) return 0;
        return minlen;
    }
}