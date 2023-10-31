# Approach
Iterate through the linked list and add all the nodes to a hashset. If a value is repeated, the list is cyclic - return the node.
If there is a null value, that means its the end of an acyclic list.

# Complexity
- Time complexity:
  $O(n)$

- Space complexity:
  $O(n)$