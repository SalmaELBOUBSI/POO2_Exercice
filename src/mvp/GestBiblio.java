package mvp;

import Code.Auteur;
import mvp.model.*;
import mvp.presenter.AuteursPresenter;
import mvp.presenter.LecteurPresenter;
import mvp.presenter.RayonPresenter;
import mvp.view.*;

import java.util.List;

public class GestBiblio {
    public static void main(String[] args) {
        DAOLecteur lm = new LecteurModel();

        LecteurViewInterface lv = new LecteurViewConsole();

        LecteurPresenter lp = new LecteurPresenter(lm, lv);//création et injection de dépendance
        lp.start();

        DAOAuteurs am = new AuteursModel();
        AuteurViewInterface av = new AuteurViewConsole();
        AuteursPresenter ap = new AuteursPresenter(am,av);
        lp.start();

        DAORayon rm = new RayonModel();
        RayonViewInterface rv = new RayonViewConsole();
        RayonPresenter rp = new RayonPresenter(rm,rv);
        lp.start();


    }
}
