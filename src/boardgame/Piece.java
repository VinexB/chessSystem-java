package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		// position é nulo por padrão, não sendo necessário instanciar: position = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
}
