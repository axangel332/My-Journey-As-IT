package test1;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class aa {

    private String[] stackArray; 
    private int stackSize; 
    private int topOfStack = -1; 

    public aa(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void displayTheStack() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 45; i++) {
            sb.append("=");
        }
        sb.append("\n");
        for (int i = 0; i < stackSize; i++) {
            sb.append("| ").append(stackArray[i]);
        }
        sb.append("|\n");
        for (int i = 0; i < 45; i++) {
            sb.append("=");
        }
        sb.append("\n");
        JOptionPane.showMessageDialog(null, sb.toString(), "Stack", JOptionPane.INFORMATION_MESSAGE);
    }

    public void push(String input) {
        if (topOfStack < stackSize - 1) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else {
            JOptionPane.showMessageDialog(null, "Sorry but the stack is full.\n", "Push Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String pop() {
        if (topOfStack >= 0) {
            String poppedValue = stackArray[topOfStack];
            stackArray[topOfStack] = "-1";
            topOfStack--;
            return poppedValue;
        } else {
            JOptionPane.showMessageDialog(null, "Sorry but the stack is empty.\n", "Pop Error", JOptionPane.ERROR_MESSAGE);
            return "-1";
        }
    }

    public String peek() {
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues) {
        String[] tempString = multipleValues.split(" ");
        for (String value : tempString) {
            push(value);
        }
    }

    public void popAll() {
        for (int i = topOfStack; i >= 0; i--) {
            pop();
        }
    }

    public static void main(String[] args) {
        aa theStack = new aa(10);

        while (true) {
            String[] options = {"Push", "Pop", "Display", "PushMany", "PopAll", "Peek", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Select an operation:", "Stack Operations",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    String valueToPush = JOptionPane.showInputDialog("Enter a value to push:");
                    theStack.push(valueToPush);
                    break;
                case 1:
                    String poppedValue = theStack.pop();
                    JOptionPane.showMessageDialog(null, "Popped value: " + poppedValue, "Pop Result", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    theStack.displayTheStack();
                    break;
                case 3:
                    String valuesToPushMany = JOptionPane.showInputDialog("Enter multiple values to push (space-separated):");
                    theStack.pushMany(valuesToPushMany);
                    break;
                case 4:
                    theStack.popAll();
                    JOptionPane.showMessageDialog(null, "All values popped.", "PopAll Result", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    String peekedValue = theStack.peek();
                    JOptionPane.showMessageDialog(null, "Top of the stack: " + peekedValue, "Peek Result", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
