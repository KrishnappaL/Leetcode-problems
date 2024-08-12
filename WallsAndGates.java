package codes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WallsAndGates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][]	rooms = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
	wallsAndGates(rooms);
	}
	    public static void wallsAndGates(int[][] rooms) {
	        int m = rooms.length;
	        int n = rooms[0].length;
	        java.util.Queue<int[]> q = new LinkedList<int[]>();
	        Set<String> visited=new HashSet<>();
	        for (int i = 0; i < m; ++i) {
	            for (int j = 0; j < n; ++j) {
	                if (rooms[i][j] == 0) {
	                    q.offer(new int[] {i, j});
	                    visited.add(i +","+j);
	                }
	            }
	        }
	        //BFS
	        int d = 0;
	        int[] dirs = {-1, 0, 1, 0, -1};
	        while (!q.isEmpty()) {
	            ++d;
	            for (int i = q.size(); i > 0; --i) {
	                int[] p = q.poll();
	                for (int j = 0; j < 4; ++j) {
	                    int x = p[0] + dirs[j];
	                    int y = p[1] + dirs[j + 1];
	                    if (x >= 0 && x < m && y >= 0 && y < n && rooms[x][y] == Integer.MAX_VALUE) {
	                        rooms[x][y] = d;
	                        q.offer(new int[] {x, y});
	                        visited.add(x+ ","+y);
	                    }
	                }
	            }
	        }
	    }
	}

