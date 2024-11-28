package loops;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Ex49 {

	public static void main(String[] args) {

		ArrayList<Integer> gdc = new ArrayList<>();

		int firstValue, secondValue, gdc1 = 0, remainder;

		String userAnswer;

		do {

			firstValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first value"));

			secondValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second value"));

			if (firstValue <= 0 || secondValue <= 0) {

				JOptionPane.showMessageDialog(null, "Please input a number greater than zero!!");
				
			} else {

				gdc.clear();

				gdc.add(firstValue);

				gdc.add(secondValue);

				Collections.sort(gdc);

				int a = gdc.get(1);
				
				
				int b = gdc.get(0);

				
				while (b != 0) {
					
					
					remainder = a % b;

					a = b;

					b = remainder;
				}

				gdc1 = a;

				JOptionPane.showMessageDialog(null,
						"The GCD of " + firstValue + " and " + secondValue + " is: " + gdc1);
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");
			
			
			userAnswer = userAnswer.trim(); 
		} while (userAnswer.equalsIgnoreCase("yes"));
	}
}
