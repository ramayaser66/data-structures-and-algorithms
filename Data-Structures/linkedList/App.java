/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package Data-Structures.linkedList;

public class App {

    public static void main(String[] args) {

        linkedList mylist = new linkedList();
       
        mylist.insert(5);
        mylist.insert(8);
        mylist.insert(1);
 
 
 //        mylist.insert(15);
 
 //        mylist.append(24);
 //        mylist.append(10);
 //        mylist.append(24);
 
 //        mylist.insertBefore(8, 9);
 
 
        //  mylist.insertAfter(5, 10);
 
 //        System.out.println(mylist.includes(15));
 //        System.out.println(mylist.includes(20));

        System.out.println(mylist.kthValue(0));
 
 
         System.out.println(mylist.toString());
 
 
     }
}
