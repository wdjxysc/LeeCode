package org.example.hwod;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 字符串重新排列、字符串重新排序
 */
public class HWOD100_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        arr = Arrays.stream(arr).map(item -> {
            char[] cArr = item.toCharArray();
            Arrays.sort(cArr);
            return new String(cArr);
        }).toArray(String[]::new);
        HashMap<String, Integer> count = new HashMap<>();
        for(String s : arr){
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        Arrays.sort(arr, (a, b)-> !count.get(a).equals(count.get(b))?count.get(b)-count.get(a):a.length()!= b.length()?a.length()-b.length():a.compareTo(b));
        String join = String.join(" ", arr);
        System.out.println(join);
    }
}
