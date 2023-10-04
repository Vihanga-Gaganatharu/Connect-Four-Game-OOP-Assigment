package lk.ijse.dep.service;

public abstract class Player {
    public Player(Board board) {
        this.board = board;
    }

    Board board;

    public abstract void movePiece(int col);

}