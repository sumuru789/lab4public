import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L2021111862_13_Test {

    @Test
    public void testSortColorsWithEmptyArray() {
        int[] nums = {};
        Solution13 solution = new Solution13();
        solution.sortColors(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    @Test
    public void testSortColorsWithSingleColor() {
        int[] nums = {0, 0, 0, 0};
        Solution13 solution = new Solution13();
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0}, nums);
    }

    @Test
    public void testSortColorsWithMultipleColors() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        Solution13 solution = new Solution13();
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void testSortColorsWithDifferentOrder() {
        int[] nums = {1, 2, 0, 1, 0, 2};
        Solution13 solution = new Solution13();
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }
}

