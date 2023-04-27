package mvp.presenter;

import Code.Exemplaire;
import Code.Lecteur;
import Code.Location;

public interface SpecialLocationPresenter {
    void setExemplairePresenter(Presenter<Exemplaire> exemplairePresenter);

    void setLecteurPresenter(Presenter<Lecteur> lecteurPresenter);

    Exemplaire choixExemplaire();

    Lecteur choixLecteur();

    void calculerAmende(Location l);

    void enregistrerRetour(Location l);
}
