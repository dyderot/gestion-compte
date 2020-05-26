package metier;

import java.util.Date;

public class CompteEpargne extends Compte{
	private double taux;

	public CompteEpargne(int code, double solde , double taux) {
		super(code, solde);
		this.taux=taux;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirer(double montant) {
		// TODO Auto-generated method stub
		
		if(montant>solde) throw new RuntimeException("solde inssufisant");
		Retrait retrait =new Retrait(operations.size()+1, new Date(), montant);
		operations.add(retrait);
		solde-=montant;
		
	}

	@Override
	public void updateSolde() {
		// TODO Auto-generated method stub
		
		solde = solde*(1+taux/100);
	}

	

}
