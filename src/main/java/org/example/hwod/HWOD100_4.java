package org.example.hwod;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 完美走位
 * TODO LC.76 最小覆盖字符串？
 */
public class HWOD100_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(getResult(s));
    }

    public static int getResult(String str){
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            Character c = str.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int avg = str.length()/4;
        int res = 0;
        for(Character c: count.keySet()){
            if(count.get(c) > avg){
                res += count.get(c)-avg;
            }
        }
        return res;
    }
}
