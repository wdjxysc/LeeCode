package org.example.hwod;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 单向链表中间节点
 */
public class Test100_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String head = sc.next();
        int n = sc.nextInt();

        HashMap<String, String[]> nodes = new HashMap<>();
        for(int i =0;i<n;i++){
            String addr = sc.next();
            String val = sc.next();
            String nextAddr = sc.next();
            nodes.put(addr, new String[]{val, nextAddr});
        }
        System.out.println(getResult(head, nodes));
    }

    public static String getResult(String head, HashMap<String, String[]> nodes){
        LinkedList<String> link = new LinkedList<>();
        String[] node = nodes.get(head);
        while (node != null){
            String val = node[0];
            String next = node[1];
            link.add(val);
            node = nodes.get(next);
        }

        int len =   link.size();
        int mid = len/2;
        return  link.get(mid);
    }


}
