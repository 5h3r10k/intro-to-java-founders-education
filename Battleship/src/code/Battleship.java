package code;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Battleship {

	static int[] ships = { 2, 4 ,2,3,4};

	static Scanner input = new Scanner(System.in);

	static int max = IntStream.of(ships).sum();

	public static void main(String[] args) {

		int torps = 8; // customizable
		int hits = 0; // DO NOT CHANGE

		// creating the board
		String[][] board = new String[8][8];

		// creating the board
		createBoard(board);

		// creating the ships
		createShip(board, ships[0]);
		createShip(board, ships[1]);

		// showing the board
		// showBoard(board);

		while (torps > 0 && hits < max) {
			showBoard(board);
			hits = userFire(board, hits, torps);
			torps--;
		}

		endGame(hits, torps);

		// System.out.print(board.length);

	}

	public static void createBoard(String[][] board) {

		for (int row = 0; row < board.length; row++) {

			for (int col = 0; col < board[0].length; col++) {

				board[row][col] = "~";

			}

		}

	}

	public static void showBoard(String[][] board) {

		for (int i = 0; i < board[0].length; i++) {
			System.out.print("\t" + (i + 1));
		}

		for (int r = 0; r < board.length; r++) {

			System.out.println("\n");
			System.out.print(r + 1);

			for (int c = 0; c < board[0].length; c++) {

				if (board[r][c] == "S") {

					System.out.print("\t" + "~");

				} else {

					System.out.print("\t" + board[r][c]);

				}

			}

		}

	}

	public static int[] getDirection(int dir) {

		int dirx = 0;
		int diry = 0;

		switch (dir) {

		// east
		case 0:
			diry = 0;
			dirx = 1;
			break;

		// west
		case 1:
			diry = 0;
			dirx = -1;
			break;

		// north
		case 2:
			diry = 1;
			dirx = 0;
			break;

		// south
		case 3:
			diry = -1;
			dirx = 0;
			break;

		}

		return new int[] { dirx, diry };
	}

	public static void createShip(String[][] board, int size) {

		int col = (int) (Math.random() * board[0].length);
		int row = (int) (Math.random() * board.length);

		int dir = (int) (Math.random() * 4);

		// System.out.println("Trying row "+row+" and column "+col+ " which has value of
		// "+board[row][col]);

		while (!validShip(board, col, row, dir, size)) {

			// System.out.println("It wasn't valid");

			col = (int) (Math.random() * board[0].length);
			row = (int) (Math.random() * board.length);

			dir = (int) (Math.random() * 4);

		}

		int dirx = getDirection(dir)[0];
		int diry = getDirection(dir)[1];

		for (int i = 0; i < size; i++) {
			row += dirx;
			col += diry;
			board[row][col] = "S";
		}

	}

	public static boolean validShip(String[][] board, int col, int row, int dir, int size) {

		int dirx = getDirection(dir)[0];
		int diry = getDirection(dir)[1];

		for (int i = 0; i < size; i++) {

			row += dirx;
			col += diry;

			if (row < 0 || row >= board.length) {

				// System.out.println("Row is out of bounds at " + row);
				return false;

			}

			if (col < 0 || col >= board[0].length) {

				// System.out.println("Column is out of bounds at " + col);
				return false;

			}

			if (board[row][col] != "~") {
				return false;
			}

		}

		return true;

	}

	public static int userFire(String[][] board, int hits, int torps) {

		int row;
		int col;

		System.out.println("\n");
		System.out.println(torps + " Torpedoes left.");
		System.out.println("Select a row to fire in: ");
		row = input.nextInt();

		while (row < 1 || row > board.length) {
			System.out.println("Enter a valid row (1 -> " + board.length + ")");
			row = input.nextInt();
		}

		System.out.println("Select a column to fire in: ");
		col = input.nextInt();

		while (col < 1 || col > board[0].length) {
			System.out.println("Enter a valid col (1 -> " + board[0].length + ")");
			col = input.nextInt();
		}

		if (board[row - 1][col - 1] == "S") {
			hits++;
			System.out.println(">======== HIT ========<");
			System.out.println();
			board[row - 1][col - 1] = "!";
		} else {
			System.out.println("#~~~~~~~~ MISS ~~~~~~~~#");
			System.out.println();
			board[row - 1][col - 1] = "M";
		}

		return hits;

	}

	public static void endGame(int hits, int torps) {

		if (hits >= max) {
			System.out.println();
			System.out.println("Congratulations, you won the game!");
		} else if (torps < 1) {
			System.out.println();
			System.out.println("Sorry, you lost the game.");
		}

	}

}
