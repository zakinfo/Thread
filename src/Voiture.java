
public class Voiture extends Thread {

	private String nom;
	private int compteur;

	public Voiture(String nom) {
		super();
		this.nom = nom;
	}

	public synchronized void run() {

		try {
			for (int i = 0; i < 10; i++) {
				synchronized (this) {
					++compteur;
				}
				System.out.println("Voiture:" + nom + " I=" + i + " Compteur=" + compteur);
				Thread.sleep(10000);
			}

		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {
		Voiture v1 = new Voiture("BMW");
		Voiture v2 = new Voiture("Mercedes");
		v1.start();
		v2.start();

	}

}
