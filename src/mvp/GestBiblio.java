package mvp;

import mvp.model.DAOLecteur;
import mvp.model.LecteurModel;
import mvp.presenter.LecteurPresenter;
import mvp.view.LecteurViewConsole;
import mvp.view.LecteurViewInterface;

public class GestBiblio {
    public static void main(String[] args) {
        DAOLecteur lm = new LecteurModel();

        LecteurViewInterface lv = new LecteurViewConsole();

        LecteurPresenter lp = new LecteurPresenter(lm, lv);//création et injection de dépendance
        lp.start();

    }
}
