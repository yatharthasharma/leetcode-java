# Approach

1. Sort the array.
2. Fix one number (outer for loop), and treat the problem as two sum problem by trying to find the other two numbers.
3. Sort the three numbers once you find them out, add them to a set, and finally return a list of the set items.


# Complexity
- Time complexity:
  $O(n^2)$ - this is sorting plus two loops, one for fixed number and the other for two sum pointers so - $O(n^2)$ + $O(nlogn)$

- Space complexity:
  $O(n)$