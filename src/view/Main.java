package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.queue.Queue;
import controller.PhoneController;

public class Main {

	public static void main(String[] args) {

		try {
			PhoneController controller = new PhoneController();
			Queue<String> queue = new Queue<>();
			String[] options = { "Insert Call", "Consult Calls" };
			String option;
			do {
				option = (String) JOptionPane.showInputDialog(null, "Select a Operation", "Call Service",
						JOptionPane.DEFAULT_OPTION, null, options, options[0]);

				if(option != null) {
					if (option.equals(options[0]))
						controller.insertCall(queue, JOptionPane.showInputDialog(null,"Type the phone-number", option, JOptionPane.DEFAULT_OPTION));
					if (option.equals(options[1]))
						controller.consultCalls(queue);
				}
			} while (option != null);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
