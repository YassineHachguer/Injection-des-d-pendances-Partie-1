package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args){
        //Injection des dépendances par instanciation Statique
        DaoImpl d=new DaoImpl();
        MetierImpl metier=new MetierImpl(d);
        //metier.setDao(d); //Injection via le setter
        System.out.println("RES = "+ metier.calcul());
    }
}
