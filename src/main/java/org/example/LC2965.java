package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName LC2965
 * @Description
 * @Author Administrator
 * @Date 2024/5/31 16:32
 **/
public class LC2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int val = 1;
        int v1 = -1,v2 = -1;
        for(int i = 0;i< grid.length; i++){
            int[] row = grid[i];
            for(int j = 0; j<row.length; j++){
                if(set1.contains(row[j])){
                    v1 = row[j];
                }
                set1.add(row[j]);
                set.add(i*grid.length+j+1);
            }
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(!set1.contains(next)){
                v2 = next;
            }
        }
        return new int[]{v1, v2};
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(new LC2965().findMissingAndRepeatedValues(grid)));
    }
}
