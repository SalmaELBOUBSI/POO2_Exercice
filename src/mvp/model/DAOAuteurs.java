package mvp.model;

import Code.Auteur;
import Code.Lecteur;

import java.util.List;

public interface DAOAuteurs {
    Auteur addAuteurs(Auteur auteur);

    boolean removeAuteurs(Auteur auteur);

    List<Auteur> getAuteurs();
}
