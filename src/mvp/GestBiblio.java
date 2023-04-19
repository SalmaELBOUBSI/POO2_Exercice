package mvp;

import Code.Auteur;
import mvp.model.*;
import mvp.presenter.AuteursPresenter;
import mvp.presenter.LecteurPresenter;
import mvp.presenter.RayonPresenter;
import mvp.view.*;
import utilitaires.Utilitaire;

import java.util.Arrays;
import java.util.List;

public class GestBiblio {
    private DAOLecteur lm;
    private LecteurViewInterface lv;
    private LecteurPresenter lp;



    public void gestion(){
        lm = new LecteurModel();
        lv = new LecteurViewConsole();
        lp = new LecteurPresenter(lm, lv);//création et injection de dépendance

        List<String> loptions = Arrays.asList("lecteurs","fin");
        do {
            int ch = Utilitaire.choixListe(loptions);
            switch (ch){
                case 1: lp.start();
                    break;
                case 2 : System.exit(0);
            }
        }while(true);
    }
    public static void main(String[] args) {
        GestBiblio gb = new GestBiblio();
        gb.gestion();
    }
}
