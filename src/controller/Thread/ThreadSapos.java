package controller.Thread;

public class ThreadSapos extends Thread{
	private int pulo;
	private int distanciaTotal = 0;
	private int n;
	private int[] podio;

	public ThreadSapos(int n, int []podio) {
		this.n = n;
		this.podio = podio;
	}
	@Override
	public void run() {
		while (distanciaTotal <100) {
			Sapos();
		}
		Chegada();
		if (podio[4] != 0) {
			Podio();
		}
	}
	private void Sapos() {
		pulo = (int)(Math.random()*11);
		if(pulo !=0) {
			distanciaTotal += pulo;
			System.out.println("Sapo "+ (n+1) + " pulou " + pulo+ " Metros - Distancia total = " + distanciaTotal);
			try {
				sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	private void Chegada() {
		if (distanciaTotal >= 100) {
			System.out.println("Sapo " + (n+1) + " chegou ao final ************");
			for (int c=0; c<podio.length; c++) {
				if(podio[c]==0) {
					podio[c] = n+1;
					c = podio.length;
				}
			}
		}
	}
	private void Podio() {
		System.out.println("-------------------------------");
		for (int c = 0; c < podio.length; c++) {
			System.out.println((c+1) + "º Sapo " + podio[c]);
		}
		System.out.println("-------------------------------");
	}
}
