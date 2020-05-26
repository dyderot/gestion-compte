package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Compte {
	protected int code;
	protected double solde;
	protected List<Operations> operations=new ArrayList<>();
	/**
	 * @param code
	 * @param solde
	 */
	public Compte(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the operations
	 */
	public List<Operations> getOperations() {
		return operations;
	}
	/**
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operations> operations) {
		this.operations = operations;
	}
	
	public void verser(double montant) {
		
		Versement versement =new Versement(operations.size()+1, new Date(), montant);
		operations.add(versement);
		solde +=montant;
	}
	
	public abstract void retirer(double montant);
	public void virer(double montant,Compte compte) {
		retirer(montant);
		compte.verser(montant);
	}
	
	public double consulterSolde() {
		return solde;
	}
	
	public abstract void updateSolde();
	
	public double totalVersement() {
		double somme=0;
		for(Operations operation : operations) {
			if (operation instanceof Versement) {
				somme +=operation.getMontantOperations();
			}
		}
		return somme;
		
	}
	
	public double totalRetrait() {
		double somme=0;
		for(Operations operation: operations) {
			if(operation instanceof Retrait) {
				somme+= operation.getMontantOperations();
			}
		}
		return somme;
	}
	
	
	
	
	
	
	

}
