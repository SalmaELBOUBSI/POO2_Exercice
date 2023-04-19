package mvp.model;

import Code.Exemplaire;
import Code.Lecteur;

import java.util.List;

public interface SpecialLecteur {
    public List<Exemplaire> exemplairesEnLocation(Lecteur l);
    public List<Exemplaire> exemplairesLoues(Lecteur l);
}
