package org.example.niuke;

import java.util.ArrayList;

public class BM5 {
    public class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * TODO 待完成
     * @param lists
     * @return
     */
    public ListNode mergeKLists (ArrayList<ListNode> lists) {
        ArrayList<ListNode> tmpList = new ArrayList<>();
        ListNode res = null;
        ListNode minNode = null;
        //首先找出最小节点
        for (ListNode node : lists) {
            tmpList.add(node);
            if (minNode != null) {
                if (minNode.val > node.val) {
                    minNode = node;
                }
            } else {
                minNode = node;
            }
        }
        ListNode tmp = minNode;
        return minNode;
    }
}
