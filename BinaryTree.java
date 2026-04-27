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
 System.out.printf("[%d]", node.data); 
 preTraverse(node.left); 
 preTraverse(node.right); 
 } 
 public void inTraverse(Node node) { 
 if (node == null) return; 
 inTraverse(node.left); 
 System.out.printf("[%d]", node.data); 
 inTraverse(node.right); 
 } 
 public void postTraverse(Node node) { 
 if (node == null) return; 
 postTraverse(node.left); 
 postTraverse(node.right); 
 System.out.printf("[%d]", node.data); 
 } 
}
