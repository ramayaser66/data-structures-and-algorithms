package utilities;

public class Queue<T> {
    Node front;
    Node rear;




    public Queue() {
        front = null;
        rear = null;
    }


    public void enqueue(T newValue){
        Node newNode = new Node(newValue);

        if (front != null) {
            rear.next = newNode;
            rear = newNode;

        }else{
            front = newNode;
            rear = newNode;

        }

    }


    public T dequeue() {
        Node temp;
        if (front != null) {
//            throw new NullPointerException("error...called on an empty stack");

            temp = front;
            front = front.next;
            temp.next = null;
            return(T) temp.value;

        }
        throw new NullPointerException("error...called on an empty stack");
    }


    public boolean isEmpty(){
        boolean flag = false;
        if(front == null){
            flag = true;

            return flag;

        }
        return flag;

    }


    public T peek(){
        T peek;
        if (front != null) {
            peek = (T)front.value;
            return peek;
        }
        throw new NullPointerException("error...called on an empty queue");

    }





    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front.value +", "+
                "rear="+ rear.value+
                '}';
    }

}
