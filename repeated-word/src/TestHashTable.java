
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHashTable {


    @Test
    public void TestRepeatedWord(){


        // caseOne
        RepeatedWord repeatedWord = new RepeatedWord();


        String testWord = "Once upon a time, there was a brave princess who...";


        String expected ="a";

        assertEquals("testing ", expected,repeatedWord.repeatedWord(testWord));

    }

    @Test
    public void TestRepeatedWordCase2(){


        // caseTwo (having an (,)
        RepeatedWord repeatedWord = new RepeatedWord();


        String testWord = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs," +
                " and I didn’t know what I was doing in New York...";



        String expected ="summer";

        assertEquals("testing ", expected,repeatedWord.repeatedWord(testWord));

    }


    @Test
    public void TestRepeatedWordCase3(){


        // caseThree, dealing with upper and lower cases
        RepeatedWord repeatedWord = new RepeatedWord();


        String testWord = "It was the best of times, it was the worst of times, it was the age of wisdom," +
                " it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity," +
                " it was the season of Light, it was the season of Darkness, it was the spring of hope," +
                " it was the winter of despair, we had everything before us, we had nothing before us," +
                " we were all going direct to Heaven, we were all going direct the other way – in short," +
                " the period was so far like the present period," +
                " that some of its noisiest authorities insisted on its being received," +
                " for good or for evil, in the superlative degree of comparison only...";


        String expected ="it";

        assertEquals("testing ", expected,repeatedWord.repeatedWord(testWord));

    }

    @Test
    public void TestRepeatedWordCase4(){


        // caseFour, dealing with an empty string
        RepeatedWord repeatedWord = new RepeatedWord();


        String testWord = "";


        String expected ="no repeated words found....";

        assertEquals("testing ", expected,repeatedWord.repeatedWord(testWord));

    }

    @Test
    public void TestRepeatedWordCase5(){


        // caseFive, dealing with an string that doesn't have repeated words
        RepeatedWord repeatedWord = new RepeatedWord();


        String testWord = "what you know about the new basketball team";


        String expected ="no repeated words found....";

        assertEquals("testing ", expected,repeatedWord.repeatedWord(testWord));

    }







}
