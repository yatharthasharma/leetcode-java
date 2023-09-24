# Approach
Do a binary search with two pointers $(0, x)$. If the middle value multipled by itself is equals to the value $x$, return
the middle value. If it is greater than $x$, keep the search ongoing. If it is lower, assign the current maximum value to
be returned as the current middle value, and keep iterating until the first pointer is bigger in value than the second
pointer as that would mean you have traversed through all the elements in the range $[0, x]$.

# Complexity
- Time complexity:
  $O(log(n))$ - array is being halved in every iteration

- Space complexity:
  $O(1)$