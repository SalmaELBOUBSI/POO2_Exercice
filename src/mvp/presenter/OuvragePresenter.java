package mvp.presenter;

import Code.Auteur;
import Code.Ouvrage;
import mvp.model.DAO;
import mvp.model.SpecialOuvrage;
import mvp.view.ViewInterface;

public class OuvragePresenter extends Presenter<Ouvrage> implements SpecialOuvragePresenter{

    private Presenter<Auteur> auteurPresenter;
    @Override
    public void setAuteurPresenter(Presenter<Auteur> auteurPresenter) {
        this.auteurPresenter = auteurPresenter;
    }

    @Override
    public Auteur choixAuteur(){
        return  auteurPresenter.selection();
    }

    public OuvragePresenter(DAO<Ouvrage> model, ViewInterface<Ouvrage> view) {
        super(model,view);
    }

    @Override
    public void  listerExemplaire(Ouvrage o){
        view.affList(((SpecialOuvrage)model).listerExemplaire(o));
    }
    @Override
    public void listerExemplaire(Ouvrage o, boolean enLocation){
        view.affList(((SpecialOuvrage)model).listerExemplaire(o,enLocation));
    }
}
