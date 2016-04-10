package edu.jsu.mcis;

public class ticTacToeVIEW{
	
	private String[][] Board;
	
	public ticTacToeVIEW(){
		Board = new String[3][3];
		for (int i = 0; i < 3; i++){
			for (int h = 0; h < 3; h++){
				Board[i][h] = " ";
			}
		
		}
		System.out.println(" 1   2   3");
		System.out.println("1   |   |  ");
		System.out.println(" ----------");
		System.out.println("2   |   |  ");
		System.out.println(" ----------");
		System.out.println("3   |   |  ");
		System.out.println("Player X, Please enter the row at which you would like to place your mark:");
		System.out.println();
	}
	
	public void displayBoard(){
		System.out.println(" 1   2   3");
		System.out.println("1" + Board[0][0] + "|" + Board[0][1] + "|" + Board[0][2]);
		System.out.println(" ----------");
		System.out.println("2" + Board[1][0] + "|" + Board[1][1] + "|" + Board[1][2]);
		System.out.println(" ----------");
		System.out.println("3" + Board[2][0] + "|" + Board[2][1] + "|" + Board[2][2]);
		System.out.println("Player X, Please enter the row at which you would like to place your mark:");
		System.out.println();
	}
	
	
}