package com.company;
public class Main {
    public static void main(String[] args) {
        Chessmen chessmen = new Queen(new Rook(new Pawns()));
        System.out.println(chessmen.makeMove());
    }
}
