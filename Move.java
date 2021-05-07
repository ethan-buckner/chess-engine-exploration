public class Move {

	Square begin;
	Square end;
	boolean capture;

	public Move(Square start, Square finish) {
		begin = start;
		end = finish;
	}
}
