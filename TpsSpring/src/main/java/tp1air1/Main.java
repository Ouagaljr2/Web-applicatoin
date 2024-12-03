package tp1air1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
    	
    	 BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
    	 
         DemandeConge demandeConge1 = (DemandeConge) factory.getBean("demandeConge");
         //System.out.println(demandeConge1);

         DemandeConge demandeConge2 = (DemandeConge) factory.getBean("demandeConge");
         //System.out.println(demandeConge2);
         
         DemandeCongeSansModificateurs demandeConge3= (DemandeCongeSansModificateurs) factory.getBean("demandeCongeSansModificateurs");
         System.out.println(demandeConge3);
    }
}

