
package Data-Structures.linkedList;


public class linkedList {

    private node head;


    public linkedList(){
        head = null;
    }


    // functions


    //insert function
    public void insert(int newNodeValue) {
        try {
            node newNode = new node(newNodeValue);
            if (head == null) {
                head = newNode;

            } else {
                newNode.setNext(head);
                head = newNode;
            }
        }catch(Exception ex){
            System.out.println("an error occurred in inserting into function....");
        }
    }


    // challenge 6

    // append function

    public void append (int newNodeValue){
        node newNode = new node(newNodeValue);
        if(head == null){
            head = newNode;

        }else {
            node pointer = head;
            System.out.println(pointer.getNext());
            while(pointer.getNext()!= null){
                pointer = pointer.getNext();

            }
            pointer.setNext(newNode);
        }
    }

    // insertBefore function

    public void insertBefore(int value, int newValue){
        node newNode = new node(newValue);
        node pointer = head;

        if(includes(value)){
            if (pointer.getValue() == value){
                newNode.setNext(pointer);
                head = newNode;
            }else {

                while(pointer.getNext().getValue() != value){
                    pointer =pointer.getNext();
                }

                newNode.setNext(pointer.getNext());
                pointer.setNext(newNode);
            }


        }else{
            throw new NullPointerException("the value is not included in the linked list");

        }

    }


    // insertAfte function

    public void insertAfter(int value, int newValue){
        node newNode = new node(newValue);
        node pointer = head;

        if (includes(value)) {

            while (pointer.getValue() != value) {
                pointer = pointer.getNext();
            }

            newNode.setNext(pointer.getNext());
            pointer.setNext(newNode);


        }else{
            throw new NullPointerException("the value is not included in the linked list");
        }





    }







    //toString
    public String toString() {
try {
    node pointer = head;
    String output = "";
    if (pointer == null) {
        return "linkedList is empty...";
    }

    while (pointer != null) {

        output = output + "{" + pointer.getValue() + "}->";
        pointer = pointer.getNext();

    }
    return output + "null";
}catch (Exception ex){
    return "an error occurred in toSring function....";
}

    }


    // includes function

    public boolean includes(int testValue) {

        try {
            node pointer = head;
            boolean flag = false;
            if (pointer == null) {
                return false;

            }

            while (pointer != null) {

                if (pointer.getValue() == testValue) {
                    flag = true;
                }
                pointer = pointer.getNext();

            }
            return flag;

        } catch (Exception ex) {

            System.out.println("an error occurred in the includes function....");
            return false;
        }
    }


}
