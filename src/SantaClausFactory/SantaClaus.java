package SantaClausFactory;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

	private List<Command> commandList = new ArrayList<Command>();


	private static volatile SantaClaus santaClaus;


	private SantaClaus() {

	}
	public static SantaClaus getInstance() {
		if (santaClaus == null) {
			santaClaus = new SantaClaus();
		}
		return santaClaus;
	}

	public void setCommand(Command command) {
		commandList.add(command);
	}

	public void executeOnMagicBoard() {
		for (Command command : commandList) {
			command.execute();

		}
		commandList.clear();
	}

}