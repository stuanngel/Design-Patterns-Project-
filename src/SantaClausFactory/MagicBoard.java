package SantaClausFactory;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard {

	private List<Dwarf> dwarfs = new ArrayList<>();

	public void attach(Dwarf dwarf) {
		dwarfs.add(dwarf);
	}

	public void deattach(Dwarf dwarf) {
		dwarfs.remove(dwarf);
	}

	public void notifyDwarfs() {
		for (Dwarf dwarf : dwarfs) {
			dwarf.update();
		}
	}

	public void needOfDoll() {
		System.out.println("Need a Doll");
		notifyDwarfs();
	}

	

	
	public void dontNeedAnything() {
		System.out.println("I don't need toy");
		notifyDwarfs();
	}

	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
}