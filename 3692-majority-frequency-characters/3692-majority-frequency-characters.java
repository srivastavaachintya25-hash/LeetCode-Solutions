class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int[] count = new int[s.length() + 1];
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                count[freq[i]]++;
            }
        }
        int bestFreq = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (count[i] > count[bestFreq] ||
                (count[i] == count[bestFreq] && i > bestFreq)) {
                bestFreq = i;
            }
        }
        String ans = "";
        for (int i = 0; i < 26; i++) {
            if (freq[i] == bestFreq) {
                ans += (char)('a' + i);
            }
        }
        return ans;
    }
}