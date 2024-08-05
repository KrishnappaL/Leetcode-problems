package codes;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class ValidSudoku {
		List<Character> list = new ArrayList<>();
		Map<String, List<Character>> map = new HashMap<>();
		public static void main(String[] ar) {
			char[][] board = new char[][] {
	            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
	            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
	            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
	            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
	            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
	            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
	            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
	            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
	            { '.', '.', '.', '.', '8', '.', '.', '7', '7' }
	        };
	        ValidSudoku v=new ValidSudoku();
	       System.out.println( v.isValidSudoku(board));
	       
}		    public boolean isValidSudoku(char[][] board) {
		        boolean[][] row = new boolean[9][9];
		        boolean[][] col = new boolean[9][9];
		        boolean[][] sub = new boolean[9][9];
		        for (int i = 0; i < 9; ++i) {
		            for (int j = 0; j < 9; ++j) {
		                char c = board[i][j];
		                if (c == '.') {
		                    continue;
		                }
		                int num = c - '0' - 1;
		                int k = i / 3 * 3 + j / 3;
		                if (row[i][num] || col[j][num] || sub[k][num]) {
		                    return false;
		                }
		                row[i][num] = true;
		                col[j][num] = true;
		                sub[k][num] = true;
		            }
		        }
		        return true;
		    }
		}
	