# Approach
Normal binary search [iteration 2 template](https://leetcode.com/explore/learn/card/binary-search/126/template-ii/937/).

Keep a track of the minimum number of all the bad numbers you have encountered (the variable $firstBadVersion$ in this case).

# Complexity
- Time complexity:
  $O(log(n))$ - array is being halved in every iteration

- Space complexity:
  $O(1)$