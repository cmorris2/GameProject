package edu.jsu.mcis;

import java.util.*;

public class ticTacToe{
	
	public enum Location {NONE, X, O};
	protected Location[][] gameBoard;
	boolean playerX;
	
	public ticTacToe(){
		gameBoard = new Location[3][3];
		for (int i = 0; i < 3; i++){
			for (int h = 0; h < 3; h++){
				gameBoard[i][h] = Location.NONE;
			}
		}
	}
	public boolean isAvailable(int row, int col){
		if ((gameBoard[row][col] == Location.X) || (gameBoard[row][col] == Location.O)){
			return false;
		}
		return true;
	}
	public Location getMark(int row, int col){
		return gameBoard[row][col];
	}
	
	public Location markX(int row, int col){
		if (isAvailable(row,col)){
			gameBoard[row][col] = Location.X;
			playerX = false;
			return gameBoard[row][col];
		}
		return gameBoard[row][col];
	}
	
	public Location mark0(int row, int col){
		if (isAvailable(row,col)){
			gameBoard[row][col] = Location.O;
			playerX = true;
			return gameBoard[row][col];
		}
		return gameBoard[row][col];
	}
	
	

	
	public static void main(String[] args) {
		ticTacToe test = new ticTacToe();
		ticTacToeVIEW game1 = new ticTacToeVIEW();
		
		
	}
}