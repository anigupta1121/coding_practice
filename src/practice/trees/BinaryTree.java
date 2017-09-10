package practice.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/23/2017.
 */
public class BinaryTree {
    public static void main(String[] args) {

        Scanner p=new Scanner(System.in);
        int ch=p.nextInt();
        Node root = null;

        while(ch==1){
            root=insert(root,p.nextInt());
            System.out.print("choice ");
            ch=p.nextInt();
        }

        levelOrderTraversal(root);
    }

     static void inOrderTraversal(Node root){
        if(root==null) return;

        inOrderTraversal(root.left);
        System.out.print(root.value+" ");
        inOrderTraversal(root.right);

    }

    @SuppressWarnings("unchecked")
    static void levelOrderTraversal(Node root){
        Queue q=new LinkedList();
        q.add(root);

        while (!q.isEmpty()){
            Node node=(Node)q.poll();
            System.out.print(node.value+" ");

            if(node.left!=null) q.add(node.left);

            if(node.right!=null) q.add(node.right);
        }
    }
    static int height(Node root) {
        if(root==null)
            return -1;

        int lDepth=height(root.left);
        int rDepth=height(root.right);

        if(lDepth>rDepth){
            return lDepth+1;
        }
        return rDepth+1;
    }


    //this is for binary search tree
     static Node insert(Node root,int data){
        if(root==null)
            return new Node(data);

        Node curr;
        if(data<=root.value ){
            curr=insert(root.left,data);
            root.left=curr;
        }
        else {
            curr=insert(root.right,data);
            root.right=curr;
        }
        return root;
    }


}
