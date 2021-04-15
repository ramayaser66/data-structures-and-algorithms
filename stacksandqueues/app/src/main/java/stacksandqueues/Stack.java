package stacksandqueues;

public class Stack {

    Node top;


    public Stack() {
        top = null;
    }



    public void push(int newValue){
        Node newNode = new Node(newValue);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;

        }

    }

    public int pop() {
        Node temp;
        if (top != null) {
//            throw new NullPointerException("error...called on an empty stack");

            temp = top;
            top = top.next;
            temp.next = null;
            return temp.value;

        }
        throw new NullPointerException ("error...called on an empty stack");

    }


    public int peek(){
        int peek;
        if (top != null) {
            peek = top.value;

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






    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top.value +
                '}';
    }
}
