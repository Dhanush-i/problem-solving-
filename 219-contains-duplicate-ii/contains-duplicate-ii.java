class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(set.contains(a[i]))  return true;
            set.add(a[i]);
            if(set.size()>k)    set.remove(a[i-k]);
        }
        return false;
    }
}