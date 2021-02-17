package chess.pieces;

public class Piece {
    private final Color color;
    private final PieceName name;
    private final char representation;

    private Piece(Color color, PieceName name) {
        this.color = color;
        this.name = name;
        this.representation = createRepresentation(color, name);
    }

    public Color getColor() {
        return this.color;
    }

    public char createRepresentation(Color color, PieceName name) {
        if (color == Color.WHITE) {
            return name.getRepresentation();
        }
        return Character.toUpperCase(name.getRepresentation());
    }

    public static Piece createWhitePawn() {
        return new Piece(Color.WHITE, PieceName.PAWN);
    }

    public static Piece createBlackPawn() {
        return new Piece(Color.BLACK, PieceName.PAWN);
    }

    public static Piece createWhiteKnight() {
        return new Piece(Color.WHITE, PieceName.KNIGHT);
    }

    public static Piece createBlackKnight() {
        return new Piece(Color.BLACK, PieceName.KNIGHT);
    }

    public static Piece createWhiteRook() {
        return new Piece(Color.WHITE, PieceName.ROOK);
    }

    public static Piece createBlackRook() {
        return new Piece(Color.BLACK, PieceName.ROOK);
    }

    public static Piece createWhiteBishop() {
        return new Piece(Color.WHITE, PieceName.BISHOP);
    }

    public static Piece createBlackBishop() {
        return new Piece(Color.BLACK, PieceName.BISHOP);
    }

    public static Piece createWhiteQueen() {
        return new Piece(Color.WHITE, PieceName.QUEEN);
    }

    public static Piece createBlackQueen() {
        return new Piece(Color.BLACK, PieceName.QUEEN);
    }

    public static Piece createWhiteKing() {
        return new Piece(Color.WHITE, PieceName.KING);
    }

    public static Piece createBlackKing() {
        return new Piece(Color.BLACK, PieceName.KING);
    }
}

enum PieceName {
    PAWN('p'),
    KNIGHT('n'),
    ROOK('r'),
    BISHOP('b'),
    QUEEN('q'),
    KING('k');

    private final char tempRepresentation;

    PieceName(char representation) {
        this.tempRepresentation = representation;
    }

    public char getRepresentation() {
        return tempRepresentation;
    }
}


