package guessNumber;

import guessNumber.consoleUI.GuessNumberUI;
import guessNumber.core.GuessTheNumber;
import userInerface.copy.GameStudioUI;

public class Main {
	public static void main(String[] args){
		GameStudioUI gsui=new GameStudioUI();
//		GuessNumberUI gtnui=new GuessNumberUI();
//		gtnui.run();
		gsui.run();
	}
}
