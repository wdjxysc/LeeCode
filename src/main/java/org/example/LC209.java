package org.example;

/**
 * 209.长度最小的子数组
 */
public class LC209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
        System.out.println(minSubArrayLen1(11, new int[]{1, 1,1,1,1,1,1,1}));
    }

    /**
     * 暴力解法
     * 超时
     * @param target
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = 0;
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j = i; j<nums.length; j++){
                sum += nums[j];
                if(sum == target){
                    if(minLen == 0 || minLen>j-i+1){
                        minLen = j-i+1;
                    }
                    break;
                }else if(sum > target){
                    break;
                }
            }
        }
        return minLen;
    }

    /**
     * 滑动窗口
     * @param target
     * @param nums
     * @return
     */
    public static int minSubArrayLen1(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int lo = 0, hi = 0;
        int sum = 0;
        while(hi<nums.length){
            sum += nums[hi++];
            while(sum >= target){
                minLen = Math.min(minLen, hi - lo);
                sum -= nums[lo++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
