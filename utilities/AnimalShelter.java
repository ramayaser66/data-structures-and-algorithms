package utilities;

import com.google.common.collect.ObjectArrays;

public class AnimalShelter {

    Queue<Object[]> queue1 ;

    public AnimalShelter() {
        this.queue1 = new Queue<>();
    }


public void enqueue(Animal animal)  {
        Object[] animalInfo = new Object[2];

        if(animal instanceof Cat){
            animalInfo[0] = animal.name;

            animalInfo[1] = "cat";
            queue1.enqueue(animalInfo);

        }else if(animal instanceof Dog){
            animalInfo[0] = animal.name;
            animalInfo[1] = "dog";
            queue1.enqueue(animalInfo);
        }else{
            throw new IllegalArgumentException("error the animal is neither a cat or a dog...");
        }
}


public Object dequeue(String pref) {
    if (pref == null ) {
        return null;

    } else if (pref.equals("cat")) {
        Object[] res = queue1.dequeue();
//        System.out.println(queue1.peek());
        return res[0];
    } else if (pref.equals("dog")) {
        Object[] res = queue1.dequeue();
//        System.out.println(res);
        return res[0];
    }else{
       return null;
    }

}






}
