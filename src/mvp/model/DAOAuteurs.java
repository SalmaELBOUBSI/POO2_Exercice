package mvp.model;

import Code.*;

import java.util.List;

public interface DAOAuteurs {
    Auteur addAuteurs(Auteur auteur);

    boolean removeAuteurs(Auteur auteur);

    List<Auteur> getAuteurs();

    Auteur updateAuteur(Auteur auteur);

    Auteur readAuteur(String NAuteur);

}
