package leftjoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

 public static void main(String[] args) {

     HashMap<Object, Object> synonyms = new HashMap<Object, Object>();


     synonyms.put("wrath","anger");
     synonyms.put("diligent","employed");
     synonyms.put("outfit","garb");
     synonyms.put("guide","usher");
     synonyms.put("fond","enamored");
     synonyms.put("rama",-20);

     HashMap<Object, Object> antonyms = new HashMap<Object, Object>();

     antonyms.put("wrath","delight");
     antonyms.put("diligent","idle");
     antonyms.put("guide","follow");
     antonyms.put("flow","jam");
     antonyms.put("fond","averse");
     antonyms.put("rama",20);

     System.out.println(leftJoins(synonyms,antonyms));



 }



    public static ArrayList<Object> leftJoins(HashMap<Object, Object>firstHashMap , HashMap<Object, Object>secondHashMap){

     if(firstHashMap.isEmpty()){
         return null;

     }else if(secondHashMap.isEmpty()){

         ArrayList FinalList = new ArrayList();

         for (Map.Entry<Object, Object> item : firstHashMap.entrySet()){

             ArrayList FinalListindex = new ArrayList();

             FinalListindex.add(item.getKey());
             FinalListindex.add(item.getValue());
             FinalListindex.add(null);

             FinalList.add(FinalListindex);


         }

         return FinalList;
     }
        ArrayList FinalList = new ArrayList();

        for (Map.Entry<Object, Object> item : firstHashMap.entrySet()){

            ArrayList FinalListindex = new ArrayList();

            if(secondHashMap.containsKey(item.getKey())){

                FinalListindex.add(item.getKey());
                FinalListindex.add(item.getValue());
                FinalListindex.add(secondHashMap.get(item.getKey()));

                FinalList.add(FinalListindex);

            }else{
                FinalListindex.add(item.getKey());
                FinalListindex.add(item.getValue());
                FinalListindex.add(null);

                FinalList.add(FinalListindex);

            }



        }

        return FinalList;
    }


}
