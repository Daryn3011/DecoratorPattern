package com.company;
public class ChessmenDecorator implements Chessmen {
    private Chessmen chessmen;
    public ChessmenDecorator(Chessmen chessmen) {
        this.chessmen = chessmen;
    }

    @Override
    public String makeMove() {
        return this.chessmen.makeMove();
    }
}
