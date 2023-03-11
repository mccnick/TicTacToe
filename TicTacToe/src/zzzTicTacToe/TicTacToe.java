package zzzTicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *  This class implements a 2D array program for User vs CPU TicTacToe
 * @author Nick
 *
 */
public class TicTacToe
{

	private static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	private static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Hello User, Welcome to ... ");
		System.out.println();
		
		// this is the welcome gameboard array (literally a TicTacToe board)
		char [][] welcomeGameBoard = {
			{'-','-','-','-','-','-','-','-','-','-','-','-','-'}, // top line
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ','T',' ','|',' ','I',' ','|',' ','C',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|','-','-','-','+','-','-','-','+','-','-','-','|'}, // second line
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ','T',' ','|',' ','A',' ','|',' ','C',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|','-','-','-','+','-','-','-','+','-','-','-','|'}, // second line
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ','T',' ','|',' ','O',' ','|',' ','E',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'-','-','-','-','-','-','-','-','-','-','-','-','-'}, // bottom line
			};
		
		// this is the gameboard array (literally a TicTacToe board)
		char [][] gameBoard = {
			// each "box" will have 9 blank squares, making large 1-9 placement squares
			
			{'-','-','-','-','-','-','-','-','-','-','-','-','-'}, // top line
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|','-','-','-','+','-','-','-','+','-','-','-','|'}, // second line
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|','-','-','-','+','-','-','-','+','-','-','-','|'}, // second line
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'}, // first row
			{'-','-','-','-','-','-','-','-','-','-','-','-','-'}, // bottom line
			};
		
		printWelcomeGameBoard(welcomeGameBoard); // welcome board
		System.out.println(); // space after welcome board (looks cleaner)

		
		
		while(true) // continuously runs the code below
		{
			Scanner scnr = new Scanner(System.in);
			System.out.println("User turn.");
			System.out.println("Enter an open TicTacToe Placement (1 - 9) below:");
			System.out.println();
			int playerPlacement = scnr.nextInt();
			while(playerPositions.contains(playerPlacement) || cpuPositions.contains(playerPositions))
			{
				System.out.println("Position taken! Enter an open position.");
				playerPlacement = scnr.nextInt();
			}
					
			
			placementPiece(gameBoard, playerPlacement, "Player"); // User's (player) first turn
			String result = checkWinner();
			if(result.length() > 0)
			{
				System.out.println(result);
				System.out.println();
				break;
			}
			
			Random rand = new Random();
			int cpuPlacement = rand.nextInt(9) + 1; // random position 1 - 9
			while(playerPositions.contains(cpuPlacement) || cpuPositions.contains(cpuPositions))
			{
				cpuPlacement = rand.nextInt(9) + 1;
			}
			
			System.out.println("CPU turn.");
			placementPiece(gameBoard, cpuPlacement, "CPU"); // User's (player) first turn
			
			
			//printGameBoard(gameBoard);
			if(result.length() > 0)
			{
				System.out.println(result);
				System.out.println();
				break;
			}
			
		}
			
	
	}
	/**
	 * This String validates winning combinations of TicTacToe.
	 * @return
	 */
	
	public static String checkWinner()
	{
		List topRow = Arrays.asList(1,2,3);
		List middleRow = Arrays.asList(4,5,6);
		List bottomRow = Arrays.asList(7,8,9);
		List leftColumn = Arrays.asList(1,4,7);
		List middleColumn = Arrays.asList(2,5,8);
		List rightColumn = Arrays.asList(3,6,9);
		List crossing1 = Arrays.asList(1,5,9);
		List crossing2 = Arrays.asList(7,5,3);
		
		
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(middleRow);
		winning.add(bottomRow);
		winning.add(middleColumn);
		winning.add(rightColumn);
		winning.add(leftColumn);
		winning.add(crossing1);
		winning.add(crossing2);
		
		for(List l : winning) // for each list inside the winning list
		{
			if (playerPositions.containsAll(l))
			{
				return "Congratulations you won the game!";
				
			}
			
			else if (cpuPositions.containsAll(l))
			{
				return "Congratulations you lost to a computer!";
			}
			
			else if(playerPositions.size() + cpuPositions.size () == 9)
			{
				return "CAT! User and CPU both lost.";
			}
			
		}
		return "";
	}
	
	
	/**
	 * for loop to print the gameboard array
	 * @param gameBoard
	 */
	public static void printGameBoard(char [][] gameBoard)
	{
		for(char[] row : gameBoard)
		{
			for(char c : row)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	/**
	 * for loop to print the gameboard array
	 * @param gameBoard
	 */
	public static void printWelcomeGameBoard(char [][] welcomeGameBoard)
	{
		for(char[] row : welcomeGameBoard)
		{
			for(char c : row)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void placementPiece(char [][] gameBoard, int placement, String user)
	{
		
		char symbol = 'X';
		if(user.equals("Player"))
		{
			symbol = 'X';
			playerPositions.add(placement);
		}
		else if(user.equals("CPU"))
		{
			symbol = 'O';
			cpuPositions.add(placement);
		}
		
		switch(placement)
		{
		case 1:
			gameBoard[2][2] = symbol; // blank space (placement 1)
			break;
		case 2:
			gameBoard[2][6] = symbol; // blank space (placement 2)
			break;
		case 3:
			gameBoard[2][10] = symbol; // blank space (placement 3)
			break;
		case 4:
			gameBoard[6][2] = symbol; // blank space (placement 4)
			break;
		case 5:
			gameBoard[6][6] = symbol; // blank space (placement 5)
			break;
		case 6:
			gameBoard[6][10] = symbol; // blank space (placement 6)
			break;
		case 7:
			gameBoard[10][2] = symbol; // blank space (placement 7)
			break;
		case 8:
			gameBoard[10][6] = symbol; // blank space (placement 8)
			break;
		case 9:
			gameBoard[10][10] = symbol; // blank space (placement 9)
			break;
			
		}
		
		printGameBoard(gameBoard);
	}
}
