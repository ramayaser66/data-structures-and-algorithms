import java.util.Objects;

public class Node {

    public Object key;
    public Object value;
    public Node next;

    public Node() {
    }


    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return
                "{" + key
            +" : "  + value +
                        '}';
    }
}
