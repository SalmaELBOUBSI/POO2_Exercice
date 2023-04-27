package mvp.presenter;

import Code.Auteur;
import Code.TypeLivre;

public interface SpecialAuteurPresenter {
    void listerOuvrages(Auteur a);

    void listerLivre(Auteur a, TypeLivre tl);

    void listerOuvrages(Auteur a, String genre);
}
