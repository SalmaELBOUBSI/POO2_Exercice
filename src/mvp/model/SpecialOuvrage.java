package mvp.model;

import Code.Exemplaire;
import Code.Ouvrage;

import java.util.List;

public interface SpecialOuvrage {
    public List<Exemplaire> listerExemplaire(Ouvrage o);
    public List<Exemplaire> listerExemplaire(Ouvrage o,boolean enLocation);

    public double amendeRetard(Ouvrage o,int nj);

}
