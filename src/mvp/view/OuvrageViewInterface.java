package mvp.view;

import Code.Auteur;
import Code.Ouvrage;
import mvp.presenter.OuvragePresenter;

import java.util.List;

public interface OuvrageViewInterface {
    public void setPresenter(OuvragePresenter presenter);

    public void setListDatas(List<Ouvrage> ouvrages);

    public void affMsg(String msg);
}
