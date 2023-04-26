package mvp.view;

import Code.Rayon;
import mvp.presenter.RayonPresenter;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static utilitaires.Utilitaire.affListe;

public class RayonViewConsole extends AbstractViewConsole {
    @Override
    protected void rechercher() {
        System.out.println("code du rayon : ");
        String code = sc.nextLine();
        Rayon rech = new Rayon(code);
        presenter.search(rech);
    }

    @Override
    protected void modifier() {

    }

    @Override
    protected void ajouter() {
        Rayon r =null;
        do {
            try {
                System.out.println("code rayon ");
                String code = sc.nextLine();
                System.out.println("genre ");
                String genre = sc.nextLine();
                r = new Rayon(code, genre);
                break;
            }
            catch (Exception e){
                System.out.println("une erreur est survenue : "+e);
            }
        }while(true);
        presenter.add(r);
        ldatas=presenter.getAll();//rafraichissement
        affListe(ldatas);
    }

    @Override
    protected void special() {

    }
}
