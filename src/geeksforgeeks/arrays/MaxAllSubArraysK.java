package geeksforgeeks.arrays;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/16/2017.
 */
public class MaxAllSubArraysK {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        int t=p.nextInt();
        while (t>0){
            int n=p.nextInt();
            int k=p.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=p.nextInt();
            }


            t--;
        }
    }

    private static void maxOfSub(int a[],int n,int k){
        for(int i=0;i<n-k;i++){
            int max=Integer.MIN_VALUE;
                for (int j = i; j < i + k; j++) {
                    if (a[j] > max) {
                        max = a[j];
                    }
                }

                System.out.print(max + " ");

        }
        System.out.println();
    }

  /*  *//*private void maxofSubBST(int a[],int n,int k){
        BinarySearchTreeNode node=new BinarySearchTreeNode();
        for(int i=0;i<k;i++){
            node.setLeft(null);
            node.setRight(null);
            node.setData(a[]);
        }
    }*//*

    private class BinarySearchTreeNode{
        private int data;
        private BinarySearchTreeNode left;
        private BinarySearchTreeNode right;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public BinarySearchTreeNode getLeft() {
            return left;
        }

        public void setLeft(BinarySearchTreeNode left) {
            this.left = left;
        }

        public BinarySearchTreeNode getRight() {
            return right;
        }

        public void setRight(BinarySearchTreeNode right) {
            this.right = right;
        }
    }*/
}
