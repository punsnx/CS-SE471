package com.sirisuk;

import java.util.*;

public class Board {
    private final static int n_square = 40;
    private final ArrayList<Square> squares;


    public  Board(){
            this.squares = new ArrayList<>();
            for(int i=0;i<n_square;i++){
                this.squares.add(new Square("Square"+i));
            }
    }

    public Square getSquare(Square oldLoc,int fvTot){
        int index = 0;
        if(oldLoc != null){
            index = squares.indexOf(oldLoc);
        }
        int newIndex = (index+fvTot) % n_square;
        return squares.get(newIndex);
    }


}
