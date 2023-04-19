package mvp.model;

import Code.*;

import java.util.List;

public interface SpecialAuteur {

    List<Ouvrage> listeOuvrage(Auteur aut);

    List<Ouvrage> TypeOuvrage(Auteur aut, TypeOuvrage to);

    List<Ouvrage> GenreOuvrage(Auteur aut, String g);

    List<Livre> TypeLivre(Auteur aut, TypeLivre ti);
}
