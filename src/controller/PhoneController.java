package controller;

import br.edu.fateczl.queue.Queue;

public class PhoneController {
	
	public PhoneController() {
		super();
	}
	
	public void insertCall(Queue<String> queue, String phoneNumber) {
		if(phoneNumber != null && !phoneNumber.equals(""))
			queue.insert(phoneNumber);
	}
	
	public void consultCalls(Queue<String> queue) throws Exception {
		if(!queue.isEmpty())
			while(!queue.isEmpty())
				System.out.println(queue.remove());
		else
			System.out.println("There are no calls to show!");
	}

}
