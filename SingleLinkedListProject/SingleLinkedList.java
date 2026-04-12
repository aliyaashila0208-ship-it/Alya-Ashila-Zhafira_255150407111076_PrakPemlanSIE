public class SingleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { head = null; }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // a. Mencari node dengan nilai tertentu
    Node findByValue(Object value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) return current;
            current = current.next;
        }
        return null;
    }

    // b. Mencari node di posisi ke-n
    Node findByIndex(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // c. Menghapus node di posisi ke-n
    void removeByIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (size == 1) tail = null;
        } else {
            Node prev = findByIndex(index - 1);
            Node toDelete = prev.next;
            prev.next = toDelete.next;
            if (toDelete == tail) tail = prev;
        }
        size--;
    }

    // d. Menghapus node dengan nilai data tertentu
    void removeByValue(Object value) {
        if (isEmpty()) return;
        if (head.data.equals(value)) {
            head = head.next;
            if (head == null) tail = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                if (current.next == tail) tail = current;
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    // e. Menambah node di posisi ke-n
    void addByIndex(Node data, int index) {
        if (index <= 0) { addFirst(data); return; }
        if (index >= size) { addLast(data); return; }
        Node prev = findByIndex(index - 1);
        data.next = prev.next;
        prev.next = data;
        size++;
    }

    // f. Menambah node setelah node dengan nilai data tertentu
    void addAfterValue(Node data, Object value) {
        Node target = findByValue(value);
        if (target == null) return;
        data.next = target.next;
        target.next = data;
        if (target == tail) tail = data;
        size++;
    }

    // g. Menambah node sebelum node dengan nilai data tertentu
    void addBeforeValue(Node data, Object value) {
        if (head == null) return;
        if (head.data.equals(value)) { addFirst(data); return; }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                data.next = current.next;
                current.next = data;
                size++;
                return;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast(new Node("A"));
        list.addLast(new Node("B"));
        list.addLast(new Node("C"));
        list.addLast(new Node("D"));
        System.out.print("List awal        : "); list.print();

        // a. Cari by value
        Node found = list.findByValue("C");
        System.out.println("Cari node 'C'    : " + (found != null ? found.data : "null"));
        Node notFound = list.findByValue("Z");
        System.out.println("Cari node 'Z'    : " + (notFound != null ? notFound.data : "null"));

        // b. Cari by index
        Node atIdx = list.findByIndex(2);
        System.out.println("Node di index 2  : " + (atIdx != null ? atIdx.data : "null"));
        Node outIdx = list.findByIndex(9);
        System.out.println("Node di index 9  : " + (outIdx != null ? outIdx.data : "null"));

        // c. Hapus by index
        list.removeByIndex(1);
        System.out.print("Hapus index 1    : "); list.print();

        // d. Hapus by value
        list.removeByValue("D");
        System.out.print("Hapus node 'D'   : "); list.print();

        // e. Tambah by index
        list.addByIndex(new Node("X"), 1);
        System.out.print("Tambah 'X' di [1]: "); list.print();

        // f. Tambah setelah value
        list.addAfterValue(new Node("Y"), "X");
        System.out.print("Tambah 'Y' stlh X: "); list.print();

        // g. Tambah sebelum value
        list.addBeforeValue(new Node("Z"), "X");
        System.out.print("Tambah 'Z' sblm X: "); list.print();
    }
}