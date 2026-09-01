import java.util.HashMap;
import java.util.Map;
class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : nums) {
            if (freqMap.containsKey(num - k)) {
                count += freqMap.get(num - k);
            }
            if (freqMap.containsKey(num + k)) {
                count += freqMap.get(num + k);
            }            
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}