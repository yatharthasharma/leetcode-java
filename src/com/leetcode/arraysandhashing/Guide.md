# Contains Duplicate

## Approach
Iterate through the array of numbers. Add numbers seen for the first time to a hashmap.
If the number is already present in the hashmap, return true.
Otherwise return false.

## Complexity
- Time complexity:
$$O(n)$$

- Space complexity:
$$O(n)$$

# Anagrams

## Approach
Add characters and the number of their occurrences to a hashmap.
Use the hashmaps to do the comparison later (in terms of characters seen AND if seen then how many occurrences)

## Complexity
- Time complexity:
  $$O(n)$$

- Space complexity:
  --