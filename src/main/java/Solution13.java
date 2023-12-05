class Solution13 {
    public void sortColors(int[] nums) {
        int n = nums.length; // 修改为 length 而不是 length()
        int ptr = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) { // 修改为 nums[i] 而不是 nums(i)
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) { // 修复循环语句格式错误
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }
}
