package org.example;

/**
 * 2928. 给小朋友们分糖果 I
 * 简单
 * 给你两个正整数 n 和 limit 。
 * 请你将 n 颗糖果分给 3 位小朋友，确保没有任何小朋友得到超过 limit 颗糖果，请你返回满足此条件下的 总方案数 。
 */
public class LC2928 {
    public static int distributeCandies(int n, int limit) {
        int count = 0;
        for(int i = 0; i <= limit; i++){
            for(int j = 0; j <= limit && j <= n - i; j++){
                if(n - j - i <= limit){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = distributeCandies(5, 2);
        System.out.println(i);
    }
}
