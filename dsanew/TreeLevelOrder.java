import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeLevelOrder {

    // ✅ height function
    public static int height(Node root) {
        if (root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // ✅ print all levels one by one
    static void level1(Node root, int h) {
        for (int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.println(); // new line after each level
        }
    }

    // ✅ helper function to print nodes at a given level
    static void printGivenLevel(Node root, int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.val + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);

        int h = height(root);
        System.out.println("Tree Height: " + h);
        System.out.println("Level Order Traversal (Recursive):");
          level1(root, h);
    }
  }
