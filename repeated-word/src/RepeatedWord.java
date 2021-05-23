import java.util.Arrays;
import java.util.Locale;

public class RepeatedWord {

    public String repeatedWord(String word){

        String[] splitWord = word.toLowerCase().replace(",","").split(" ");
        System.out.println(Arrays.toString(splitWord));
        HashTableClass hashTable = new HashTableClass();

       for(String wordI :splitWord){
               if(hashTable.contains(wordI)){
                   return wordI;
               }else{
                   hashTable.add(wordI, wordI);;
                   }


       }
       return "no repeated words found....";
    }


}
