
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Compteur(100);
	}

	public static class Compteur {
		int quantite;
		int chiffres[];

		public Compteur(int quantite) {
			this.quantite = quantite;
			this.chiffres = new int[quantite];
			chiffres[0] = 2;
			compter();
			afficher();
		}

		private void afficher() {
			for (int i = 0; i < chiffres.length; i++) {
				System.out.print(chiffres[i] + ", ");
			}

		}

		private void compter() {
			int chiffre = 3;
			for (int i = 1; i < quantite; i++) {
				boolean primaire = false;
				int diviseur = 2;
				int compteur = 0;
				while (!primaire) {
					if (chiffre % 2 == 0 || (diviseur != 0 && chiffre % diviseur == 0 && chiffre != diviseur)) {
						compteur = 0;
						chiffre += 2;
						diviseur = chiffres[compteur];
						primaire = false;

					} else if (diviseur > (chiffre / 2)) {
						chiffres[i] = chiffre;
						chiffre += 2;
						break;
					}
					compteur++;
					diviseur = chiffres[compteur];
				}

			}
		}
	}
}
