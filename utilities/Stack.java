package utilities;

public class Stack {
    Node top;

    public Stack() {
        top = null;
    }


    public void push(char newValue){
        Node newNode = new Node(newValue);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;

        }
    }

    public char pop() {
        Node temp;
        if (top != null) {
//            throw new NullPointerException("error...called on an empty stack");

            temp = top;
            top = top.next;
            temp.next = null;
            return (char)temp.value;

        }
        throw new NullPointerException ("error...called on an empty stack");

    }


    public char peek(){
        char peek;
        if (top != null) {
            peek = (char)top.value;

            return peek;
        }
        throw new NullPointerException("error...called on an empty stack");

    }


    public boolean isEmpty(){
        boolean flag = false;
        if(top == null){
            flag = true;

            return flag;

        }
        return flag;

    }






}
