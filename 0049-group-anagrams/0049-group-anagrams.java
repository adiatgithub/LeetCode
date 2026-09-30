class Solution {
   
        public String sortAlpha(String names){
            char[]ch= names.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
         public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String num: strs){
            String st= sortAlpha(num);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(num);
        }
        return new ArrayList<>(map.values());
    }
}