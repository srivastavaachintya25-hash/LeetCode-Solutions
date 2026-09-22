import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        Integer[] arr = set.toArray(new Integer[0]);

        Arrays.sort(arr, Collections.reverseOrder());

        if (arr.length >= 3) {
            return arr[2];
        }

        return arr[0];
    }
}