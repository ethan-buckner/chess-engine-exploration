import java.util.ArrayList;

public abstract class Piece {

	public boolean isWhite;
	protected Square position;
	protected ArrayList<Move> moves;
	protected int value;

	public ArrayList<Move> getLegalMoves() {
		return null;
	}
}

class Bishop extends Piece {
	public Bishop(Square location, boolean white) {
		isWhite = white;
		position = location;
		value = 3;
	}
}

class Queen extends Piece {
	public Queen(Square location, boolean white) {
		isWhite = white;
		position = location;
		value = 9;
	}
}

class King extends Piece {
	public King(Square location, boolean white) {
		isWhite = white;
		position = location;
		value = -1;
	}
}

class Knight extends Piece {
	public Knight(Square location, boolean white) {
		isWhite = white;
		position = location;
		value = 3;
	}
}

class Pawn extends Piece {

	public Pawn(Square location, boolean white) {
		isWhite = white;
		position = location;
		value = 1;
	}
}

class Rook extends Piece {
	public Rook(Square location, boolean white) {
		isWhite = white;
		position = location;
		value = 5;
	}
}