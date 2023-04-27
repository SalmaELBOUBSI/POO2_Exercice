package mvp;

import Code.*;
import mvp.model.*;
import mvp.presenter.*;
import mvp.view.*;
import utilitaires.Utilitaire;

import java.util.Arrays;
import java.util.List;

public class GestBiblio {
    private LecteurModel lm;
    private LecteurViewConsole lv;
    private LecteurPresenter lp;

    private DAO<Rayon> rm;
    private RayonViewConsole rv;
    private RayonPresenter rp;
    private DAO<Auteur> am;
    private ViewInterface<Auteur> av;
    private Presenter<Auteur> ap;

    private OuvrageModel om;
    private OuvrageViewConsole ov;
    private OuvragePresenter op;


    private DAO<Exemplaire> em;
    private ViewInterface<Exemplaire> ev;
    private Presenter<Exemplaire> ep;


    private DAO<Location> locm;
    private ViewInterface<Location> locv;
    private Presenter<Location> locp;

    public void gestion(){
        lm = new LecteurModel();
        lv = new LecteurViewConsole();
        lp = new LecteurPresenter(lm, lv);//création et injection de dépendance

        rm = new RayonModel();
        rv = new RayonViewConsole();
        rp = new RayonPresenter(rm,rv);//création et injection de dépendance

        om = new OuvrageModel();
        ov = new OuvrageViewConsole();
        op = new OuvragePresenter(om,ov);//création et injection de dépendance

        em = new ExemplaireModel();
        ev = new ExemplaireViewConsole();
        ep = new ExemplairePresenter(em,ev);//création et injection de dépendance

        am = new AuteurModel();
        av = new AuteurViewConsole();
        ap = new AuteurPresenter(am,av);//création et injection de dépendance

        locm = new LocationModel();
        locv = new LocationViewConsole();
        locp = new LocationPresenter(locm,locv);//création et injection de dépendance


        List<String> loptions = Arrays.asList("lecteurs","rayon","ouvrages","exemplaires","auteurs","locations","fin");
        do {
            int ch = Utilitaire.choixListe(loptions);
            switch (ch){
                case 1: lp.start();
                    break;
                case 2: rp.start();
                    break;
                case 3: op.start();
                    break;
                case 4: ep.start();
                    break;
                case 5: ap.start();
                    break;
                case 6: locp.start();
                    break;

                case 7 : System.exit(0);
            }
        }while(true);
    }


    public static void main(String[] args) {
        GestBiblio gb = new GestBiblio();
        gb.gestion();
    }
}
