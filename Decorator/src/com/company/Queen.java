package com.company;
public class Queen extends ChessmenDecorator {
    public Queen(Chessmen chessmen) {
        super(chessmen);
    }
    public String makeMoveVertHoriDiag(){
        return "\nCan move to any number of fields horizontally, vertically or diagonally. ";
    }

    @Override
    public String makeMove() {
        return super.makeMove() + makeMoveVertHoriDiag();
    }
}
