class Solution {
    public int[] findXSum(int[] nums, int k, int x) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int start = 0; start <= n - k; start++) {

            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = start; i < start + k; i++) {
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            }

            List<int[]> list = new ArrayList<>();

            for (int key : freq.keySet()) {
                list.add(new int[]{key, freq.get(key)});
            }

            Collections.sort(list, (a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1];
                return b[0] - a[0];
            });

            int sum = 0;

            for (int i = 0; i < Math.min(x, list.size()); i++) {
                sum += list.get(i)[0] * list.get(i)[1];
            }

            ans[start] = sum;
        }

        return ans;
    }
}