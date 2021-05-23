import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class HashTableClass {

    LinkedList<Node>[] hashArray = new LinkedList[100];
    int size = 0;

    public HashTableClass() {
    }


    public void add(Object key, Object value) {
        if (size >= hashArray.length) {
            resize();
        }
        int index = hash(key);


        ////////////////////////////////////////////
        if (hashArray[index] == null) {
            hashArray[index] = new LinkedList<>();
            hashArray[index].add(new Node(key, value));
            size++;
            return;

        } else {
            for (Node node : hashArray[index]) {
                // check if there is already the same key
                if (node.key.equals(key)) {
                    // replace the already existing value with the new value
                    node.value = value;
                    return;
                }
            }

            //no key match so add the value to the end of the array
            hashArray[index].add(new Node(key, value));
            size++;
            return;


        }
    }

    public Object get(Object key) {
        int index = hash(key);


        if (hashArray[index] == null) {
            return null;
        }
        for (Node node : hashArray[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }


    public boolean contains(Object key) {
        // if the key you wanna check was null
        if (key == null) {
            return false;
        }

        int index = hash(key);


        if (hashArray[index] == null) {
            return false;
        }

        for (Node node : hashArray[index]) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void resize() {
        LinkedList<Node>[] previousHashArray = hashArray;
        hashArray = new LinkedList[size * 2];
        size = 0;

        for (int i = 0; i < previousHashArray.length; i++) {
            if (previousHashArray[i] == null){
                continue;
            }
            for (Node node : previousHashArray[i]) {
                // this will add them to the hashArray
                add(node.key, node.value);
            }
        }
    }






       public int hash(Object key) {

        return (Math.abs(key.hashCode()*599)) % hashArray.length;
    }






    @Override
    public String toString() {
        String array = "";
        for (int i =0; i<hashArray.length; i++){

            LinkedList<Node> strArray = hashArray[i];
            if(strArray != null){
               array = array + i+" :";
                for (Node node : strArray){
                       array+= node + " ----> ";

                }
               array+= "\n";
            }


        }
        return array;
    }

}





























