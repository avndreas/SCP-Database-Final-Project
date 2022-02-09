package model.pieces;

import model.Board;
import model.Piece;
import model.Tile;

import java.util.List;

public class Pawn implements Piece {

    private boolean isCaptured;
    private boolean isWhite;
    private Tile position;
    private boolean firstMove;

    public Pawn(boolean isWhite, Tile position) {
        this.isCaptured = false;
        this.isWhite = isWhite;
        this.position = position;
    }

    @Override
    public void getCaptured() {
        this.isCaptured = true;
    }

    @Override
    public boolean isWhite() {
        return isWhite;
    }

    @Override
    public boolean isCaptured() {
        return isCaptured;
    }

    @Override
    public boolean canMoveToTile(Board board, Tile currentTile, Tile toTile) {
        return true; //stub
    }

    @Override
    public boolean canCaptureOnTile(Board board, Tile currentTile, Tile toTile) {
        return false; //stub
    }

}