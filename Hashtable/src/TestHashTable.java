
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHashTable {

    @Test
    public void TestHashTable(){

        // testing Adding a key/value to your hashtable results in the value being in the data structure
        HashTableClass test = new HashTableClass();

        test.add(1,20);
        test.add(2,30);
        test.add("test",100);
        test.add("test",10);
        test.add(0,10);
        test.add("R",11);
        test.add("B",111);
        test.add(100,111);


        String expected ="0 :{0 : 10} ----> {100 : 111} ----> \n" +
                "2 :{test : 10} ----> \n" +
                "18 :{R : 11} ----> \n"+
                "34 :{B : 111} ----> \n" +
                "98 :{2 : 30} ----> \n" +
                "99 :{1 : 20} ----> \n";

        assertEquals("testing ", expected,test.toString());

    }



    @Test
    public void TestGetForHashTable(){
//        Successfully returns null for a key that does not exist in the hashtable

        HashTableClass test = new HashTableClass();

        test.add(1,20);
        test.add(2,30);
        test.add(3,40);
        test.add("test",100);

        assertEquals("testing", null,test.get(0));

    }


    @Test
    public void TestGetMethodForHashTable(){
        // testing Retrieving based on a key returns the value stored

        HashTableClass test = new HashTableClass();

        test.add(1,20);
        test.add(2,30);
        test.add(3,40);
        test.add("test",100);

        int  expected = 40;

        assertEquals("testing", expected,test.get(3));

    }


    @Test
    public void TestHashMethodForHashTable(){
        //Successfully hash a key to an in-range value

        HashTableClass test = new HashTableClass();

        test.add(1,20);
        test.add(2,30);
        test.add(3,40);
        test.add("test",100);
        int expected = 96;
        assertEquals("testing", expected,test.hash(4));
    }


    @Test
    public void TestCollisionsForHashTable(){
        //Successfully hash a key to an in-range value

        HashTableClass test = new HashTableClass();

        test.add(1,20);
        test.add(2,30);
        test.add(3,40);
//        test.add(4,50);
        test.add("test",100);
        test.add("test",10);
        test.add(0,10);
        test.add("R",11);
        test.add("B",111);
        test.add(60,111);
        test.add(100,111);

        // I have a collision between key 0 and key 100
        String expected = "0 :{0 : 10} ----> {100 : 111} ----> \n" +
                "2 :{test : 10} ----> \n" +
                "18 :{R : 11} ----> \n" +
                "34 :{B : 111} ----> \n" +
                "40 :{60 : 111} ----> \n" +
                "97 :{3 : 40} ----> \n" +
                "98 :{2 : 30} ----> \n" +
                "99 :{1 : 20} ----> \n";
        assertEquals("testing", expected,test.toString());


    }


    @Test
    public void TestGetCollisionsForHashTable(){
        //Successfully hash a key to an in-range value

        HashTableClass test = new HashTableClass();

        test.add(1,20);
        test.add(2,30);
        test.add(3,40);
//        test.add(4,50);
        test.add("test",100);
        test.add("test",10);
        test.add(0,10);
        test.add("R",11);
        test.add("B",111);
        test.add(60,111);
        test.add(100,111);

        // I have a collision between key 0 and key 100
        int expected = 10;
        assertEquals("testing", expected,test.get(0));
        assertEquals("testing", 111,test.get(100));

    }



}
