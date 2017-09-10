package practice.trees;

/**
 * Created by guptaanirudh100 on 7/29/2017.
 */
public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this(value, null, null);
    }
}