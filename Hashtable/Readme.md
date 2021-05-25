
# HashTable 
a collection that is used to store in the form of key-value items, where you can store the key into a data structure, and quickly retrieve the value

## Challenge

we are required to Implement a HashTable with an 


- `Add method` to be able to add a key and a value to the array and  hash the key, and add the key and value pair to the table, handling collisions as needed.

- `get` it takes in the key and returns the value from the table.

- `contains` it takes in the key as an input and checks if the key exists in the table or not and returns a boolean. if the key exists it will return true. 
If not it will return false. 

- `hash` this method takes in a key,  hashes it and returns an index number in the collection.


## Approach & Efficiency
 - hash tables provide constant-time` O(1)` lookup on average, it doesn't loop n times to find the key you want, instead it goes straight for the index that holds that value regardless of the number of items in the table.
  - For the worst-case lookup time in most hash table schemes is O(n). where you have a lot of collisions (almost as much as n)in the same index. 

## API

- `add() function` this functions adds a new (key, value) entry in the hash table. 
first it checks for the size of the table 'hashArray' then if the size has gotten greater thant the table's length it calls the `resize()` method that doubles the size of the table and so on. 

then it declares an index value, this value is the index where you are going to store the (key, value) in. to get that index you'll need to call the `hash() function` and pass the key to be hashed to generate your index. 

you will check if the index you have, where you want to store the key and value is equal to null(that means that there is no existing key in that index inside the table) if it is true Aka empty index then instantiate a new linked list inside that index and add the key, value inside it. 
you will increase the size of the hashArray by one each time you add a new key, value entry. then return. 

if the index is not empty and already has a key, you will loop over the nodes inside the index of the hashArray and check if the key you are passing is equal to the pre-existing key or not., if so replace the value of that key to the new value you are passing. 
If not, then you will add the new key inside the linked list of that index. 
you will increase the size and then return. 


- `get() function`

in  this function you will pass the key, 
get an index for that key, again by calling the hash() method and passing in the key. 
you will then check if that index in the hashArray is empty or not. 
If so , return null
If not, you will loop over the nodes in the linked list in that index of the  hashArray and check, if the key you have inside that node is equal to the you have passed into the get() method. 
If so, return the value for that key. 
If not, return null; 


- `contains() function`
this function will take a key as an input and will return a boolean based on if that key exists in the hash table or not 
 first you will take the passed key and check if it is equal to null, if so return false. 
Id not, you will get the index for that key by calling the hash() function 
then you will check if that index in hashArray is equal to null or not. If so return false. 

If not, you will loop over each node inside that index in the hashArray and check if the passed key equals the key in the node. If so , return true else return false. 




