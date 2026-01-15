package h1;

public class Node {
    public Node next;
    public Node(Node next){
        this.next = next;
    }
    public void getNext(Node next){
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
