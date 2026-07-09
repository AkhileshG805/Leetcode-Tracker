// Last updated: 7/9/2026, 3:12:08 PM
class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '.'|| i > 0 && board[i - 1][j] == 'X' || j > 0 && board[i][j -1] == 'X') continue;
                count++;
            }
        }
        return count;
    }
}