public class CustomQueue { 
    private Node head, tail; 
    private int size = 0; 

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int x) { 
        Node n = new Node(x); 
        if (tail != null) tail.next = n; 
        tail = n; 
        if (head == null) head = tail; 
        size++; 
    } 

    public int dequeue() { 
        if (head == null) 
            throw new RuntimeException("Queue is empty."); 
        int val = head.data; 
        head = head.next; 
        if (head == null) tail = null; 
        size--; 
        return val; 
    } 

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
            return;
        }
        Node temp = head;
        System.out.print("Isi Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        return head.data;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(); 

        // Isi awal
        queue.enqueue(5); 
        queue.enqueue(15); 
        queue.enqueue(25); 
        
        // Modifikasi antrean
        queue.dequeue(); 
        queue.enqueue(35);
        queue.enqueue(45);

        // Demo Peek (Melihat data terdepan tanpa menghapus)
        System.out.println("--- Operasi Peek ---");
        queue.print(); // Cek isi sebelum peek
        System.out.println("Data depan: " + queue.peek());
        queue.print(); // Cek isi sesudah peek (harus tetap sama)

        System.out.println("\n--- Isi Akhir Queue ---");
        while (!queue.isEmpty()) { 
            System.out.print(queue.dequeue() + " "); 
        } 
        System.out.println(); 
    }
}