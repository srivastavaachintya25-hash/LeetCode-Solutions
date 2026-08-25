class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        int[] freq = new int[10001];

        int left = 0;
        int sum = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {

            freq[nums[right]]++;
            sum += nums[right];

            while (freq[nums[right]] > 1) {
                freq[nums[left]]--;
                sum -= nums[left];
                left++;
            }

            answer = Math.max(answer, sum);
        }

        return answer;
    }
}