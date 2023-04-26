package mvp.view;

import Code.Auteur;
import mvp.presenter.AuteurPresenter;

import java.util.List;

public interface AuteurViewInterface {
    public void setPresenter(AuteurPresenter presenter);

    public void setListDatas(List<Auteur> auteurs);

    public void affMsg(String msg);
}
