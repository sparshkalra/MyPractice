package com.practice;

import java.util.HashSet;
import java.util.Set;

public class ChessRookPuzzle {
	static int unGuarded = 0;
	Set<String> counted = new HashSet<String>();

	public static void main(String[] args) {
		char[][] board = { { '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
				{ '.', 'p', 'p', 'B', 'p', 'p', '.', '.' }, { '.', 'p', 'B', 'R', 'B', 'p', '.', '.' },
				{ '.', 'p', 'p', 'B', 'p', 'p', '.', '.' }, { '.', 'p', 'p', 'p', 'p', 'p', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' }, { '.', '.', '.', '.', '.', '.', '.', '.' } };

		// System.out.println(numRookCaptures(board));

		int m = 4, n = 6;
		int[][] guards = { { 0, 0 }, { 1, 1 }, { 2, 3 } }, walls = { { 0, 1 }, { 2, 2 }, { 1, 4 } };
		countUnguarded(m, n, guards, walls);

	}

	public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

		char[][] board = new char[m][n];

		for (int[] wall : walls) {
			board[wall[0]][wall[1]] = 'W';
		}
		for (int[] wall : guards) {
			board[wall[0]][wall[1]] = 'G';
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] != 'G' && board[i][j] != 'W')
					board[i][j] = 'U';
			}
		}
		for (int[] wall : guards) {
			traverseAll(wall[0], wall[1], m, n, board);
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + ",");
			}
			System.out.println("");
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 'U') {
					unGuarded++;
				}
			}
		}

		return unGuarded;
	}

	public static void traverseAll(int x, int y, int m, int n, char[][] board) {
		for (int i = x-1; i >= 0; i--) 
		{
			if (board[i][y] == 'G' || board[i][y] == 'W') {
				break;
			}
			else if (board[i][y] == 'U') {
				board[i][y] = 'X';
			}
		}
		for (int i = x+1; i < m; i++) {
			if (board[i][y] == 'G' || board[i][y] == 'W') {
				break;
			}
			else if (board[i][y] == 'U') {
				board[i][y] = 'X';
			}
		}
		for (int j = y-1; j >= 0; j--) {
			if (board[x][j] == 'G' || board[x][j] == 'W') {
				break;
			}
			else if (board[x][j] == 'U') {
				board[x][j] = 'X';
			}
		}
		for (int j = y+1; j < n; j++) {
			if (board[x][j] == 'G' || board[x][j] == 'W') {
				break;
			}
			else if (board[x][j] == 'U') {
				board[x][j] = 'X';
			}
		}

	}

	public static int numRookCaptures(char[][] board) {
		int rookI = 0;
		int rookJ = 0;
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'R') {
					rookI = i;
					rookJ = j;
					break;
				}

			}
		}
		for (int i = rookI; i >= 0; i--) {
			if (board[i][rookJ] == 'p') {
				count++;
				System.out.println(i + "," + rookJ);
				break;
			}
			if (board[i][rookJ] == 'B') {
				break;
			}
		}

		for (int i = rookI; i <= 8; i++) {
			if (board[i][rookJ] == 'p') {
				count++;
				System.out.println(i + "," + rookJ);
				break;
			}
			if (board[i][rookJ] == 'B') {
				break;
			}
		}

		for (int j = rookJ; j <= 8; j++) {
			if (board[rookI][j] == 'p') {
				count++;
				System.out.println(rookI + "," + j);
				break;
			}
			if (board[rookI][j] == 'B') {
				break;
			}
		}

		for (int j = rookJ; j >= 0; j--) {
			if (board[rookI][j] == 'p') {
				count++;
				System.out.println(rookI + "," + j);
				break;
			}
			if (board[rookI][j] == 'B') {
				break;
			}
		}
		return count;
	}

}
