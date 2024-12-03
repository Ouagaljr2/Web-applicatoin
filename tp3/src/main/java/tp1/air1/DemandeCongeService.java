package tp1.air1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemandeCongeService {
    private final DemandeCongeDao demandeCongeDao;

    @Autowired
    public DemandeCongeService(DemandeCongeDao demandeCongeDao) {
        this.demandeCongeDao = demandeCongeDao;
    }

    public String processConge() {
        return demandeCongeDao.save();
    }
}