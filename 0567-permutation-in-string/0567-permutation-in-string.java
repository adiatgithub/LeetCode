class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int k = s1.length();

        while (j < s2.length()) {
            char ch = s2.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (j - i + 1 == k) {

                boolean permutation = true;

                for (int num : map.values()) {
                    if (num != 0) {
                        permutation = false;
                        break;
                    }
                }

                if (permutation) {
                    return true;
                }
                char left = s2.charAt(i);

                map.put(
                    left,
                    map.getOrDefault(left, 0) + 1
                );

                i++;
            }

            j++;
        }

        return false;
    }
}