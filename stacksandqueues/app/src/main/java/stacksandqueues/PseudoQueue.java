package stacksandqueues;

public class PseudoQueue {
    Stack s1;
    Stack s2;

    public PseudoQueue() {
        this.s1 = new Stack();
        this.s2 = new Stack();
    }



    public void enqueue(int val){
        s1.push(val);

    }

    public int dequeue(){
        if(s1.isEmpty() && s2.isEmpty()){
            throw new NullPointerException ("error...called on an empty stack");
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        return s2.pop();
    }



}
