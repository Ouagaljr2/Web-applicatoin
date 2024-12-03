package tp1.air1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("DemandeCongeController")
public class DemandeCongeController {
    private DemandeCongeService demandeCongeService;

    @Autowired
    public DemandeCongeController(DemandeCongeService demandeCongeService) {
        this.demandeCongeService = demandeCongeService;
    }

    public void handleRequest() {
        String result = demandeCongeService.processConge();
        System.out.println(result);
    }
}
