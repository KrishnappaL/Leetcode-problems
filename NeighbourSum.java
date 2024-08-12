package codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NeighbourSum {
	int[][] grid;
    HashMap<Integer, int[]> valIndexMap = new HashMap<>();
	public static void main(String[] args) {
		//int [][] grid= {{1,2,3},{4,5,6},{7,8,9}};
		//NeighbourSum obj = new NeighbourSum(grid);
		 //System.out.println(obj.adjacentSum(2));
		  //System.out.println(obj.diagonalSum(2));
	List<String> dictionary= Arrays.asList("cat" ,"bat","rat");
		String sentence="the cattle was rattled by the battery";
		replaceWords(dictionary,sentence);
		
	}
	    public static  String replaceWords(List<String> dictionary, String sentence) {
	        Set<String> s = new HashSet<>(dictionary);
	        String[] words = sentence.split(" "); 
	        for (int i = 0; i < words.length; ++i) {
	            String word = words[i];
	            for (int j = 1; j <= word.length(); ++j) {
	                String t = word.substring(0, j);
	                if (s.contains(t)) {
	                    words[i] = t;
	                    break;
	                }
	            }
	        	    }
	        return String.join(" ", words);

	}
    public NeighbourSum(int[][] g) {
        this.grid = g;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                valIndexMap.putIfAbsent(grid[i][j] , new int[]{i,j});
            }
        } 
	    System.out.println(valIndexMap);
    }
    public int adjacentSum(int value) {
        int sum = 0;
        int[] indices = valIndexMap.get(value); 
        int row = indices[0];
        int col = indices[1];
        if(row-1 >= 0) sum += grid[row-1][col];
        if(col-1 >= 0) sum += grid[row][col-1];
        if(row + 1 < grid.length) sum += grid[row+1][col];
        if(col+1 < grid[0].length) sum += grid[row][col+1];
        return sum;
    }
    
    public int diagonalSum(int value) {
        int sum = 0;
        int[] indices = valIndexMap.get(value); 
        int row = indices[0];
        int col = indices[1];
        if(row-1 >= 0 && col-1 >= 0) sum += grid[row-1][col-1];
        if(col+1 < grid[0].length && row-1 >= 0 ) sum += grid[row-1][col+1];
        if(row + 1 < grid.length   && col-1 >= 0)  sum += grid[row+1][col-1];
        if(col+1 < grid[0].length  && row+1 < grid.length ) sum += grid[row+1][col+1];
        return sum;
    }

}
