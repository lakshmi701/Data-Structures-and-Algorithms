
# Graph – Introduction

## What is a Graph?

A graph is a data structure used to represent connections between objects.

- Objects are called **Vertices (V)**
- Connections are called **Edges (E)**

A graph is represented as: **G(V, E)**

---

## Types of Graphs

### 1. Undirected Graph
- Edges do not have direction
- If there is an edge between 0 and 1, we can go both ways

### 2. Directed Graph
- Edges have direction
- Example: 0 → 1 (only one way)

---

## Vertex and Edge

- **Vertex**: A node in the graph
- **Edge**: A connection between two vertices

---

## Adjacency Matrix

It is a way to represent a graph using a 2D matrix.

- If there is an edge between i and j → matrix[i][j] = 1
- Else → matrix[i][j] = 0

### Example

Graph:

0 — 1  
|    |  
2 — 3  

Adjacency Matrix:

0 1 2 3
0 [0 1 1 0]
1 [1 0 0 1]
2 [1 0 0 1]
3 [0 1 1 0]


---

## Indegree and Outdegree (for Directed Graph)

- **Indegree**: Number of edges coming into a vertex
- **Outdegree**: Number of edges going out from a vertex

Example:
If 0 → 1 and 2 → 1  
Indegree of 1 = 2

If 1 → 3 and 1 → 4  
Outdegree of 1 = 2

---

## Space Complexity of Adjacency Matrix

Space = **O(V²)**

Because we use V × V matrix.

---

## Where Graphs are Used

- Social networks
- Maps and navigation
- Computer networks
- Dependency problems
