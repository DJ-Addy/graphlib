# Simple implementation of a Graph in Java

* Supports directed, undirected, weighted and unweighted graphs
* Supports BFS and DFS traversal algorithms
* Not particularly optimized for performance, but should be good enough for small graphs
* Feel free to use this code in your projects

* Part 1: How many components?
Given an undirected, unweighted graph as a list of edges, return the number of components. A component is a collection of nodes that can reach each other. Given N edges, there are always between 1 and N components. (Although given our problem formulation, since we are giving edges, we cannot list a single node by itself).

Practice Test Driven Development!

Generate graph test inputs. Start by drawing these, then turn them into input files that graphlib can read.
Try to figure out the edge cases. What things will break your algorithm? What cases are tricky to implement?
Create a new JUnit file to contain your test cases.
Then finally, implement the code, possibly with copilot, and test it with your test cases.
How confident are you that the code is correct?
Did in class 
* Part 2: Largest island
Find the size of the largest island. The world will be a text file with two ints on one line representing the number of rows and the number of columns, and then row number of strings of length column containing only 0 and 1. Read the input and then print the size of the largest island. Islands are 1s connected either vertically or horizontally or diagonally.

For example:
3 4
1100
0010
1000

This should print 3 because the largest island (the green one) is of size 3.

Again, practice Test Driven Development.

Generate graph test inputs. Start by outlining these, then turn them into input files in the format given above.
Try to figure out the edge cases. What things will break your algorithm? What cases are tricky to implement?
Create a new JUnit file to contain your test cases.
Start with JUnit tests that ensure that you can read the graph correctly.
Write code to read the input files and create a graph (probably make it a static factory method)
Then finally, implement the code (possibly with copilot) for your algorithm and test it.
How confident are you that your code is correct?
Did in class 

* Part 3: Inverse of a graph
Add a method to our graph library that inverts a graph. Given a graph G, its inverse G’ has the same nodes but the opposite edges. So if there is an edge between node A and node B in G, there will no such edge in G’. Similarly, if there is no edge between node A and node B in G, then there will be an edge between A and B in G’.

Create sample graphs.
Write JUnit tests.
Write the code.
Test the code.
Did in class 

* Part 4: Reachability
For each node of a directed graph G, what other nodes can be reached?

Assume G is given as a collection of edges.

Answer in Graph reachablility(Node Start) takes a starting node and returns all nodes reachable to that node and Use in TestDirectedConnectedRespectedRejected
