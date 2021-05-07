public class Square {

	public int[] coord = new int[2];
	private boolean occupied;
	private final boolean isWhite;
	private Piece here;

	public Square up;
	public Square down;
	public Square left;
	public Square right;

	public Square(int x, int y) {
		coord[0] = x;
		coord[1] = y;
		isWhite = x % 2 == 0 ^ y % 2 == 0;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public Piece getHere() {
		return here;
	}

	public void setHere(Piece here) {
		this.here = here;
	}
}
