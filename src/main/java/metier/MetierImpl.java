package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    //Couplage faible on depend des interfaces, pas des implémentations
    private IDao dao;
    @Override
    public double calcul() {
        double t=dao.getData();
        double res =t*23;
        return res;
    }

}
