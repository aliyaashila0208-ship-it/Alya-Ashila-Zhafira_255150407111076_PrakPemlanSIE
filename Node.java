class Node {
    int data;
    Node left, right;

    // Konstruktor untuk inisialisasi node
    Node(int data) {
        this.data = data;
    }

    // Method add rekursif bawaan dari modul
    public void add(int data) {
        if (data > this.data) { 
            if (this.right == null) {
                this.right = new Node(data);
            } else {
                this.right.add(data);
            }
        } else if (data < this.data) { 
            if (this.left == null) {
                this.left = new Node(data);
            } else {
                this.left.add(data);
            }
        }
    }
}