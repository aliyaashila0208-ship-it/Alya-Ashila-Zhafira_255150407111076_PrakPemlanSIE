import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) return;
        System.out.print("[" + node.data + "] ");
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.print("[" + node.data + "] ");
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) return;
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.print("[" + node.data + "] ");
    }

    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public int getHeight(Node node) {
        if (node == null) return 0;
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void levelTraverse(Node root) {
        if (root == null) return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print("[" + current.data + "] ");
            
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] dataAcak = {2, 22, 45, 89, 10, 21, 34, 53, 89, 35};

        for (int d : dataAcak) {
            tree.add(d);
        }

        System.out.print("Preorder   : "); tree.preTraverse(tree.root);
        System.out.print("\nInorder    : "); tree.inTraverse(tree.root);
        System.out.print("\nPostorder  : "); tree.postTraverse(tree.root);
        System.out.println("\n");

        System.out.println("HASIL NOMOR 5:");
        System.out.println("Jumlah Semua Node : " + tree.countNodes(tree.root) + "\n");

        System.out.println("HASIL NOMOR 6:");
        System.out.println("Jumlah Daun (Leaf) : " + tree.countLeaves(tree.root) + "\n");

        System.out.println("HASIL NOMOR 7:");
        System.out.println("Tinggi Pohon (Height) : " + tree.getHeight(tree.root) + "\n");

        System.out.println("HASIL NOMOR 9:");
        System.out.print("Level Order : ");
        tree.levelTraverse(tree.root);
        System.out.println();
    }
}