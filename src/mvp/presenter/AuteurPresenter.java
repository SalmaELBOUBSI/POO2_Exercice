package mvp.presenter;

import Code.*;
import mvp.model.DAO;
import mvp.model.SpecialAuteur;
import mvp.view.ViewInterface;


public class AuteurPresenter extends Presenter<Auteur> implements SpecialAuteurPresenter {


    public AuteurPresenter(DAO<Auteur> model, ViewInterface<Auteur> view) {
        super(model, view);
    }
    @Override
    public void  listerOuvrages(Auteur a) {

        view.affList (((SpecialAuteur)model).listerOuvrages(a));
    }


    @Override
    public void listerLivre(Auteur a, TypeLivre tl) {

        view.affList (((SpecialAuteur)model).listerLivre(a,tl));
    }

    @Override
    public void listerOuvrages(Auteur a, String genre) {
        view.affList (((SpecialAuteur)model).listerOuvrages(a,genre));
    }
}
