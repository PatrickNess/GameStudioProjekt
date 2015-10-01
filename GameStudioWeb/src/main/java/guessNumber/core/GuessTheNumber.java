package guessNumber.core;

import java.util.Random;

public class GuessTheNumber {

	private int guessedNumber;
	private boolean status = false;
	private int countOfSteps = 0;

	Random randomNumber = new Random();

	public GuessTheNumber() {

	}

	public void genereateGuessNumber(int minimum, int maximum) {
		this.guessedNumber = randomNumber.nextInt(maximum - minimum + 1);
	}

	public String verifyInput(int input) {
		if (input < guessedNumber){ 
			countOfSteps++;
			return " Guessed number is greater than " + input;
		}
		if (input > guessedNumber){
			countOfSteps++;
			return "Guessed number is less than " + input;
		}
		if (input==guessedNumber){
			countOfSteps++;
			status=true;
			return "Congratulations you solved the game in "+ countOfSteps + " steps !";
		}
		return null;
	}

	public int getGuessedNumber() {
		return guessedNumber;
	}

	public void setGuessedNumber(int guessedNumber) {
		this.guessedNumber = guessedNumber;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
