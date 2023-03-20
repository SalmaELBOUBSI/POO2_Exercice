package mvp.presenter;

import Code.Auteur;
import Code.Lecteur;
import mvp.model.DAOAuteurs;
import mvp.model.DAOLecteur;
import mvp.view.AuteurViewInterface;
import mvp.view.LecteurViewInterface;

import java.util.List;

public class AuteursPresenter {
    private DAOAuteurs model;
    private AuteurViewInterface view;

    public AuteursPresenter(DAOAuteurs model, AuteurViewInterface view) {
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start() {
        List<Auteur> auteurs = model.getAuteurs();
        view.setListDatas(auteurs);
    }

    public void addAuteurs(Auteur auteur) {
        Auteur aut = model.addAuteurs(auteur);
        if(aut!=null) view.affMsg("création de :"+aut);
        else view.affMsg("erreur de création");
        List<Auteur> auteurs = model.getAuteurs();
        view.setListDatas(auteurs);
    }


    public void removeAuteurs(Auteur auteur) {
        boolean ok = model.removeAuteurs(auteur);
        if(ok) view.affMsg("Auteur effacé");
        else view.affMsg("Auteur non effacé");
        List<Auteur> auteurs = model.getAuteurs();
        view.setListDatas(auteurs);
    }
}
