package metier;

import java.util.Date;

public class Operations {
	
	private int numOperations;
	private Date dateOperations;
	private double montantOperations;
	
	public Operations() {
		super();
	}

	/**
	 * @param numOperations
	 * @param dateOperations
	 * @param montantOperations
	 */
	public Operations(int numOperations, Date dateOperations, double montantOperations) {
		super();
		this.numOperations = numOperations;
		this.dateOperations = dateOperations;
		this.montantOperations = montantOperations;
	}

	/**
	 * @return the numOperations
	 */
	public int getNumOperations() {
		return numOperations;
	}

	/**
	 * @param numOperations the numOperations to set
	 */
	public void setNumOperations(int numOperations) {
		this.numOperations = numOperations;
	}

	/**
	 * @return the dateOperations
	 */
	public Date getDateOperations() {
		return dateOperations;
	}

	/**
	 * @param dateOperations the dateOperations to set
	 */
	public void setDateOperations(Date dateOperations) {
		this.dateOperations = dateOperations;
	}

	/**
	 * @return the montantOperations
	 */
	public double getMontantOperations() {
		return montantOperations;
	}

	/**
	 * @param montantOperations the montantOperations to set
	 */
	public void setMontantOperations(double montantOperations) {
		this.montantOperations = montantOperations;
	}
	
	
	

}
