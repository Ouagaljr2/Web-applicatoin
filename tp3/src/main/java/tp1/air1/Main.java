package tp1.air1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Récupération du contrôleur
		DemandeCongeController controller = (DemandeCongeController) context.getBean("DemandeCongeController");

		// Exécution de la requête
		controller.handleRequest();
	}
}
