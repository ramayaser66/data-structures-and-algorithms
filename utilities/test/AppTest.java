/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testAnimalShelterPrfNull(){
        AnimalShelter test = new AnimalShelter();


        assertEquals("error in testing when the perf is null ",null,test.dequeue(null));

    }



    @Test
    public void testAnimalShelterEnqueue(){
        AnimalShelter test = new AnimalShelter();
        Animal cat1 = new Cat("cat1");
        test.enqueue(cat1);
        assertEquals("testing enqueue method...  ","cat1" ,test.queue1.peek()[0]);
    }

    @Test
    public void testAnimalShelterDequeue(){
        AnimalShelter test = new AnimalShelter();
        Animal dog1 = new Dog("dog1");
        test.enqueue(dog1);
        assertEquals("the output is ","dog1" ,test.dequeue("dog"));
    }


}
