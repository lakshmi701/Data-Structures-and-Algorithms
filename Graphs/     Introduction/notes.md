# Graph – Introduction

## What is a Graph?

A graph is a data structure used to represent connections between objects.

- Vertices (V) → nodes
- Edges (E) → connections

Graph is written as **G(V, E)**

---

## Types of Graphs

### Undirected Graph
Edges have no direction.

### Directed Graph
Edges have direction. Example: 0 → 1

---

## Example Graph

0 —— 1
| |
2 —— 3


---

## Adjacency Matrix

If there is an edge between i and j → matrix[i][j] = 1  
Else → 0

### Adjacency Matrix for above graph

|   | 0 | 1 | 2 | 3 |
|---|---|---|---|---|
| 0 | 0 | 1 | 1 | 0 |
| 1 | 1 | 0 | 0 | 1 |
| 2 | 1 | 0 | 0 | 1 |
| 3 | 0 | 1 | 1 | 0 |

---

## Indegree and Outdegree (Directed Graph)

- **Indegree** → Number of edges coming into a vertex
- **Outdegree** → Number of edges going out from a vertex

### Example

If:

0 → 1
2 → 1

Indegree of 1 = 2

If:

1 → 3
1 → 4

Outdegree of 1 = 2

---

## Space Complexity

Adjacency Matrix uses **O(V²)** space.

---

## Applications of Graphs

- Social networks
- Maps
- Network routing
- Dependency problems
