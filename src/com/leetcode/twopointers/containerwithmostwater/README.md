# Approach
Take two pointers to count from opposite ends of the height array. While the first pointer value is lower than the second
pointer value, use them to iterate through the array of heights. Check the area that is covered by heights in the array on
the pointer positions, and if it is higher than the max area previously set, then this would be the new max area.

Finally, increment the pointer value for which the height is lower in each iteration.


# Complexity
- Time complexity:
  $O(n)$

- Space complexity:
  $O(1)$