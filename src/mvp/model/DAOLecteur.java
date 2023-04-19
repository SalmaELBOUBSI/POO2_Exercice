package mvp.model;

import Code.Exemplaire;
import Code.Lecteur;

import java.util.List;

public interface DAOLecteur {
    Lecteur addLecteur(Lecteur lec);

    boolean removeLecteur(Lecteur lec);
    Lecteur updateLecteur(Lecteur lecteur);

    Lecteur readLecteur(int idLecteur);

    List<Lecteur> getLecteurs();

}
