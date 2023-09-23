# Approach
Take two pointers to keep a track of the indices between which we would like to search for the target at any given point
in the iteration.

Halve the sum of indices and start the search from there as it is the mid point of given sorted array. If the search result
from the mid-point is greater than the target, then search in the right half otherwise search in the left half.

Re-assign pointer 2 to middle of the array if in the next iteration we want to search in the left half, otherwise re-assign
pointer 1 to middle of the array for the right half.

# Complexity
- Time complexity:
  $O(log(n))$ - array is being halved in every iteration

- Space complexity:
  $O(1)$