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

 > challenge 6 

 # Challenge Summary
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


> challenge-7 


 # Challenge Summary
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


> challenge 8 


 # Challenge Summary
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

