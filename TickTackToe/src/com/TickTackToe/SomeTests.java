package com.TickTackToe;

import org.junit.*;
import static org.junit.Assert.*;

public class SomeTests {

    private static final String FIRST_PLAYER = "X";

    @Test
    public void emptyBoardOneByOne() {
        // given
        String table = "";

        setStartingPlayer(FIRST_PLAYER);

        // when
        table = putTic(table);

        // then
        assertEquals(whoWon(table), FIRST_PLAYER);
    }
    
    @Test
    public void tickIsPutOnTheTable(){
    	String table = "";
    	
    	table = putTic(table);
    	
    	assertTrue(isTic(table));
    }

    private boolean isTic(String table) {
		return table.charAt(0) == 'X';
	}

	private String firstPlayer;

    private void setStartingPlayer(String firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    private String whoWon(String table) {
        return firstPlayer;
    }

    private String putTic(String table) {
        return "X";
    }
}
