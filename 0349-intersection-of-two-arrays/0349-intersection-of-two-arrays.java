class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();

        for(int x:nums1){
            set.add(x);
        }

HashSet<Integer> set2=new HashSet<>();
        for(int m:nums2){
            if(set.contains(m)){
                set2.add(m);
            }
        }

int[] result=new int[set2.size()];
int i=0;

for(int x:set2){
    result[i]=x;
    i++;
}
        
return result;
    }
}