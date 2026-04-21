import java.util.Scanner;
import java.util.Stack;

public class UndoRedo {
    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

    public void action(String command) {
        System.out.println("Action: " + command);
        undoStack.push(command);
        redoStack.clear(); 
        printStatus();
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
        } else {
            String command = undoStack.pop();
            redoStack.push(command);
        }
        printStatus();
    }

    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
        } else {
            String command = redoStack.pop();
            undoStack.push(command);
        }
        printStatus();
    }

    public void printStatus() {
        System.out.print("Stack Undo: ");
        for (String s : undoStack) {
            System.out.print("[" + s + "] ");
        }
        System.out.println();

        System.out.print("Stack Redo: ");
        for (String s : redoStack) {
            System.out.print("[" + s + "] ");
        }
        System.out.println("\n---------------------------------");
    }

    public static void main(String[] args) {
        UndoRedo app = new UndoRedo();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Ketik teks (Aksi), 'U' (Undo), 'R' (Redo), atau 'X' (Keluar):");
            System.out.print("Command: ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("x")) break;
            
            if (command.equalsIgnoreCase("u")) { 
                app.undo(); 
            } else if (command.equalsIgnoreCase("r")) { 
                app.redo(); 
            } else { 
                app.action(command); 
            }
        }
        scanner.close();
    }
}