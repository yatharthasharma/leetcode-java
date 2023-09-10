package com.leetcode.arraysandhashing.validsudoku;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> characterSetHorizontal = new HashSet<>();
        Set<Character> characterSetVertical = new HashSet<>();
        Set<Character> gridSetRow0To2 = new HashSet<>();
        Set<Character> gridSetRow3To5 = new HashSet<>();
        Set<Character> gridSetRow6To8 = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            characterSetHorizontal.clear();
            characterSetVertical.clear();
            if (i == 3 || i == 6) {
                gridSetRow0To2.clear();
                gridSetRow3To5.clear();
                gridSetRow6To8.clear();
            }
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.' && (!characterSetHorizontal.add(board[i][j]))) {
                    return false;
                }
                if (board[j][i] != '.' && (!characterSetVertical.add(board[j][i]))) {
                    return false;
                }

                if ((j <= 2) && board[i][j] != '.' && !gridSetRow0To2.add(board[i][j])) {
                    return false;
                }

                if ((j >= 3 && j <= 5) && board[i][j] != '.' && !gridSetRow3To5.add(board[i][j])) {
                    return false;
                }

                if ((j >= 6 && j <= 8) && board[i][j] != '.' && !gridSetRow6To8.add(board[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}