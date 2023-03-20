package mvp.view;

import Code.Auteur;
import Code.Lecteur;
import mvp.presenter.AuteursPresenter;
import mvp.presenter.LecteurPresenter;

import java.util.List;

public interface AuteurViewInterface {
    public void setPresenter(AuteursPresenter presenter);

    public void setListDatas(List<Auteur> auteurs);

    public void affMsg(String msg);
}
