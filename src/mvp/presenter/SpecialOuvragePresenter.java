package mvp.presenter;

import Code.Auteur;
import Code.Ouvrage;

public interface SpecialOuvragePresenter {
    void setAuteurPresenter(Presenter<Auteur> auteurPresenter);

    Auteur choixAuteur();

    void listerExemplaire(Ouvrage o);

    void listerExemplaire(Ouvrage o, boolean enLocation);

}
