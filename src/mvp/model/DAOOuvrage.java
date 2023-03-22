package mvp.model;

import Code.Auteur;
import Code.Ouvrage;

import java.util.List;

public interface DAOOuvrage {
    Ouvrage addOuvrages(Ouvrage ouvrage);

    boolean removeOuvrages(Ouvrage ouvrage);

    List<Ouvrage> getOuvrages();
}
