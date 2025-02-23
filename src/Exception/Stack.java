package Exception;

/* Create a class StackEmptyException */
class StackEmptyException extends Exception {
    /* Create a constructor with a message */
    public StackEmptyException(String message) {
        super(message); // Call the constructor of the parent class
    }
}

/* Create a class StackFullException */
class StackFullException extends Exception {
    /* Create a constructor with a message */
    public StackFullException(String message) {
        super(message); // Call the constructor of the parent class
    }
}

/* Create public class name Stack can send another file */
public class Stack extends MyBuffer {
    int top; // Create a variable top

    /* Create a constructor with no parameter */
    public Stack() {
        this(10); // Call the constructor with a parameter
    }

    /* Create a constructor with a parameter */
    Stack(int x) {
        super(x); // Call the constructor of the parent class
        top = 0; // Set top to 0
    }

    /* Create a method push with a parameter x */
    public void push(int x) {
        /* Check if top is greater than or equal to items.length */
        try {
            if (top >= items.length)

                throw new StackFullException("Stack is full! Cannot push " + x); // Throw an exception if the stack is
                                                                                 // full

            else
                items[top++] = x;
        } catch (StackFullException e) { // Catch the exception
            System.out.println("Exception: " + e.getMessage()); // Print the exception message
        }

    }

    /* Create a method pop */
    public int pop() {
        /* Check if top is greater than 0 */
        try {
            if (top > 0) {
                return items[--top];
            }

            throw new StackEmptyException("Stack underflow"); // Throw an exception if the stack is empty
        } catch (StackEmptyException e) { // Catch the exception
            System.out.println("Exception: " + e.getMessage()); // Print the exception message
            return -1;
        }

    }
}
