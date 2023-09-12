# Approach
Loop through the character array of input string. Add opening braces to a stack. When a closing brace is encountered, 
check if it matches the last added opening brace to the stack. If yes, remove the opening brace from the stack and proceed. 
If no, return false.

Finally, at the end of the iteration, if there are any opening braces left in the stack, 
that means the corresponding closing braces were not present, so return false. Otherwise return true.

# Complexity
- Time complexity:
  $O(n)$ (map is of constant size - the only for loop is iterating through the characters)

- Space complexity:
  $O(n)$ (map is of constant size, stack size will increase linearly based on the input array size)