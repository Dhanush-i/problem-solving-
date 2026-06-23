class Solution {
    public int totalFruit(int[] a) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int i=0;
        int ans=0;
        for(int j=0;j<a.length;j++){
            m.put(a[j],m.getOrDefault(a[j],0)+1);
            while(m.size()>2){
                m.put(a[i],m.get(a[i])-1);
                if(m.get(a[i])==0)  m.remove(a[i]);
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}