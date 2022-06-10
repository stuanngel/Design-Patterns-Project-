package SantaClausFactory;

public class Dwarf {

	private MagicBoard magicBoard = new MagicBoard();

	public void update() {
		System.out.println("Update the board");
	}
	
	public Factory getToy(String toyType) {
		if(toyType == null) {
			return null;
		}
		if(toyType.equalsIgnoreCase("DOLL")){
		    return new Doll();
		}else if(toyType.equalsIgnoreCase("BIKE")){
		    return new Bike();
		}
		return null;
	}

	public void attachBoard(MagicBoard mB) {
		setMagicBoard(mB);
	}

	public MagicBoard getMagicBoard() {
		return magicBoard;
	}

	public void setMagicBoard(MagicBoard magicBoard) {
		this.magicBoard = magicBoard;
	}
}