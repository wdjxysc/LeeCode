package org.example.util;

import org.example.ds.Node;
import org.example.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BTree
 * @Description TODO
 * @Author Administrator
 * @Date 2024/5/31 16:32
 **/
public class BTreeUtil {

    /**
     * 从中序与后序遍历序列构造二叉树
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeRecursive(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }

    /**
     * 递归构造
     * @param inorder
     * @param postorder
     * @param head1 inorder的截取范围开始
     * @param tail1 inorder的截取范围结束
     * @param head2 postorder的截取范围开始
     * @param tail2 postorder的截取范围结束
     * @return
     */
    public TreeNode buildTreeRecursive(int[] inorder, int[] postorder, int head1, int tail1, int head2, int tail2) {
        if (head1 > tail1) return null;
        int rootVal = postorder[tail2];
        TreeNode root = new TreeNode(rootVal);
        if (head1 == tail1) return root;
        int leftLen = 0;//当前分区左节点长度
        while (inorder[head1 + leftLen] != rootVal) {
            leftLen++;
        }
        root.left = buildTreeRecursive(inorder, postorder, head1, head1 + leftLen - 1, head2, head2 + leftLen - 1);
        root.right = buildTreeRecursive(inorder, postorder, head1 + leftLen + 1, tail1, head2 + leftLen, tail2 - 1);

        return root;
    }

    /**
     * 从层序遍历数组构建树
     *
     * 先创建节点 再确定父子关系
     * @param arr
     * @return
     */
    public TreeNode buildTree(int[] arr){
        if(arr.length == 0) return null;
        TreeNode[] nodeArr = new TreeNode[arr.length];
        int i = 0;
        while (i<arr.length){
            nodeArr[i] = new TreeNode(arr[i]);
            i++;
        }

        i = 0;
        while (i<nodeArr.length){
            if(2*(i+1)< nodeArr.length){
                nodeArr[i].left = nodeArr[2*(i+1)-1];
                nodeArr[i].right = nodeArr[2*(i+1)];
            }
            i++;
        }
        return nodeArr[0];
    }

}
