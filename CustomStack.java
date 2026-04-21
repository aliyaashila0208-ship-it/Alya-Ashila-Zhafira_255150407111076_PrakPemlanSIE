public class CustomStack { 
    Node top; 
    int size = 0; 

    public void push(int x) { 
        Node n = new Node(x); 
        n.next = top; 
        top = n; 
        size++; 
    } 
    
    public int pop() { 
        if (top == null) 
            throw new RuntimeException("Stack is empty."); 
        int val = top.data; 
        top = top.next; 
        size--; 
        return val; 
    } 

    public boolean isEmpty() { 
        return top == null; 
    } 

    public static void main(String[] args) {
        CustomStack custom = new CustomStack(); 
    
        custom.push(1); 
        custom.push(5); 
        custom.push(2); 
        custom.push(3); 
        custom.push(4); 
        
        System.out.print("Isi Stack (dikeluarkan dengan pop): "); 
        while (!custom.isEmpty()) { 
            System.out.print("[" + custom.pop() + "]"); 
        } 
        System.out.println("\nEnd."); 
    }
}