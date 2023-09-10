# Valid 9x9 Sudoku

## Approach
Iterate through the Sudoku array, and maintain a set each for rows, columns. 

For grids, maintain 3 separate sets. Each set would for account for a grid encountered when iterating from either left to right or top to bottom - so horizontally or vertically (you can choose to add to grid sets in
any of these ways, I chose to do it horizontally - you can see this in the code -
```&& !gridSetRow3To5.add(board[i][j])```. If this was laid out vertically then we would be using ```[j][i]``` indices instead.).

## Complexity
- Time complexity: $$O(n2)$$

- Space complexity: $$O(n2)$$