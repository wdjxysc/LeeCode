package org.example;

import java.util.Arrays;

public class LC88 {

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
        }else{
            int index1 = m-1;
            int index2 = n-1;
            int resIndex = nums1.length-1;
            while(index1>=0 || index2>=0){
                if(index1<0){
                    nums1[resIndex--] = nums2[index2];
                    index2--;
                    continue;
                }
                if(index2<0){
                    nums1[resIndex--] = nums1[index1];
                    index1--;
                    continue;
                }
                if(nums1[index1]>nums2[index2]){
                    nums1[resIndex--] = nums1[index1];
                    index1--;
                }else if(nums1[index1]<nums2[index2]){
                    nums1[resIndex--] = nums2[index2];
                    index2--;
                }else{
                    nums1[resIndex--] = nums1[index1];
                    nums1[resIndex--] = nums2[index2];
                    index1--;index2--;
                }
            }

        }
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 暴力超时
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums11 = Arrays.copyOf(nums1, m);
        int index1 = 0;
        int index2 = 0;
        int resCount = 0;
        while(index1< nums11.length || index2<nums2.length){
            while(index2<nums2.length){
                if( index1<nums11.length && nums2[index2]>nums11[index1]){
                    nums1[resCount++] = nums11[index1++];
                    break;
                }else if(index1<nums11.length && nums2[index2]==nums11[index1]){
                    nums1[resCount++] = nums11[index1++];
                    nums1[resCount++] = nums2[index2++];
                }else{
                    nums1[resCount++] = nums2[index2++];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{0}, 0, new int[]{4}, 1);
        merge1(new int[]{1,2,3,0,0}, 3, new int[]{4,5}, 2);
        merge1(new int[]{0}, 0, new int[]{1}, 1);
    }
}
