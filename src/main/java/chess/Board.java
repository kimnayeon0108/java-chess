package chess;

import chess.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int PAWNSNUM = 8;
    private List<Pawn> whitePawns = new ArrayList<>(8);
    private List<Pawn> blackPawns = new ArrayList<>(8);

    public void add(Pawn pawn) {
        List list = distinguish(pawn);
        list.add(pawn);
    }

    public List distinguish(Pawn pawn) {
        if (pawn.getColor().equals(Pawn.WHITE_COLOR)) {
            return whitePawns;
        }
        if (pawn.getColor().equals(Pawn.BLACK_COLOR)) {
            return blackPawns;
        }
        return null;
    }


    public int size(Pawn pawn) {
        return distinguish(pawn).size();
    }

    public Pawn findPawn(Pawn pawn, int idx) {
        return (Pawn) distinguish(pawn).get(idx);
    }

    public void initialize() {
        for (int i = 0; i < PAWNSNUM; i++) {
            Pawn white = new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION);
            Pawn black = new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK__REPRESENTATION);
            add(white);
            add(black);
        }
    }

    public void print() {

    }

    public String getWhitePawnResult() {
        return getPawnResult(whitePawns);
    }

    public String getBlackPawnResult() {
        return getPawnResult(blackPawns);
    }

    public String getPawnResult(List<Pawn> pawns) {
        StringBuilder result = new StringBuilder();
        for (Pawn pawn : pawns) {
            result.append(pawn.getRepresentation());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Board board = new Board();
        board.initialize();
//        board.getWhitePawnResult();
        board.print();
    }
}
