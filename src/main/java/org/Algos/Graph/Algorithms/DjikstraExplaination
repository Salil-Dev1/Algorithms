Djikstra's Algorithm workings. 
How does exactly Djisktra's Algorithm works and why is it needed ? 

If we Are studying Graphs we know that there are mainly two ways we can traverse a graph , one is Depth First Search (DFS) and Breath First Search (BFS).
In DFS we explore all the nodes one by one and in BFS we traverse them level wise. Now there are times when we have to find the minimum distance between
nodes, we have a source and a destination and we want to know what's the shortest path between them. Djisktra's Algorithm is the thing.
From GPS navigation systems and map desination system in video games, Djikstra's Algorithm is the foundational algorithm to find the shortest path between two
nodes.


 IMPLEMENTATION

REQUIREMENTS
* We can implement Djikstra's Algorithm using a Priority Queue which takes minimum distance as peek elements, or you can also say it as a min Heap data structure.
* A Distance Array of size V (Number of Nodes) in which all indices are initially set to Integer.MAX_VALUE, so we can update it as we find smaller distances along the way.
* A Pair of Distance, Row, Column. This will be our main structure of how we will push values into the Priority Queue, since Pair is not directly available in java, we will create a class Pair and call it's constructor when we put values inside Priority Queue.

INTUITION
* We are making a program to get the shortest path a node should take in order to reach a particular node. for Example, if I am travelling from India to America, either I can get a flight straight to America or I can go to UK first then rest of the Europe and then America. It's obvious which one is the shortest so similarly at each step we compare the distances from the previous node to every other node and if it's smaller than the distance we previously recorded, we update that distance and proceed further. At the end we are left with the smallest path required to reach the destination node.

PROCESS
* Create a Pair class with three attributes, distance, row, col.
* set all distance array to Integer.MaxValue or 1e9.
* Create a priority queue with custom comparator defined to automatically prioritize the smallest distances in the queue.
* push source node with distance 0 and coordinates into the minheap
* start a loop till minheap is not empty.
* extract the row, col and distance from the peek value and check if the distance with adjacent nodes is smaller than previous distance, if it is, then update the distance array and push the distance and coordinates again into the minheap.
*  Previous distance was infinite so all the distance array values will get updated.
*  Add thr
* the minimum distances will automatically be prioritized in the queue. 
* The distances will not enter the minheap which are larger than prerecorded distances.
* After the minHeap is empty simple print the distance array and we have our shortest path ready.

  NOTE : One Very critical thing to keep in mind is that, Djikstra's Algorithm can't be applied when we have negative values as distances in the graph. If we do so, it will undergo an infinite loop and program will fail. So Djikstra's Algorithm is not applicable when distances have negative values.
  

     
