package Data_Structures;

public class Queue {
    private boolean isEmpty = true;
    private int size;
    private final String[] elements;
    private final int frontal;
    private int rear;
    public Queue(int sizeOfQueue) {
        elements = new String[sizeOfQueue];
        frontal = -1;
        rear = -1;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void enqueue(String element) {
        if (rear != elements.length -1){
            rear++;
            this.elements[rear] = element;
            isEmpty = false;
            size++;
        }
    }
    public int size() {
        return size;
    }
    public String dequeue() {
        if (!isEmpty) {
            size--;
            return elements[frontal + 1];
        }
        return null;
    }
    public String peek() {
        if (!isEmpty){return elements[frontal + 1];}
        return null;
    }
}
