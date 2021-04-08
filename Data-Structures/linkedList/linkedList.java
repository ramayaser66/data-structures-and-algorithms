
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
