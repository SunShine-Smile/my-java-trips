package com.jason.algorithm;

/**
 * 统计两个数的二进制表示有多少位不同
 *
 * @author Jason
 * @date 2019年7月22日 下午2:58:29
 */
public class HammingDistance {

    /**
     * 使用 Integer.bitCount
     *
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance1(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    /**
     * 对两个数进行异或操作，位级表示不同的那一位为 1，统计有多少个 1 即可。
     *
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance2(int x, int y) {
        int z = x ^ y;
        // z == 0 说明两个数一样
        int cnt = 0;
        while (z != 0) {
            if ((z & 1) == 1) {
                cnt++;
            }
            z = z >> 1;
        }
        return cnt;
    }

    /**
     * 使用 z&(z-1) 去除 z 位级表示最低的那一位。
     * 原理：n&(n-1) 去除 n 的位级表示中最低的那一位。例如对于二进制表示 10110100，减去 1 得到 10110011，这两个
     * 数相与得到 10110000。
     *
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance3(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            z &= (z - 1);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println("结果是：" + hammingDistance1(1, 4));
        System.out.println("结果是：" + hammingDistance2(1, 4));
        System.out.println("结果是：" + hammingDistance3(1, 4));
    }
}
