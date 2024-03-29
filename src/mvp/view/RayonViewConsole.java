package mvp.view;

import Code.Auteur;
import Code.Rayon;
import mvp.presenter.RayonPresenter;
import mvp.presenter.SpecialRayonPresenter;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static utilitaires.Utilitaire.*;

public class RayonViewConsole extends AbstractViewConsole<Rayon> implements SpecialRayonViewConsole {
    @Override
    public void setListDatas(List<Rayon> ldatas){

        ldatas.sort((o1, o2) -> {
            if(o1.getCodeRayon().compareTo(o2.getCodeRayon())!=0) return (o1.getCodeRayon().compareTo(o2.getCodeRayon()));
            return o1.getCodeRayon().compareTo(o2.getCodeRayon())  ;
        });
        super.setListDatas(ldatas);
    }
    @Override
    protected void rechercher() {
        System.out.println("code du rayon : ");
        String code = sc.nextLine();
        Rayon rech = new Rayon(code);
        presenter.search(rech);
    }

    @Override
    protected void modifier() {
        int choix = choixElt(ldatas);
        Rayon r= ldatas.get(choix-1);
        do {
            try {
                String genre = modifyIfNotBlank("nom", r.getGenre());
                r.setGenre(genre);
                break;
            } catch (Exception e) {
                System.out.println("erreur :" + e);
            }
        }while(true);
        presenter.update(r);
        ldatas=presenter.getAll();//rafraichissement
        affListe(ldatas);
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
                presenter.add(r);
                ldatas=presenter.getAll();//rafraichissement
                affListe(ldatas);
                break;
            }
            catch (Exception e){
                System.out.println("une erreur est survenue : "+e);
            }
        }while(true);

    }

    @Override
    protected void special() {
        int choix =  choixElt(ldatas);
        Rayon r  = ldatas.get(choix-1);

        List options = new ArrayList<>(Arrays.asList("lister exemplaires","fin"));
        do {
            int ch = choixListe(options);

            switch (ch) {

                case 1:
                    exemplaires(r);
                    break;
                case 2 :return;
            }
        } while (true);


    }

    @Override
    public void exemplaires(Rayon r) {
        ((SpecialRayonPresenter)presenter).listerExemplaires(r);
    }
}
