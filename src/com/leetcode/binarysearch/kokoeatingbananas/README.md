# Approach
Find the maximum number in the list of piles. This should be the maximum number of bananas that
Koko will potentially eat in order to finish all the bananas.

We would need to iterate in the range $[1...max(p)]$ to figure out the lowest number of bananas that Koko can eat per
hour that would suffice the criteria of finishing all the piles within $h$ hours.

# Complexity
- Time complexity:
  $O(p * log(max(p)))$ 

- Space complexity:
  $O(1)$