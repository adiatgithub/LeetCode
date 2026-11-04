class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int cnt1 = 0;
        for(int i = 0; i < s.length(); i++) if(s.charAt(i) == '1') cnt1++;
        boolean[] ans = new boolean[strs.length];

        for(int x = 0; x < strs.length; x++) {
            String cur = strs[x];
            // this is cur string
            // check non matching one's
            int n0 = 0, n1 = 0, wild = 0;
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i++) {
                char c = cur.charAt(i);
                str.append(c);
                if(c == '1') n1++;
                if(c == '?') wild++;
            }

            // first match cnt of 1's 0's should match
            // required one's
            int req1 = cnt1 - n1;
            if(req1 < 0 || req1 > wild) {
                // not possible
                continue;
            }
            // Now all 1's should be in right side
            for(int i = str.length() - 1; i >= 0; i--) {
                if(str.charAt(i) == '?') {
                    if(req1-- > 0) str.setCharAt(i, '1');
                    else str.setCharAt(i, '0');
                }
            }
            ans[x] = true;
            // Now what? At any index of s & strs count of prefix should be same ??
            int s1 = 0, t1 = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1') s1++;
                if(str.charAt(i) == '1') t1++;

                // Now in target count of 1 should nto be greater
                if(t1 > s1) {
                    ans[x] = false;
                    break;
                }
            }
        }
        return ans;
    }
}