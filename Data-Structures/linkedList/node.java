
package Data-Structures.linkedList;
import javax.xml.soap.Node;

public class node {

   private int value;
    private node next;



// constructor
     public node( int newValue){
         value = newValue;
         next = null;

     }


// Getter and setters

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }








}


