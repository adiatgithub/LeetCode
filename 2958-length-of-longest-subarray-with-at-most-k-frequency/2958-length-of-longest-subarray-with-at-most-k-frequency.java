class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;
        int res= 0;

        HashMap<Integer,Integer> map= new HashMap<>();
        int longest= Integer.MIN_VALUE;

        while(j<nums.length){
            int num= nums[j];
            map.put(num,map.getOrDefault(num,0)+1);
            res++;
            while(map.get(num)>k){
                int no= nums[i];
                map.put(no,map.getOrDefault(no,0)-1);
                i++;
                res--;
            }
            longest=Math.max(longest,res);
            j++;
        }return longest;
    }
}