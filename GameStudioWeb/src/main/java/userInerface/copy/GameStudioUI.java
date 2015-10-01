package userInerface.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import guessNumber.consoleUI.GuessNumberUI;


public class GameStudioUI {
	
	private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	private enum Option {
		MINESWEEPER, STONES, GUESSNUMBER,REGISTRATION, SIGNIN, EXIT
	};
	
	public void run() {
		while (true) {
			switch (showMenu()) {
			case MINESWEEPER:
				//printRegister();
				break;
			case STONES:
				//addToRegister();
				break;
			case GUESSNUMBER:
				GuessNumberUI gtnui=new GuessNumberUI();
				gtnui.run();
				break;
			case REGISTRATION:
				//odstranit
				break;
			case SIGNIN:
		//
				break;
			case EXIT:
				return;
			}
		}
	}


	
	private Option showMenu() {
		System.out.println("Menu.");
		for (Option option : Option.values()) {
			System.out.printf("%d. %s%n", option.ordinal() + 1, option);
		}
		System.out.println("-----------------------------------------------");

		int selection = -1;
		do {
			System.out.println("Option: ");
			selection = Integer.parseInt(readLine());
		} while (selection <= 0 || selection > Option.values().length);

		return Option.values()[selection - 1];
	}
	
	private String readLine() {
		// In JDK 6.0 and above Console class can be used
		// return System.console().readLine();

		try {
			return input.readLine();
		} catch (IOException e) {
			return null;
		}
	}
}
