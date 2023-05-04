package mvp.presenter;

import Code.Exemplaire;
import Code.Lecteur;

import java.util.List;

public interface SpecialLecteurPresenter {
    void exemplairesEnLocation(Lecteur l);

    void exemplairesLoues(Lecteur l);

    void lecParMail(String mail);
}
