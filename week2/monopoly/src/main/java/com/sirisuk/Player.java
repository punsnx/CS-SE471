package com.sirisuk;

public class Player{
    private final int id;
    private String name;
    private final Piece piece;
    private final Board board;
    private final Die[] dice;
    public Player(int id,String name,Board board,Die[] dice){
        this.id = id;
        this.name = name;
        this.board = board;
        this.dice = dice;
        this.piece = new Piece();

    }

    public void takeTurn(){
        int fvTot = 0;
        for(Die d:dice){
            d.roll();
            int fv = d.getFaceValue();
            fvTot += fv;
            System.out.println("Die roll: " + fv);
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc,fvTot);
        piece.setLocation(newLoc);
        System.out.println("Player " + this.id + " moved from " + (oldLoc != null ? oldLoc.getName() : "Square0") + " to " + newLoc.getName());

    }
}
