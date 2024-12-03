package tp1air1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Charger le contexte Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        // Récupérer et afficher DemandeConge (injection par type)
        DemandeConge demandeConge = context.getBean("demandeConge", DemandeConge.class);
        System.out.println("Injection par type (DemandeConge) :");
        System.out.println(demandeConge);

        // Récupérer et afficher DemandeCongeSansModificateurs (injection par constructeur)
        DemandeCongeSansModificateurs demandeCongeSansModificateurs = context.getBean("demandeCongeSansModificateurs", DemandeCongeSansModificateurs.class);
        System.out.println("\nInjection par constructeur (DemandeCongeSansModificateurs) :");
        System.out.println(demandeCongeSansModificateurs);

        // Comparaison des instances
        DemandeConge demandeConge2 = context.getBean("demandeConge", DemandeConge.class);
        System.out.println("\nMême instance pour demandeConge : " + (demandeConge == demandeConge2));
    }
}
