/* Create a package named Exception */
package Exception;

/* Create a class QueueEmptyException */
class QueueEmptyException extends Exception {
    /* Create a constructor with a message */
    public QueueEmptyException(String message) {
        super(message); // Call the constructor of the parent class
    }
}

/* Create a class QueueEmptyException */
class QueueFullException extends Exception {
    /* Create a constructor with a message */
    public QueueFullException(String message) {
        super(message); // Call the constructor of the parent class
    }
}

/* Create public class name Queue can send another file */
public class Queue extends MyBuffer { // Inheritance from MyBuffer
    /* Create a variable head, tail, count */
    int head, tail, count;

    /* Create a constructor with no parameter */
    public Queue() {
        this(10); // Call the constructor with a parameter
    }

    /* Create a constructor with a parameter */
    public Queue(int x) {
        super(x); // Call the constructor of the parent class
        head = 0; // Set head to 0
        tail = 0; // Set tail to 0
        count = 0; // Set count to 0
    }

    /* Create a method add with a parameter x */
    public void add(int x) {
        /* Check if count is greater than or equal to items.length */
        try {
            if (count >= items.length) {
                throw new QueueFullException("Queue is full"); // Throw an exception if the queue is full
            } else {
                items[tail] = x;
                tail = (tail + 1) % items.length;
                count++;
            }
        } catch (QueueFullException e) { // Catch the exception
            System.out.println("Exception: " + e.getMessage()); // Print the exception message
        }
    }

    /* Create a method delete */
    public int delete() {
        /* Check if count is greater than 0 */
        try {
            if (count > 0) {
                int value = items[head];
                head = (head + 1) % items.length;
                count--;
                return value;
            }
            throw new QueueEmptyException("Queue underflow"); // Throw an exception if the queue is empty
        } catch (QueueEmptyException e) { // Catch the exception
            System.out.println("Exception: " + e.getMessage()); // Print the exception message
            return -1;
        }
    }
}
