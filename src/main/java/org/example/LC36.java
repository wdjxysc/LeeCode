package org.example;

import java.util.HashMap;
import java.util.Map;

public class LC36 {
    /**
     * 笨办法
     * @param board
     * @return
     */
    public static boolean isValidSudoku(char[][] board) {
        boolean res = true;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 9; i++){
            map = new HashMap<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    String c = board[i][j] + "";
                    if(map.getOrDefault(c, 0) > 0){
                        return false;
                    }else{
                        map.put(c, 1);
                    }
                }
            }
        }


        for(int j = 0; j < 9; j++){
            map = new HashMap<>();
            for(int i = 0; i < 9; i++){
                if(board[i][j] != '.') {
                    String c = board[i][j] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                map = new HashMap<>();
                if(board[i*3][j*3] != '.'){
                    String c = board[i*3][j*3] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3][j*3+1] != '.'){
                    String c = board[i*3][j*3+1] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3][j*3+2] != '.'){
                    String c = board[i*3][j*3+2] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3+1][j*3] != '.'){
                    String c = board[i*3+1][j*3] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3+1][j*3+1] != '.'){
                    String c = board[i*3+1][j*3+1] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3+1][j*3+2] != '.'){
                    String c = board[i*3+1][j*3+2] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3+2][j*3] != '.'){
                    String c = board[i*3+2][j*3] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3+2][j*3+1] != '.'){
                    String c = board[i*3+2][j*3+1] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
                if(board[i*3+2][j*3+2] != '.'){
                    String c = board[i*3+2][j*3+2] + "";
                    if (map.getOrDefault(c, 0) > 0) {
                        return false;
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        char[][] board1 = new char[][]{{'8','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board1));
    }
}
