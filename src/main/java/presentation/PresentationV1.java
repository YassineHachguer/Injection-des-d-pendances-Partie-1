package presentation;

import dao.DaoImpl;
import ext.DaoImplV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args){
        //Injection des dépendances par instanciation Statique
        DaoImplV2 d= new DaoImplV2();
        MetierImpl metier=new MetierImpl(d);
        //metier.setDao(d); //Injection via le setter
        System.out.println("RES = "+ metier.calcul());
    }
}
