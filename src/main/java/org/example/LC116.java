package org.example;

import org.example.ds.Node;
import org.example.ds.TreeNode;
import org.example.util.BTreeUtil;

import java.util.LinkedList;

/**
 * @ClassName LC116
 * @Description 填充每个节点的下一个右侧节点指针
 * @Author Administrator
 * @Date 2024/5/31 14:23
 **/
public class LC116 {


    public Node connect(Node root) {
        LinkedList<Node> linkedList = new LinkedList<>();
        if(root == null) return root;
        linkedList.push(root);
        while(!linkedList.isEmpty()){

        }
        return root;
    }


    public Node connect1(Node root) {
        if(root == null) return root;
        Node levelLeftNode = root;
        while(levelLeftNode != null){
            Node tmp = (Node) levelLeftNode.left;

            Node nextLevelLeftNode = null;
            while(tmp != null){
                if(levelLeftNode.right != null){
                    tmp.next = (Node) levelLeftNode.right;
                }
                if(tmp.left != null){
                    if(nextLevelLeftNode == null) nextLevelLeftNode = (Node) tmp.left;
                }
                if(tmp.right != null){
                    if(nextLevelLeftNode == null) nextLevelLeftNode = (Node) tmp.right;
                }
                tmp = (Node) levelLeftNode.right;
            }
            levelLeftNode = nextLevelLeftNode;
        }
        return root;
    }

    public static void main(String[] args) {
        BTreeUtil bTreeUtil = new BTreeUtil();
        int[] fullLevelOrder = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        final TreeNode treeNode = bTreeUtil.buildTree(fullLevelOrder);
        System.out.println(treeNode);
    }
}
