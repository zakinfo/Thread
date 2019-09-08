
public class VoiturePrime implements Runnable{
	private String nom;
	private int compteur;

	public VoiturePrime(String nom) {
		super();
		this.nom = nom;
	}

	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				++compteur;
				System.out.println("Voiture:" + nom + " I=" + i + " Compteur=" + compteur);
				Thread.sleep(10000);
			}

			
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}
	public static void main(String[] args) {
	  
		VoiturePrime v1 = new VoiturePrime("BMW");
		VoiturePrime v2 = new VoiturePrime("Clio");
		new Thread(v1).start();
		new Thread(v2).start();
		new Thread(v2).start();

	}

}
