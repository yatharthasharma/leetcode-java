# Approach
Store ints in a set that are beginning of a new sequence. Try to create the largest sequence of those ints by iterating over their set and trying to find as many elements after as possible.

# Complexity
- Time complexity:
  $O(n)$

- Space complexity:
  $O(n)$

One thing to note here is that two nested for loops do not always make an $O(n^2)$ solution. If you check the nested ```while``` loop for this problem you'd see that the bounds is restricted. (?) - read up more on this so you can explain better.