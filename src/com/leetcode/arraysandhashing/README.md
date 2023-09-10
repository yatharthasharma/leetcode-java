# Contains Duplicate

## Approach
Iterate through the array of numbers. Add numbers seen for the first time to a hashmap.
If the number is already present in the hashmap, return true.
Otherwise return false.

## Complexity
- Time complexity: $$O(n)$$

- Space complexity: $$O(n)$$

# Anagrams

## Approach
Add characters and the number of their occurrences to a hashmap.
Use the hashmaps to do the comparison later (in terms of characters seen AND if seen then how many occurrences)

## Complexity
- Time complexity: $$O(n)$$

- Space complexity: 

# Two Sum

## Approach
Iterate over the array of given numbers. Add numbers with their indices to a hash map. Check if `target - number` is present in the hash map.
If so, return the indices of both `number` and `target - number`.

## Complexity
- Time complexity: $$O(n)$$

- Space complexity: $$O(n)$$

# Group Anagrams

## Approach
Iterate through the array of provided strings. Sort them and check if they are present in an existing map as keys.

Add sorted strings as key in a map. Add all the anagrams as a list of values.

## Complexity
- Time complexity: 

- Space complexity: 


# Product of array except self

## Approach
To avoid an o(n2) time complexity solution, calculating prefix and suffix products for each index, then multiplying them in the final loop.

## Complexity
- Time complexity: $$O(n)$$

- Space complexity: $$O(n)$$

## Improvement (Separate method)
Space complexity is O(1) if not including the output array. Avoided using prefix and suffix arrays.

- Time complexity: $$O(n)$$

- Space complexity: $$O(1)$$