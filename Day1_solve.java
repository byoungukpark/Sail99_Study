import java.util.Arrays;

class Solution {
    public int[] change_to_index(long num, int n){
        int[] result = new int[2];
        long l_n = Long.valueOf(n);

        result[0] = Long.valueOf(num / l_n).intValue();
        result[1] = Long.valueOf(num % l_n).intValue();

        return result;
    }

    public int[] solution(int n, long left, long right) {
        int[] answer = {};

        int ret = Long.valueOf(right - left).intValue() + 1;
        int[] cut_board = new int[ret];

        for(int i = 0; i < ret; i++){
            long l_ret = Long.valueOf(i);
            int[] x_y_index = change_to_index(left + l_ret, n);

            cut_board[i] = (x_y_index[0] > x_y_index[1]) ? x_y_index[0] + 1 : x_y_index[1] + 1;
        }
        answer = cut_board;

        return answer;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Solution instance = new Solution();

        int n = 4;
        long left = 7;
        long rigjt = 14;

        int[] ans = instance.solution(n, left, rigjt);
        System.out.println(Arrays.toString(ans));
    }
}


/*
 * 
 * int[][] board = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = (i > j) ? i + 1 : j + 1;
            }
        }

        int[] flat_board = new int[n * n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                flat_board[i*n + j] = board[i][j];
            }
        }
 * 
 */
