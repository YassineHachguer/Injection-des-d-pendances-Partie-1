package presentation;

import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner scanner=new Scanner(new File("config.txt"));
            String daoClassname=scanner.nextLine();
            Class cDao=Class.forName(daoClassname);
            IDao dao =(IDao) cDao.getConstructor().newInstance();

            //MetierImpl metier =new MetierImpl(d);
            String metierClassname=scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            System.out.println("RES = " + metier.calcul());
            //l'injection des dépendances Par instanciation dynamique
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
