package guessing_game.CFG;

import javax.swing.*;
import java.awt.*;

public class Main extends Frame{
	public static void main(String[] args) {
		int computernumber=(int)(Math.random()*100+1);
		int UserAnswer = 0;
		int count = 0;
		while(UserAnswer != computernumber) {
	 		count++;
			String response=JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", JOptionPane.YES_NO_CANCEL_OPTION);
			UserAnswer=Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, " "+determineGuess(UserAnswer, computernumber, count));
			
	}
	}


	public static String determineGuess(int UserAnswer, int computernumber, int count) {
	
		if(UserAnswer <=0 || UserAnswer>100)
			return "Your guess in invalid";
		else if(UserAnswer == computernumber)
			return "Correct! You got the answer \n It took you "+count+" guesses to guess right :)";
		else if(UserAnswer > computernumber)
			return "Your guess is too high, try again, \n Try Number : "+count;
		else if(UserAnswer < computernumber)
			return "Your guess is too low, try again, \n Try Number : "+count;
		else
			return "Your guess is incorrect \n Try Number : "+count;
	}
}
