package metier;

import java.util.Date;

public class CompteCourant extends Compte{
	private double decouvert;

	/**
	 * @param code
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant(int code, double solde, double decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}

	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public void retirer(double montant) {
		// TODO Auto-generated method stub
		if(montant-decouvert>solde) throw new RuntimeException("solde inssufisant");
		Retrait retrait=new Retrait(operations.size()+1, new Date(), montant);
		operations.add(retrait);
		solde-=montant;
		
	}

	@Override
	public void updateSolde() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
