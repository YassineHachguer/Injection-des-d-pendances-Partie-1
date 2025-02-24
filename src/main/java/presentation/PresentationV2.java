package presentation;

import dao.IDao;

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
            System.out.println(dao.getData());
            //l'injection des dépendances Par instanciation dynamique
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
