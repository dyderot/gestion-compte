package metier;

public class Application {

	public static void main(String[] args) {
		
		Compte compteCourant = new CompteCourant(1, 80000, 15000);
		Compte compteEpargne =new CompteEpargne(2, 120000, 5.5);
		
		compteCourant.verser(20000);
		compteEpargne.retirer(100000);
		compteCourant.virer(50000, compteEpargne);
		System.out.println("solde compte courant :" + compteCourant.consulterSolde());
		System.out.println("solde compte epargne :" + compteEpargne.consulterSolde());

	}

}
