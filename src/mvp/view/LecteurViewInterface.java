package mvp.view;

import Code.Exemplaire;
import Code.Lecteur;
import mvp.presenter.LecteurPresenter;
import mvp.presenter.LecteurPresenterV1;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public interface LecteurViewInterface {
    public void setPresenter(LecteurPresenterV1 presenter);

    public void setListDatas(List<Lecteur> lecteurs);

    public void affMsg(String msg);


    void affList(List<Exemplaire> lex);

    Lecteur selectionner(List<Lecteur> all);
}
