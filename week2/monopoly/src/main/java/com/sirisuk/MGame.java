package com.sirisuk;

public class MGame {
    private final int N_ROUND;
    private int roundCut;
    private final Board board;
    private final Die[] dice;
    private Player[] players;

    public MGame(int players,int round){
        this.N_ROUND = round;
        this.players = new Player[players];
        this.board = new Board();

        this.dice = new Die[2];
        for(int i = 0;i<2;i++){
            this.dice[i] = new Die();
        }


        for(int i=0;i<players;i++){
            this.players[i] = new Player(i,"Player"+i,board,dice);
        }

    }

    public void playGame(){
        while(this.roundCut<N_ROUND){
            System.out.println("Round " + this.roundCut);
            playRound();
            System.out.println("===========");
            this.roundCut++;
        }

    }

    private void playRound(){
        for(Player p:this.players){
            p.takeTurn();
        }
    }
}
