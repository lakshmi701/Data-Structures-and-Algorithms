# Coin Change – Minimum Coins (DP)

## Problem
Given coins and a target amount, find the minimum number of coins needed.

## Idea
If coin ≤ i  
dp[i] = min(dp[i], 1 + dp[i - coin])

## Base Case
dp[0] = 0

## Coins Used
1, 5, 15, 60

## Time Complexity
O(amount × number_of_coins)
