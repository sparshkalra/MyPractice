package com.striver.day14;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	static int R = 3;
	static int C = 5;


	public static void main(String[] args) 
	{
		int v[][] = { { 2, 1, 0, 2, 1 },
					  { 1, 0, 1, 2, 1 },
					  { 1, 0, 0, 2, 1 } };

		System.out.println("Max time incurred: " + rotOrangesBFS(v));
	}

	static int rotOranges(int v[][]) {
		boolean changed = false;
		int no = 2;

		while (true) {
			for (int i = 0; i < R; i++) 
			{
				for (int j = 0; j < C; j++) 
				{

					// Rot all other oranges present at
					// (i+1, j), (i, j-1), (i, j+1), (i-1, j)
					if (v[i][j] == no) 
					{
						if (issafe(i + 1, j) && v[i + 1][j] == 1) {
							v[i + 1][j] = v[i][j] + 1;
							changed = true;
						}
						if (issafe(i, j + 1) && v[i][j + 1] == 1) {
							v[i][j + 1] = v[i][j] + 1;
							changed = true;
						}
						if (issafe(i - 1, j) && v[i - 1][j] == 1) {
							v[i - 1][j] = v[i][j] + 1;
							changed = true;
						}
						if (issafe(i, j - 1) && v[i][j - 1] == 1) {
							v[i][j - 1] = v[i][j] + 1;
							changed = true;
						}
					}
				}
			}

			// If no rotten orange found it means all
			// oranges rottened now
			if (!changed)
				break;

			changed = false;
			no++;
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {

				// If any orange is found to be
				// not rotten then ans is not possible
				if (v[i][j] == 1)
					return -1;
			}
		}

		// Because initial value for a rotten
		// orange was 2
		return no - 2;
	}
	
	
	static boolean issafe(int i, int j) {
		if (i >= 0 && i < R && j >= 0 && j < C)
			return true;

		return false;
	}
	static int rotOrangesBFS(int grid[][]) {
		if(grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        //Put the position of all rotten oranges in queue
        //count the number of fresh oranges
        for(int i = 0 ; i < rows ; i++) 
        {
            for(int j = 0 ; j < cols ; j++) 
            {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i , j});
                }
                if(grid[i][j] != 0) {
                    count_fresh++;
                }
            }
        }
       
        if(count_fresh == 0) 
        	return 0;
        int countMin = 0, cnt = 0;
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};
        
        //bfs starting from initially rotten oranges
        while(!queue.isEmpty()) {
            int size = queue.size();
            cnt += size; 
            for(int i = 0 ; i < size ; i++) {
                int[] point = queue.poll();
                for(int j = 0;j<4;j++) 
                {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];
                    
                    if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || 
                    grid[x][y] == 2) 
                    	continue;
                    
                    grid[x][y] = 2;
                    queue.offer(new int[]{x , y});
                }
            }
            if(queue.size() != 0) {
                countMin++;
            }
        }
        return count_fresh == cnt ? countMin : -1;
    }
	
	
}

