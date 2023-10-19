# Approach
Apply binary search to both rows and columns of the matrix. Start with the rows, every iteration check if the target is between
the start and end values of that row. If yes, apply binary search within that row.

# Complexity
- Time complexity:
  $O(log(mn))$

- Space complexity:
  $O(1)$