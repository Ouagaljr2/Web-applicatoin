package tp1air1;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Periode extends DemandeConge {
	private String dateDebut;
	private int nbJours;

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public String toSting() {
		return ToStringBuilder.reflectionToString(this);
	}

}
