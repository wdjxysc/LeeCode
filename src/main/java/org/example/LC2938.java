package org.example;

public class LC2938 {
    public static long minimumSteps(String s) {
        long res = 0;
        long count = 0;
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == '0'){
                res += (i-count);
                count++;
            }
        }
        return res;
    }
}
