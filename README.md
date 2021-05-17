# Data Structures and Algorithms

See [setup instructions](https://codefellows.github.io/setup-guide/code-301/3-code-challenges), in the Code 301 Setup Guide.

## Repository Quick Tour and Usage

### 301 Code Challenges

Under the `data-structures-and-algorithms` repository, at the top level is a folder called `code-challenges`

Each day, you'll add one new file to this folder to do your work for the day's assigned code challenge

### 401 Data Structures, Code Challenges

- Please follow the instructions specific to your 401 language, which can be found in the directory below, matching your course.


__________________________________________________________________________________

# Reverse an Array
dealing with arrays using Java language 

## Challenge
the challenge required to write a function that takes in an array and reverse it so that the last index is the first and so on.

## Approach & Efficiency
 I used a simple for loop to reverse the values of each index starting from the last to first. 

## Solution
![](/assets/whitebored1.PNG)


______________________________________

# binarySearch array 
dealing with arrays using java language

## Challenge
 write a function that takes in an array and an integer and return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency
 i used the binarySearch approach where i divided the array by half multiple times and search for the integer 

## Solution
![](/assets/lab-3whitebored.PNG)

_________________________________________________________________________________

# Singly Linked List
Dealing with linkedLists 

## Challenge
Create
- a Node class 
that has a value and a pointer
- LinkedList class 
that has a head property
a method called `insert`, which takes any value as an argument and adds a new node with that value to the head of the list 
a method called` includes`,  takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
 a method called `toString`, takes in no arguments and returns a string representing all the values in the Linked List 


## Approach & Efficiency
looping over the list, checking if it is empty of not.
if empty add the new added value to the head and so on. 

the big O here is of type O(N)

## API
a method called `insert`, which takes any value as an argument and adds a new node with that value to the head of the list 
a method called` includes`,  takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
 a method called `toString`, takes in no arguments and returns a string representing all the values in the Linked List 
__________________________________________

 > # challenge 6 

 ## Challenge Summary
 continuation of the linkedList.


 ## Challenge Description
 add on the: 

- LinkedList class 
that has a head property
a method called `append`, which takes a value as an argument and adds a new node with that value to the last node of the list 
a method called` insertBefore`,  takes in a value and a new value as arguments and compares the value with the nodes of the linkedList (use the include method to test if the value exists in the linkedList or not if it dose add the new value before the node that matches the value if not throw an exception)

 a method called `insertAfter`, takes in two arguments a value and a new value and compares the value with the nodes of the linkedList (use the include method to test if the value exists in the linkedList or not,  if it dose add the new value after the node that matches the value if not throw an exception)
  returns a string representing all the values in the Linked List 


## Approach & Efficiency
the big O here is of type O(N)
we are gonna loop over the linkedList and each time implement the function based on the condition 


## Solution

![](/assets/challenge-6A.PNG)
![](/assets/challenge-6B.PNG)
![](/assets/challenge-6C.PNG)


______________________________________________

> # challenge-7 


 ## Challenge Summary
 continuation of the linkedList.


 ## Challenge Description
 add on the: 

- LinkedList class 
that has a head property
a method called ` kthValue`,
that takes in an integer k and return the value of the node in the index that matches the K value form the end of the linked list. if k doesn't match any index value or it is in valid 
return an error message 


## Approach & Efficiency
the big O here is of type O(N)
we are gonna loop over the linkedList and each time implement the function based on the condition 


## Solution

![](/assets/challenge-7.PNG)
______________________________________________



> # challenge 8 


 ## Challenge Summary
 continuation of the linkedList.


 ## Challenge Description
 add on the: 

- LinkedList class 
that has a head property
a method called `zipLists`,
that takes in two linked lists merges the two linked lists together into one and alternate between the two lists and return the merged list




## Approach & Efficiency
the big O here is of type O(N)
we are gonna loop over both linkedLists and each time implement the function based on the condition 


## Solution

![](/assets/challenge-8.PNG)

_________________________________________ 



> # challenge 10 

## Stacks and Queues
Dealing with Stacks and Queues 

## Challenge
classes: 
-  ## `Stack class`
 with a the property  Node top.
which has 4 methods:
1. push 
2. pop
3. peek
4. isEmpty 
 - ## `Queue class`
 with a the properties Node front, Node rear. 

 which has 4 methods:
 1. enqueue
 2. dequeue
 3. peek
 4. isEmpty

  - ## `Node class` 
 with the properties int value and Node next.

## Approach & Efficiency
all the functions had a O(n) complexity


## API

 ## In The Stack Class
 ___________________________________
 <span style="color:red">1.push</span>.
which takes any value as an argument and adds a new node with that value to the top of the stack.


<span style="color:red">2.pop</span>.
which does not take any argument, removes the node from the top of the stack, and returns the node’s value.
NOTE:
it Should return an exception it the stack is empty.


<span style="color:red">3.peek</span>.
which does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
NOTE:
it Should return an exception it the stack is empty

<span style="color:red">3.isEmpty</span>.
 that takes no argument, and returns a boolean indicating whether or not the stack is empty.


## In The Queue class _______________________________________________

<span style="color:red">1.enqueue</span>.
which takes any value as an argument and adds a new node with that value to the back of the queue

<span style="color:red">2.dequeue</span>.
hat does not take any argument, removes the node from the front of the queue, and returns the node’s value.
NOTE:
it Should return an exception it the queue is empty.


<span style="color:red">3.peek</span>.
 that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
NOTE:
it Should return an exception it the queue is empty

<span style="color:red">3.isEmpty</span>.
 that takes no argument, and returns a boolean indicating whether or not the queue is empty.

 _______________________________________

 > # challenge-11

 ## Challenge Summary
dealing with Pseudo Queues 

## Challenge Description
classes:
- `PseudoQueue` 
it has two properties of type stack s1 and s2.

methods: 
- `enqueue`
this method pushes the input value to the first stack.

- `dequeue`
pushes the values of the first stack to the the second stack in order to reverse it then it 
pops of the top of the second stack.

so that it follows the first in first out principle

## Approach & Efficiency
- `enqueue` big O of one O(1), I don't have any loops 
- `dequeue` big O of n O(n), I have a while loop 

## Solution

![](/assets/challenge-11.PNG)

__________________________________



>#  challenge-12

 ## Challenge Summary
First-in, First out Animal Shelter

## Challenge Description
classes:
- `cat` 
it has a property of type String name, this class extends animal class
- `dog` 
it has a property of type String name, this class extends animal class

-  `animal` 
it has a property of type String name.
-  `Queue` 
it has a property of type String name.

  - `Node class` 
 with the properties object value and Node next.

 - `Queue class`
 with a the properties Node front, Node rear. 

 which has 4 methods:
 1. enqueue
 2. dequeue
 3. peek
 4. isEmpty

methods: 
- `enqueue`
this method pushes the input value to the first stack.

- `dequeue`
pushes the values of the first stack to the the second stack in order to reverse it then it 
pops of the top of the second stack.

so that it follows the first in first out principle

-  `AnimalShelter` 
where created an array of objects of type Queue 

methods: 
- `enqueue`
this method adds animal  array object to the queue, it checks if the animal is a dog or cat. 
and it defines an object array of length 2, the first index will be the name of the animal and the second index will be the type 
if neither of them it throws an exception. 

- `dequeue`
this method checks if the pref inputted from the user, if it is null or a cat or a dog or neither 
if it is anything other than a cat or a dog it will return null. 
if it is a cat it will check the peek of the queue, if it matches the input it will dequeue the peek and return its value. 
if it doesn't match it will dequeue the peek, return the value of it then enqueue it back again 

## Approach & Efficiency
- `enqueue` big O of one O(1),
- `dequeue` big O of n O(1),

## Solution

![](/assets/challenge-12-A.PNG)

_____________________________________
![](/assets/challenge-12-b.PNG)
________________________________________
![](/assets/challenge-12-c.PNG)
______________________________________


> # challenge-13

## Challenge Description
classes:
  - `Node class` 
 with the properties object value and Node next.

 - `MultiBracketValidation class`


 which has a multiBracketValidation method, that takes in an input String and returns a boolean 
 

methods: 
- `multiBracketValidation`
this method takes in an input String, 
it has a hash map called map and a stack of type character called stack.
 the map has the following keys and values:
('[', ']')
('{', '}')
('(', ')')

this method loops over the input length and stores the index it is on in a variable called current of type character. 
then it checks if this current is one of the keys in the map or not, if so it adds it to the stack 
if not it checks if the current is one of the values of the map, if so, it checks if the stacks is empty or not and if the stack peek passes the value of peek to the map as key and then gets the value of this key and checks if it is equal to the current or not , if so it pops it 
if not returns false 
 

## Approach & Efficiency
- `multiBracketValidation` big O of one O(n),


## Solution

![](/assets/challenge-13-A.PNG)
![](/assets/challenge-13-B.PNG)


> # challenge-15

## Trees
Dealing with Trees 

## Challenge
classes: 

- ` Node class`,  has properties int value, Node left and Node  right. 

- `BinaryTree class`, 
methods:

- `preOrder`
 returns an array of the values, ordered appropriately.
 root >> left >> right

- `inOrder`
returns an array of the values, ordered appropriately.
left >> root >> right

- `postOrder`
returns an array of the values, ordered appropriately.
left >> right >> root

- `BinarySearchTree class`
methods:

- `Add`
takes in a value and adds a new node with that value in the correct location in the binary search tree.

- `contains`
a value, and returns a boolean indicating whether or not the value is in the tree 


## Approach & Efficiency
the PreOrder method, inOrder and PostOrder implement the depth first traversals. 
the big O:
O(n)will have to look at n items, hence the O(n) complexity.

the contains method takes a log(n), 

## API

- `preOrder`
 
root node, then the left , and finally the right 
root >> left >>  right
- `inOrder`
 first visiting the left , then the root node, and finally the right
left >> root >> right

- `postOrder`
 left, the right, and the root node at the end
left >> right >> root

- `BinarySearchTree class`
methods:

- `Add`
in this method, we will check if the node is null, insert the new node in that position. 
if the new node's value is lower than the current node's, we go to the left
if the new node's value is greater than the current node's, we go to the right


- `contains`
 this method checks if the tree contains a specific value or not 
 first check if the node is null,if so return false
  if not then compare the value to the value in the current node, then continue in the left or right child depending on that.

  __________________________________

  > # challenge-16

## Trees
 continuation of dealing with Trees 

## Challenge
classes: 

- ` Node class`,  has properties int value, Node left and Node  right. 

- `BinarySearchTree class`

- `BinaryTree class`

methods:
a new method called 
- find-maximum-value, this method returns the maximum value stored in the tree it was called on. 


## Approach & Efficiency
O(n)will have to look at n items, hence the O(n) complexity, where n is the number of nodes in binary tree.

## API

- `find-maximum-value`

 this method goes throw the tree and checks its values, compere these values with each other,
 each node it checks it takes its value and compare it to the previous one, first it will check if the node is null,if so  it will call a null pointer exception. 
 if it has nodes then it will start from the root, take its value and store it as the initial corrasion value. the it will use recession to check the left and right children with their values and store them in a left and right variables then compare these variables with the value i have. 
 if the right is bigger than the left that means I will set the comparison value to the right node's value and compare it with the next and so on.
 if it is lower it will go  for the left value 
 and finally when I end up with what will be the maximum value I will return it to the user. 


 
![](/assets/1111.PNG)


 __________________________________

  > # challenge-17

## Trees
 continuation of dealing with Trees 

## Challenge
classes: 

continuation on the -> 
- `BinaryTree class`

methods:
a new method called 
- breadthFirst, this method  takes a Binary Tree as its unique input -> Traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.

  

## Approach & Efficiency
O(n)will have to look at n items, hence the O(n) complexity, where n is the number of nodes in binary tree.

## API

- `breadthFirst`

 this method goes traversal iterates through the tree by going through each level of the tree node-by-node.
 IT uses a queue to traverse the width/breadth of the tree.
 it starts by checking if the tree is empty ot not, if so it returns a null pointer exception. 
 if not it starts with the root node. as it is passed when the function is called. 
 then it loops over the queue length using a while loop, in the first titration it will have the root loop over it and polling it out of the queue and taking its value and storing it in a variable called temp, then checks if it has left and right children. if so they will be added to the queue (nodes) and their values will be added in a list called result at the end I would have all values of the nodes in the tree stored in the result list and in a breadth first approach and then return that list.  
 


![](/assets/challenge-17-A.PNG)
![](/assets/challenge-17-B.PNG)


 __________________________________

  > # challenge-18

## Trees
 continuation of dealing with Trees 

## Challenge
classes:  
create -> 
- `FizzBuzzTree`

methods:
a new method called 
- FizzBuzzTree, this method  takes a Binary Tree as its input -> Traverse the input tree and checks whether or not the value of each node is divisible by 3, 5 or both if so return the tree with its values set to "Fizz", "Buzz" and "FizzBuzz accordingly. 

  

## Approach & Efficiency
O(n)will have to look at n items, hence the O(n) complexity, where n is the number of nodes in binary tree.

## API

-  `FizzBuzzTree`

 this method takes in a tree and a node root, it traversal through the tree using any of the available methods of traversing written perviously in the binary tree class,for demonstration inOrder approach was used, 
 first check if the tree is empty or not, if so return the empty tree.
  If not it goes through the tree starting form the root and checks if it is divisible by 3 or 5 or both and accordingly returns "Fizz", "Buzz" and "FizzBuzz".
 then it check the left and right if they exists or not, if so check their values
 finally return the tree with the modified values

 



![](assets/challenge-18.PNG)









_________________________________________________________________________


># challenge 26 

# Challenge Summary
an insertionSort function that takes in an array and sorts it form the smallest element to the largest 

## Whiteboard Process

![](assets/challenge26B.jpg)

![](assets/challenge-26A.jpg)

## Approach & Efficiency
big O of O(n^2) I have a loop inside a loop 

## Solution
you can run the code by creating an object from the InsertionSort class then using that object to call the function insertionSort and pass in the array you want to sort. 

_________________________________________

># challenge 27 

# Challenge Summary
an MergeSort function that takes in an array and divides it onto halves then sorts them form the smallest element to the largest 

## Whiteboard Process
check the blog.md
## Approach & Efficiency
big O of O(log(n))  

## Solution
you can run the code by creating an object from the MergeSort class then using that object to call the function mergeSort and pass in the array you want to sort. 



