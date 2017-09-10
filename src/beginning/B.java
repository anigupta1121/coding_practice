package beginning;

import java.util.List;

/**
 * Created by guptaanirudh100 on 8/24/2017.
 */
public class B extends A {

    public void fun(){
        System.out.println("B");
    }
   public B(){

   }

}




 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */
/*

    static Node lca(Node root,int v1,int v2)
    {
        Node temp=root;
        while(temp.left!=null&&temp.right!=null){
            if(v1<temp.data&&v2<temp.data){
                temp=temp.left;
            }else if(v1>temp.data&&v2>temp.data){
                temp=temp.right;
            }else if(v1<temp.data && v2>temp.data) {
                return temp;
            }
        }
        return root;
    }

*/



