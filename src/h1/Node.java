package h1;

public class Node {

    private Node next;

    public Node(Node next) {
        this.next = next;
    }

    // Getter → KEINE Parameter
    public Node getNext() {
        return next;
    }

    // Setter → EIN Parameter
    public void setNext(Node next) {
        this.next = next;
    }
}