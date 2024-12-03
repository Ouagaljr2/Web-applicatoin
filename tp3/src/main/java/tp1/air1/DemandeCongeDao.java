package tp1.air1;

import org.springframework.stereotype.Repository;

@Repository
public class DemandeCongeDao {
	public String save() {
		return "Demande de congé enregistrée dans la base de données.";
	}
}
