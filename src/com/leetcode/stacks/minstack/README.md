# Approach
1. Keep a track of all the minimums in a list. Initialise an array to store Stack values. 
2. Store the value of index upto which the array has been filled, and use this value for ```pop``` and ```top``` methods to
retrieve the latest element.
3. Increment this index everytime ```push()``` is called, and add the number to the latest index.
4. In the ```pop()``` method, check if the element is the current minimum of the stack. If it is, remove it from the list of minimums.

# Complexity
- Time complexity:
  $O(1)$ for all the methods

- Space complexity:
  $O(n)$ list of minimums and stack going up linearly based on the number of inputs