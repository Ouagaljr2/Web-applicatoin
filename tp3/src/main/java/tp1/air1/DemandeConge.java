package tp1.air1;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class DemandeConge {
	
	@Autowired
	private Collaborateur collaborateur;
	@Autowired
	private Periode periode;
	
	public Collaborateur getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}
	public Periode getPeriode() {
		return periode;
	}
	public void setPeriode(Periode periode) {
		this.periode = periode;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}


