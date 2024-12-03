package tp1air1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Collaborateur extends DemandeConge{
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
