package mvp.model;

import Code.Lecteur;

import java.util.List;

public interface DAOLecteur {
    Lecteur addLecteur(Lecteur lec);

    boolean removeLecteur(Lecteur lec);

    List<Lecteur> getLecteurs();
}
