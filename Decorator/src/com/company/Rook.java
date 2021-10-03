package com.company;
public class Rook extends ChessmenDecorator {
    public Rook(Chessmen chessmen) {
        super(chessmen);
    }
    public String makeMoveVertHori(){
        return "\nCan move to any number of fields horizontally or vertically. ";
    }
    @Override
    public String makeMove(){
        return super.makeMove() + makeMoveVertHori();
    }
}
