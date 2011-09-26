package com.TickTackToe;

import org.junit.*;
import static org.junit.Assert.*;

public class SomeTests {

    private static final String TIC_PLAYER_NAME = "tic_player";
    private static final String TOE_PLAYER_NAME = "toe_player";

    @Test
    public void emptyBoardOneByOneFirstTic() {
        // given
        String table = "";

        setStartingPlayerName(TIC_PLAYER_NAME);
        setStartingPlayer(new TicPlayer(TIC_PLAYER_NAME));

        // when
        table = makeTheTicPlayerMove(table);

        // then
        assertEquals(whoWon(table), TIC_PLAYER_NAME);
    }

	@Test
    public void emptyBoardOneByOneFirstToe() {
        // given
        String table = "";

        setStartingPlayerName(TOE_PLAYER_NAME);

        // when
        table = makeTheToePlayerMove(table);

        // then
        assertEquals(whoWon(table), TOE_PLAYER_NAME);
    }
    
    @Test
    public void tickIsPutOnTheTable(){
    	String table = "";
    	
    	table = makeTheTicPlayerMove(table);
    	
    	assertTrue(isTic(table));
    }

    @Test
    public void toeIsPutOnTheTable(){
    	String table = "";

    	table = makeTheToePlayerMove(table);

    	assertTrue(isToe(table));
    }

    @Test
    public void toeIsNotPutOnTheTable(){
    	String table = "";

    	table = makeTheTicPlayerMove(table);

    	assertFalse(isToe(table));
    }

    @Test
    public void ticIsNotPutOnTheTable(){
    	String table = "";

    	table = makeTheToePlayerMove(table);

    	assertFalse(isTic(table));
    }

    private static final Character TIC = 'X';
    private static final Character TOE = 'O';

    private boolean isToe(String table) {
        return table.charAt(0) == TOE;
    }

    private String makeTheToePlayerMove(String table) {
        return TOE.toString();
    }

    private boolean isTic(String table) {
		return table.charAt(0) == TIC;
	}

	private String firstPlayer;
	private TicPlayer player;

    private void setStartingPlayerName(String firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    private void setStartingPlayer(TicPlayer ticPlayer) {
		this.player = ticPlayer;
	}

    private String whoWon(String table) {
        return firstPlayer;
    }

    private String makeTheTicPlayerMove(String table) {
        return new TicPlayer("tic_player").move(table);
    }
    
    class TicPlayer{
    	private String name;

		public TicPlayer(String name){
    		this.name = name;
    	}
    	
    	public String move(String table){
    		return TIC.toString();
    	}
    	
    	public String getName(){
    		return name;
    	}
    }
}
