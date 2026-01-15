package h1;

public class H1_main {

    public static int distance(Node x, Node y) {
        // Base Case: gleicher Knoten
        if (x == y) {
            return 0;
        }
        // Rekursiver Schritt
        return 1 + distance(x.getNext(), y);
    }

    public static void main(String[] args) {
        Node d = new Node(null);
        Node c = new Node(d);
        Node b = new Node(c);
        Node a = new Node(b);

        // Beispiel: Abstand von a zu d = 3
        System.out.println(distance(a, d));
    }
}