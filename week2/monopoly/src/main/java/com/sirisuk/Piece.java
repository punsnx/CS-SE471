package com.sirisuk;


public class Piece {
    private Square location;

    public Piece(){
        this.location = null;

    }
    public void setLocation(Square newLoc){
        this.location = newLoc;
    }
    public Square getLocation(){
        return this.location;
    }

}
