package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		// position � nulo por padr�o, n�o sendo necess�rio instanciar: position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
}
