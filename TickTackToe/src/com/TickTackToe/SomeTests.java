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

        Player player = new Player(TIC_PLAYER_NAME, TIC);
		setStartingPlayer(player);

        // when
        table = nextMove(table);

        // then
        assertEquals(whoWon(table), player);
    }

	@Test
    public void emptyBoardOneByOneFirstToe() {
        // given
        String table = "";

        Player player = new Player(TOE_PLAYER_NAME, TOE);
        setStartingPlayer(player);

        // when
        table = nextMove(table);

        // then
        assertEquals(whoWon(table), player);
    }


    @Test
    public void tickIsPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TIC_PLAYER_NAME, TIC));
    	table = nextMove(table);
    	
    	assertTrue(isTic(table));
    }

    @Test
    public void toeIsPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TOE_PLAYER_NAME, TOE));
    	table = nextMove(table);

    	assertTrue(isToe(table));
    }

    @Test
    public void toeIsNotPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TIC_PLAYER_NAME, TIC));
    	table = nextMove(table);

    	assertFalse(isToe(table));
    }

    @Test
    public void ticIsNotPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TOE_PLAYER_NAME, TOE));
    	table = nextMove(table);

    	assertFalse(isTic(table));
    }

    private static final Character TIC = 'X';
    private static final Character TOE = 'O';

    private boolean isToe(String table) {
        return table.charAt(0) == TOE;
    }

    private String nextMove(String table) {
        return player.move(table);
    }

    private boolean isTic(String table) {
		return table.charAt(0) == TIC;
	}

	private Player player;

    private void setStartingPlayer(Player ticPlayer) {
		this.player = ticPlayer;
	}

    private Player whoWon(String table) {
        return player;
    }

    static class Player{
    	private String name;
        private Character moveCharacter;

		public Player(String name, Character moveCharacter){
    		this.name = name;
            this.moveCharacter = moveCharacter;
    	}
		
    	public String move(String table){
    		return moveCharacter.toString();
    	}

    	public String getName(){
    		return name;
    	}
    }
}
