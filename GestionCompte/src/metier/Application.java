package metier;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Compte compteCourant = new CompteCourant(1, 80000, 15000);
		Compte compteEpargne =new CompteEpargne(2, 120000, 5.5);
		try {
		
		compteCourant.verser(20000);
		compteEpargne.retirer(100000);
		//compteEpargne.retirer(100000);
		compteCourant.virer(50000, compteEpargne);
		System.out.println("solde compte courant :" + compteCourant.consulterSolde());
		System.out.println("solde compte epargne :" + compteEpargne.consulterSolde());
		System.out.println("total versement :"+ compteCourant.totalVersement() + "total retrait :"+ compteCourant.totalRetrait());
		System.out.println("total versement :"+ compteEpargne.totalVersement() + "total retrait :"+ compteEpargne.totalRetrait());
		
		List<Operations> listOperation = compteCourant.getOperations();
		for(Operations operation : listOperation) {
			System.out.println(operation.getClass().getSimpleName()+"-------"+ operation.getNumOperations()+"---------"+operation.getDateOperations()+"----montant :"+operation.getMontantOperations());
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
		compteCourant.updateSolde();
		compteEpargne.updateSolde();
		System.out.println("solde compte courant :" + compteCourant.consulterSolde());
		System.out.println("solde compte epargne :" + compteEpargne.consulterSolde());

	}

}
