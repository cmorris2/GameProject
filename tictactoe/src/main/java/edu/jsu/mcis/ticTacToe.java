package edu.jsu.mcis;

import java.util.*;

public class ticTacToe{
	
	public enum Location {NONE, X, O};
	protected Location[][] gameBoard;
	boolean playerX;
	int turns;
	
	public ticTacToe(){
		turns = 0;
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
			turns++;
			return gameBoard[row][col];
		}
		return gameBoard[row][col];
	}
	
	public Location markO(int row, int col){
		if (isAvailable(row,col)){
			gameBoard[row][col] = Location.O;
			playerX = true;
			turns++;
			return gameBoard[row][col];
		}
		return gameBoard[row][col];
	}
	
	public boolean PlayerWins(Location player){
		for (int i = 0; i<3; i++){
			if ((gameBoard[i][0] == player) && (gameBoard[i][1]==player) && (gameBoard[i][2]==player)){
				return true;
			}
			if ((gameBoard[0][i]==player) && (gameBoard[1][i]==player) && (gameBoard[2][i]==player)){
				return true;
			}
		}
		if ((gameBoard[0][0]==player) && (gameBoard[1][1]==player) && (gameBoard[2][2]==player)){
			return true;
		}
		if ((gameBoard[2][0]==player) && (gameBoard[1][1]==player) && (gameBoard[0][2]==player)){
			return true;
		}
	return false;
	}
	
	public boolean gameOverByTie(){
		if (turns == 9){
			return true;
		}
		return false;
	}

	
	public static void main(String[] args) {
		ticTacToe test = new ticTacToe();
		ticTacToeVIEW game1 = new ticTacToeVIEW();
		
		
	}
}