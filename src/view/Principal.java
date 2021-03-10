package view;

import controller.Thread.ThreadSapos;

public class Principal {

	public static void main(String[] args) {
		
		int [] podio = new int[5];
		
		for(int i = 0; i < 5 ; i++) {
			Thread Corrida = new ThreadSapos(i, podio);
			Corrida.start();
		}
	}
}
