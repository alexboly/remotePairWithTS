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
        setStartingPlayer(new Player(TIC_PLAYER_NAME, TIC));

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
        setStartingPlayer(new Player(TOE_PLAYER_NAME, TOE));

        // when
        table = makeTheToePlayerMove(table);

        // then
        assertEquals(whoWon(table), TOE_PLAYER_NAME);
    }


    @Test
    public void tickIsPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TIC_PLAYER_NAME, TIC));
    	table = makeTheTicPlayerMove(table);
    	
    	assertTrue(isTic(table));
    }

    @Test
    public void toeIsPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TOE_PLAYER_NAME, TOE));
    	table = makeTheToePlayerMove(table);

    	assertTrue(isToe(table));
    }

    @Test
    public void toeIsNotPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TIC_PLAYER_NAME, TIC));
    	table = makeTheTicPlayerMove(table);

    	assertFalse(isToe(table));
    }

    @Test
    public void ticIsNotPutOnTheTable(){
    	String table = "";

        setStartingPlayer(new Player(TOE_PLAYER_NAME, TOE));
    	table = makeTheToePlayerMove(table);

    	assertFalse(isTic(table));
    }

    private static final Character TIC = 'X';
    private static final Character TOE = 'O';

    private boolean isToe(String table) {
        return table.charAt(0) == TOE;
    }

    private String makeTheToePlayerMove(String table) {
        return player.move(table);
    }

    private boolean isTic(String table) {
		return table.charAt(0) == TIC;
	}

	private String firstPlayer;
	private Player player;

    private void setStartingPlayerName(String firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    private void setStartingPlayer(Player ticPlayer) {
		this.player = ticPlayer;
	}

    private String whoWon(String table) {
        return firstPlayer;
    }

    private String makeTheTicPlayerMove(String table) {
        return player.move(table);
    }

    class Player{
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
