# Approach
Example - ```["2","1","+","3","*"]``` -> iterate through this given array and push each of the integers to a stack.
Whenever we encounter an operand, we pop the last two elements of the stack and use the operand to operate on the two
popped values from the Stack. The result is then pushed back onto the stack again.

The final result should be that the set will just have one element at the end. This is our result.


# Complexity
- Time complexity:
  $O(n)$

- Space complexity:
  $O(n)$