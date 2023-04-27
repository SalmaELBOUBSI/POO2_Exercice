package mvp.presenter;

import Code.Exemplaire;
import Code.Ouvrage;
import Code.Rayon;

public interface SpecialExemplairePresenter {
    void setOuvragePresenter(Presenter<Ouvrage> ouvragePresenter);

    void setRayonPresenter(Presenter<Rayon> rayonPresenter);

    Ouvrage choixOuvrage();

    Rayon choixRayon();

    void modifierEtat(Exemplaire ex, String etat);

    void LecteurActuel(Exemplaire ex);

    void lecteurs(Exemplaire ex);

    void envoiMailLecteurActuel(Exemplaire ex);

    void envoiMailLecteurs(Exemplaire ex);

    void enRetard(Exemplaire ex);

    void joursRetard(Exemplaire ex);

    void enLocation(Exemplaire ex);
}