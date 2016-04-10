package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	
	
	@Test
	public void testInitialBoardIsEmpty() {
		ticTacToe a = new ticTacToe();
		for (int i = 0; i < 3; i++){
			for (int h = 0; h < 3; h++){
		assertEquals(ticTacToe.Location.NONE, a.getMark(i,h));
			}
		}
	}
	
	@Test
	public void testMarkXInUpperRightCorner() {
		ticTacToe a = new ticTacToe();
		a.markX(0,2);
		assertEquals(ticTacToe.Location.X, a.getMark(0,2));
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		ticTacToe a = new ticTacToe();
		a.markO(2,0);
		assertEquals(ticTacToe.Location.O, a.getMark(2,0));
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		ticTacToe a = new ticTacToe();
		a.markO(0,0);
		a.markX(0,0);
		assertEquals(ticTacToe.Location.O, a.getMark(0,0));
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		ticTacToe a = new ticTacToe();
		a.markO(0,0);
		assertEquals(false, a.PlayerWins(ticTacToe.Location.O));
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		ticTacToe a = new ticTacToe();
		a.markX(0,0);
		a.markO(1,0);
		a.markX(0,1);
		a.markO(1,2);
		a.markX(0,2);
		assertEquals(true,a.PlayerWins(ticTacToe.Location.X));
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		ticTacToe a = new ticTacToe();
		a.markX(0,1);
		a.markO(0,0);
		a.markX(1,0);
		a.markO(1,1);
		a.markX(2,0);
		a.markO(0,2);
		a.markX(1,2);
		a.markO(2,1);
		a.markX(2,2);
		assertEquals(true,a.gameOverByTie());
	}	
}
