class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int res=0;
        HashMap<Integer,Integer> map=  new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            res+= nums[i];
            if(map.containsKey(res-k)){
            count+= map.getOrDefault(res-k,0);
            }
            map.put(res,map.getOrDefault(res,0)+1);
        }
        return count;


    }
}