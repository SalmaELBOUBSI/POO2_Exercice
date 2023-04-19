package mvp.presenter;

import Code.*;
import mvp.model.DAOAuteurs;
import mvp.model.DAOLecteur;
import mvp.model.SpecialAuteur;
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
        view.setListDatas(getAll());
    }

    public  List<Auteur> getAll(){
        return model.getAuteurs();
    }

    public void addAuteurs(Auteur auteur) {
        Auteur aut = model.addAuteurs(auteur);
        if(aut!=null) view.affMsg("création de :"+aut);
        else view.affMsg("erreur de création");
        //List<Auteur> auteurs = model.getAuteurs();
        //view.setListDatas(auteurs);
    }


    public void removeAuteurs(Auteur auteur) {
        boolean ok = model.removeAuteurs(auteur);
        if(ok) view.affMsg("Auteur effacé");
        else view.affMsg("Auteur non effacé");
        //List<Auteur> auteurs = model.getAuteurs();
        //view.setListDatas(auteurs);
    }

    public void update(Auteur auteur) {
        Auteur a  =model.updateAuteur(auteur);
        if(a==null) view.affMsg("mise à jour infrucueuse");
        else view.affMsg("mise à jour effectuée : "+a);
        //view.setListDatas(model.getClients());//désactivé pour éviter appels imbriqués
    }

    public void search(String NAuteur) {
        Auteur a = model.readAuteur(NAuteur);
        if(a==null) view.affMsg("recherche infructueuse");
        else view.affMsg(a.toString());
    }

    public void listeOuvrage(Auteur a){
        List<Ouvrage> louv =((SpecialAuteur)model).listeOuvrage(a);
        if(louv==null || louv.isEmpty()) view.affMsg("Aucun ouvrage trouvé");
        else view.affMsg(louv);
    }

    public void TypeOuvrage(Auteur a, TypeOuvrage to){
        List<Ouvrage> Touv = ((SpecialAuteur)model).TypeOuvrage(a,to);
        if(Touv==null || Touv.isEmpty()) view.affMsg("Type nom trouvé");
        else  view.affMsg(Touv);
    }

    public void TypeLivre(Auteur a, TypeLivre ti){
        List<Livre> Tliv = ((SpecialAuteur)model).TypeLivre(a,ti);
        if(Tliv==null || Tliv.isEmpty()) view.affMsg("Type nom trouvé");
        else  view.affMsg(Tliv);
    }





}
