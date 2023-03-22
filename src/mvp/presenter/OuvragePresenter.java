package mvp.presenter;

import Code.Auteur;
import Code.Ouvrage;
import mvp.model.DAOAuteurs;
import mvp.model.DAOOuvrage;
import mvp.view.AuteurViewInterface;
import mvp.view.OuvrageViewInterface;

import java.util.List;

public class OuvragePresenter {
    private DAOOuvrage model;
    private OuvrageViewInterface view;

    public OuvragePresenter(DAOOuvrage model, OuvrageViewInterface view) {
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start() {
        List<Ouvrage> ouvrages = model.getOuvrages();
        view.setListDatas(ouvrages);
    }

    public void addOuvrages(Ouvrage ouvrage) {
        Ouvrage ouv = model.addOuvrages(ouvrage);
        if(ouv!=null) view.affMsg("création de :"+ouv);
        else view.affMsg("erreur de création");
        List<Ouvrage> ouvrages = model.getOuvrages();
        view.setListDatas(ouvrages);
    }


    public void removeOuvrages(Ouvrage ouvrage) {
        boolean ok = model.removeOuvrages(ouvrage);
        if(ok) view.affMsg("Ouvrage effacé");
        else view.affMsg("Ouvrage non effacé");
        List<Ouvrage> ouvrages = model.getOuvrages();
        view.setListDatas(ouvrages);
    }
}
