package com.jason.algorithm;

/**
 * @author Jason
 * @Desc 数组中重复的数字
 * @Detail 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重
 * 复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * @idea 要求时间复杂度 O(N)，空间复杂度 O(1)。因此不能使用排序的方法，也不能使用额外的标记数组。
 * 对于这种数组元素在 [0, n-1] 范围内的问题，可以将值为 i 的元素调整到第 i 个位置上进行求解。
 * 以 (2, 3, 1, 0, 2, 5) 为例，遍历到位置 4 时，该位置上的数为 2，但是第 2 个位置上已经有一个 2 的值了，因此可以
 * 知道 2 重复：
 */
public class Duplicate {
    public static boolean duplicate(int[] array, int length, int[] duplicate) {
        if (array == null || length < 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (array[i] != i) {
                if (array[i] == array[array[i]]) {
                    duplicate[0] = array[i];
                    return true;
                }
                swap(array, i, array[i]);
            }
        }
        return false;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 2, 5};
        int[] duplicate = new int[6];
        duplicate(array, array.length, duplicate);
        System.out.println(duplicate[0]);
    }

}
