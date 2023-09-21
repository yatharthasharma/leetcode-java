# Approach
Sort positions by descending order to know the order of cars from start to end. Calculate time taken for each car 
to get to the target distance. 

If a following car is taking lesser time than the car in front of it, then the fleet value will not increase. If a 
following car is taking longer to get to the target than the preceding car, then the fleet value will increase as
the slower car will be part of a new fleet.

# Complexity
- Time complexity:
  $O(nlog(n))$ - sorting is $O(nlog(n))$ + iterating through the array $O(n)$

- Space complexity:
  $O(n)$