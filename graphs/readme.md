

# Graphs


## Challenge
  create a Graph. The graph should be represented as an adjacency list, and should include the following methods:

   `AddNode()`
- `AddEdge()` 
- `GetNodes()` 
- `GetNeighbors()`
- `Size()`


## Approach & Efficiency
big O 

- `AddNode()` method --> O(1)
- `AddEdge()` --> O(1)
- `GetNodes()` --> O(1)
- `GetNeighbors()`--> O(1)
- `Size()`-->O(1)



## API

- `AddNode()` method 
Adds a new node to the graph, takes in a value and adds it to the graph 

- `AddEdge()`
Adds a new edge between two nodes in the graph
Include the ability to have a “weight”
Takes in the two nodes to be connected by the edge
checks both nodes are in the Graph
checks if  it doesn't have a weight
it adds an edge between them , it instantiate a new edge and pass it the value of the second node 
then it  adds an edge between the first and the second 



- `GetNodes()`
Returns all of the nodes in the graph as a collection 
checks first if the graph has nodes using the size method then returns the graph  

- `GetNeighbors()`
Returns a collection of edges connected to the given node and their weights

 it checks using the `getneighbors` method if it has neighbors or not
 aka  checks  if the check node has any neighbors return them

- `Size()`
Returns the total number of nodes in the graph



> # Code Challenge: Class 36
 

 # Challenge Summary
Implement a breadth-first traversal on a graph.

## Whiteboard Process
![](../assets/BFS.jpg)

## Approach & Efficiency
This solution would take O(n) time , we will visit every nodes.
the  Space  would take O(n) because of the queue.

## Solution

first you will check if the graph is empty or not using the size() method, if so return empty graph. 
If not, you will declare a new queue -->graph queue 
and a new list --> visited , and a list --> nodes 

you will add the node that is passed with the  BreadthFirst method to the queue and the visited list 
then you will loop over the queue (as long as it is not empty)
you will remove the node form the queue and store it in a node variable, add it to the nodes list 
create a new list --> neighborsEdge and add to it the neighbor of that node. 
loop over neighborsEdge and check if the nodes inside it are visited or not, if so --> continue. 
If not and this node to the visited list and to the queue 
finally return the nodes lits --> in this case you will declare a variable of type string and return the node list as a string 




