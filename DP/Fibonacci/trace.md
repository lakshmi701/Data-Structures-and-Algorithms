# Fibonacci – Complete Tracing

**Input:** n = 5  
**Output:** 5  

---

## 1. Brute Force (Pure Recursion)

### Recurrence
F(n) = F(n-1) + F(n-2)

### Recursive Expansion

F(5) = F(4) + F(3)  
F(4) = F(3) + F(2)  
F(3) = F(2) + F(1)  
F(2) = F(1) + F(0) = 1  

### Substituting Values

F(3) = 1 + 1 = 2  
F(4) = 2 + 1 = 3  
F(5) = 3 + 2 = 5  

### Observation
- F(3) computed multiple times  
- F(2) computed multiple times  
- Time Complexity: O(2^n)

---

## 2. Memoization (Top-Down DP)

### Initial DP Array

| Index | 0 | 1 | 2 | 3 | 4 | 5 |
|-------|---|---|---|---|---|---|
| Value | -1 | -1 | -1 | -1 | -1 | -1 |

### Computation Steps

| Step | Computed | Update |
|------|----------|--------|
| 1 | F(2) = 1 | dp[2] = 1 |
| 2 | F(3) = 2 | dp[3] = 2 |
| 3 | F(4) = 3 | dp[4] = 3 |
| 4 | F(5) = 5 | dp[5] = 5 |

### Final DP Array

| Index | 0 | 1 | 2 | 3 | 4 | 5 |
|-------|---|---|---|---|---|---|
| Value | -1 | -1 | 1 | 2 | 3 | 5 |

### Complexity
Time: O(n)  
Space: O(n)

---

## 3. Bottom-Up DP (Iterative)

### Initial Values

prev2 = 0  
prev1 = 1  

### Iteration Table

| i | prev2 | prev1 | current |
|---|-------|-------|---------|
| 2 | 0 | 1 | 1 |
| 3 | 1 | 1 | 2 |
| 4 | 1 | 2 | 3 |
| 5 | 2 | 3 | 5 |

### Final Answer
F(5) = 5  

### Complexity
Time: O(n)  
Space: O(1)

---

## Final Comparison

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(2^n) | O(n) |
| Memoization | O(n) | O(n) |
| Bottom-Up | O(n) | O(1) |
