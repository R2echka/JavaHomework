import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1 задание
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        float[] nums2 = {1.57f, 7.654f, 9.986f};

        int[] nums3 = {34, 714138};

        // 2 задание
        for (int i = 0; i < 3; i ++) {
            if (i < 2) System.out.print(nums[i] + ", ");
            else System.out.print(nums[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i ++) {
            if (i < 2) System.out.print(nums2[i] + ", ");
            else System.out.print(nums2[i]);
        }
        System.out.println();
        for (int i = 0; i < 2; i ++) {
            if (i < 1) System.out.print(nums3[i] + ", ");
            else System.out.print(nums3[i]);
        }
        System.out.println();

        // 3 задание
        System.out.println();
        for (int i = 2; i >= 0; i --) {
            if (i > 0) System.out.print(nums[i] + ", ");
            else System.out.print(nums[i]);
        }
        System.out.println();
        for (int i = 2; i >= 0; i --) {
            if (i > 0) System.out.print(nums2[i] + ", ");
            else System.out.print(nums2[i]);
        }
        System.out.println();
        for (int i = 1; i >= 0; i --) {
            if (i > 0) System.out.print(nums3[i] + ", ");
            else System.out.print(nums3[i]);
        }
        System.out.println();

        // 4 задание
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) nums[i] ++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
