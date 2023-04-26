package mvp.presenter;

import Code.Auteur;
import Code.Ouvrage;
import mvp.model.DAO;
import mvp.model.DAOAuteurs;
import mvp.model.DAOOuvrage;
import mvp.view.AuteurViewInterface;
import mvp.view.OuvrageViewInterface;
import mvp.view.ViewInterface;

import java.util.List;

public class OuvragePresenter extends Presenter<Ouvrage> {
    public OuvragePresenter(DAO<Ouvrage> model, ViewInterface<Ouvrage> view) {
        super(model,view);
    }

}
