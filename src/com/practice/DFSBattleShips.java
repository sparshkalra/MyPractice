package com.practice;

public class DFSBattleShips 
{
	public static void main(String[] args)
	{
		char[][] board= {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		
		System.out.println(new DFSBattleShips().countBattleships(board));
	}
	public int countBattleships(char[][] board) 
    {
        int count =0;
        for(int i=0;i < board.length;i++)
        {
            char[] single = board[i];
            
            for(int j=0;j<single.length;j++)
            {
                if(single[j] =='X')
                {
                    count++;
                    dfs(board,i+1,j);
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][]board, int i, int j)
    {
        if(i > board.length-1 ||j > board[0].length-1 || board[i][j] == '.')
        {
            return;
        }
        if(board[i][j] == 'X')
        {
            board[i][j] = '.';
            dfs(board,i+1,j);
        }
    }
    
}
