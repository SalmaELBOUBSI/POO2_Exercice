package mvp.presenter;

import Code.*;
import mvp.model.DAO;
import mvp.view.ViewInterface;


public class AuteurPresenter extends Presenter<Auteur> {

    public AuteurPresenter(DAO<Auteur> model, ViewInterface<Auteur> view) {
        super(model, view);
    }

}
