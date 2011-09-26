package com.TickTackToe;

import org.junit.*;
import static org.junit.Assert.*;

public class SomeTests {

    private static final String TIC_PLAYER = "tic_player";
    private static final String TOE_PLAYER = "toe_player";

    @Test
    public void emptyBoardOneByOneFirstTic() {
        // given
        String table = "";

        setStartingPlayer(TIC_PLAYER);

        // when
        table = putTic(table);

        // then
        assertEquals(whoWon(table), TIC_PLAYER);
    }

    @Test
    public void emptyBoardOneByOneFirstToe() {
        // given
        String table = "";

        setStartingPlayer(TOE_PLAYER);

        // when
        table = putToe(table);

        // then
        assertEquals(whoWon(table), TOE_PLAYER);
    }
    
    @Test
    public void tickIsPutOnTheTable(){
    	String table = "";
    	
    	table = putTic(table);
    	
    	assertTrue(isTic(table));
    }

    @Test
    public void toeIsPutOnTheTable(){
    	String table = "";

    	table = putToe(table);

    	assertTrue(isToe(table));
    }

    @Test
    public void toeIsNotPutOnTheTable(){
    	String table = "";

    	table = putTic(table);

    	assertFalse(isToe(table));
    }

    @Test
    public void ticIsNotPutOnTheTable(){
    	String table = "";

    	table = putToe(table);

    	assertFalse(isTic(table));
    }

    private static final Character TIC = 'X';
    private static final Character TOE = 'O';

    private boolean isToe(String table) {
        return table.charAt(0) == TOE;
    }

    private String putToe(String table) {
        return TOE.toString();
    }

    private boolean isTic(String table) {
		return table.charAt(0) == TIC;
	}

	private String firstPlayer;

    private void setStartingPlayer(String firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    private String whoWon(String table) {
        return firstPlayer;
    }

    private String putTic(String table) {
        return TIC.toString();
    }
}
