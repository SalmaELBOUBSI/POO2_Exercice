package mvp.model;

import Code.Auteur;
import Code.Lecteur;

import java.util.ArrayList;
import java.util.List;

public class AuteursModel implements DAOAuteurs{
    private int numaut =0;
    private List<Auteur> auteurs = new ArrayList<>();

    @Override
    public Auteur addAuteurs(Auteur auteur) {
        boolean present= auteurs.contains(auteur);
        if(!present){
            numaut++;
            //auteurs.set(numaut);
            auteurs.add(auteur);
            return auteur;
        }
        else return null;
    }

    @Override
    public boolean removeAuteurs(Auteur auteur) {
        return auteurs.remove(auteurs);
    }

    @Override
    public List<Auteur> getAuteurs() {
        return auteurs;
    }
    //a la place de return new ArrayList<>(lecteur) mettre return lecteurs;
}
