package guessNumber.consoleUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import guessNumber.core.GuessTheNumber;

public class GuessNumberUI {
	private GuessTheNumber gn = new GuessTheNumber();

	private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	private enum Option {
		EASY, ADVANCED, EXPERT, EXIT
	};

	public void run() {
		while (true) {
			switch (showMenu()) {
			case EASY:
				gn.setStatus(false);
				InsertInput(0, 10);
				break;
			case ADVANCED:
				gn.setStatus(false);
				InsertInput(0, 100);
				break;
			case EXPERT:
				gn.setStatus(false);
				InsertInput(-500, 500);
				break;
			case EXIT:
				return;
			}
		}
	}

	private void InsertInput(int min, int max) {
		gn.genereateGuessNumber(min, max);
		while (gn.getStatus()==false) {
			System.out.println("Insert your tip: ");
			System.out.println(gn.verifyInput(Integer.parseInt(readLine())));
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
