class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String st= cpdomains[i];
            String [] arr= st.split(" "); //Split method: You need to split the string around the space
            String domain= arr[1];

            while(true){
                map.put(domain,map.getOrDefault(domain,0)+ Integer.parseInt(arr[0]));
                int dot= domain.indexOf(".");
                if(dot==-1){
                    break;
                }
                domain= domain.substring(dot+1);
            }
        }
        List<String> ans= new ArrayList<>();

        for(Map.Entry<String,Integer> res:map.entrySet()){
            String curr= res.getValue()+" "+ res.getKey();
            ans.add(curr);
            
        }
        return ans;
        
    }
}