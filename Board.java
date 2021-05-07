import java.util.ArrayList;

public class Board {

	private Square[] squares = new Square[64];
	private ArrayList<Piece> pieceList = new ArrayList<>();
	private ArrayList<Piece> whiteList = new ArrayList<>();
	private ArrayList<Piece> blackList = new ArrayList<>();

	private int whiteVal;
	private int blackVal;

	public Board() {}

	public void initializeBoard() {

		// Initializes all square objects
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				squares[x*8 + y] = new Square(x,y);
			}
		}

		// Sets square pointers
		for (int i = 0; i < 64; i++) {
			if (i < 8) {
				squares[i].down = null;
			} else {
				squares[i].down = squares[i-8];
			}
			if (i > 55) {
				squares[i].up = null;
			} else {
				squares[i].up = squares[i+8];
			}
			if ((i+1) % 8 == 1) {
				squares[i].left = null;
			} else {
				squares[i].left = squares[i-1];
			}
			if ((i+1) % 8 == 0) {
				squares[i].right = null;
			} else {
				squares[i].right = squares[i+1];
			}
		}

		// Initialize pieces
		for (int i = 0; i < 8; i++) squares[8+i].setHere(new Pawn(squares[8+1], true));
		for (int i = 0; i < 8; i++) squares[63-i].setHere(new Pawn(squares[63-i], false));
		squares[0].setHere(new Rook(squares[0], true));
		squares[1].setHere(new Knight(squares[1], true));
		squares[2].setHere(new Bishop(squares[2], true));
		squares[3].setHere(new Queen(squares[3], true));
		squares[4].setHere(new King(squares[4], true));
		squares[5].setHere(new Bishop(squares[5], true));
		squares[6].setHere(new Knight(squares[6], true));
		squares[7].setHere(new Rook(squares[7], true));

		squares[56].setHere(new Rook(squares[56], true));
		squares[57].setHere(new Knight(squares[57], true));
		squares[58].setHere(new Bishop(squares[58], true));
		squares[59].setHere(new Queen(squares[59], true));
		squares[60].setHere(new King(squares[60], true));
		squares[61].setHere(new Bishop(squares[61], true));
		squares[62].setHere(new Knight(squares[62], true));
		squares[63].setHere(new Rook(squares[63], true));

		// Add pieces to piece lists
		for (Square s : squares) {
			if (s.getHere().isWhite) whiteList.add(s.getHere()); else blackList.add(s.getHere()); pieceList.add(s.getHere());
		}
	}
}
