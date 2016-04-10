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
		assertEquals(ticTacToe.Location.X, a.markX(0,2));
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		assertTrue(false);
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		assertTrue(false);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		assertTrue(false);
	}	
}
