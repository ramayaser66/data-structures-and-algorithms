package leftjoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static leftjoin.Main.leftJoins;
import static org.junit.Assert.*;


public class TestLeftJoin {

    @Test
    public void LeftJoinTest() {
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

        String exp = "[[diligent, employed, idle], [outfit, garb, null], [rama, -20, 20], [wrath, anger, delight], [guide, usher, follow], [fond, enamored, averse]]";
        assertEquals("Testing empty antonyms map....",exp, leftJoins(synonyms,antonyms).toString());
    }



    @Test
    public void emptySynonymsTest() {
        HashMap<Object, Object> synonyms = new HashMap<Object, Object>();

        HashMap<Object, Object> antonyms = new HashMap<Object, Object>();

        antonyms.put("wrath","delight");
        antonyms.put("diligent","idle");
        antonyms.put("guide","follow");
        antonyms.put("flow","jam");
        antonyms.put("fond","averse");
        antonyms.put("rama",20);

        System.out.println(leftJoins(synonyms,antonyms));



        assertNull("Testing empty synonyms map....", leftJoins(synonyms,antonyms));
    }


    @Test
    public void emptyAntonymsTest() {
        HashMap<Object, Object> synonyms = new HashMap<Object, Object>();

        HashMap<Object, Object> antonyms = new HashMap<Object, Object>();

        antonyms.put("wrath","delight");
        antonyms.put("diligent","idle");
        antonyms.put("guide","follow");
        antonyms.put("flow","jam");
        antonyms.put("fond","averse");
        antonyms.put("rama",20);

        System.out.println(leftJoins(synonyms,antonyms));



        assertNull("Testing empty antonyms map....", leftJoins(synonyms,antonyms));
    }



}
