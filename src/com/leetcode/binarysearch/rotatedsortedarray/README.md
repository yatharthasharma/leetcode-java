# Approach
We are going to use binary search here. Take two pointers, one starting from the front/left and the other from the back/right of the
array of numbers. While the first(left) pointer is smaller than the second (right) pointer, iterate through the array of numbers.
Get mid value of both the pointers each time the loop runs.

# Complexity
- Time complexity:
  $O(log(n))$ - numbers being considered for search are being halved each iteration. 

- Space complexity:
  $O(1)$