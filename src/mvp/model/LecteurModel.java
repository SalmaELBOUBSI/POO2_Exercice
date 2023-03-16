package mvp.model;

import Code.Lecteur;

import java.util.ArrayList;
import java.util.List;

public class LecteurModel implements DAOLecteur {
    private int numcli =0;
    private List<Lecteur> lecteurs = new ArrayList<>();

    @Override
    public Lecteur addLecteur(Lecteur lec) {
        boolean present= lecteurs.contains(lec);
        if(!present){
            numcli++;
            lec.setNumlecteur(numcli);
            lecteurs.add(lec);
            return lec;
        }
        else return null;
    }

    @Override
    public boolean removeLecteur(Lecteur lec) {
        return lecteurs.remove(lec);
    }

    @Override
    public List<Lecteur> getLecteurs() {
        return lecteurs;
    }
    //a la place de return new ArrayList<>(lecteur) mettre return lecteurs;
}

