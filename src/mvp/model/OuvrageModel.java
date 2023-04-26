package mvp.model;

import Code.Auteur;
import Code.Exemplaire;
import Code.Ouvrage;

import java.util.ArrayList;
import java.util.List;

public class OuvrageModel extends AbstractModel<Ouvrage> implements SpecialOuvrage{
    @Override
    public List<Exemplaire> listerExemplaire(Ouvrage o) {
        return o.listerExemplaires();
    }

    @Override
    public List<Exemplaire> listerExemplaire(Ouvrage o, boolean enLocation) {
        return o.listerExemplaires(enLocation);
    }

    @Override
    public double amendeRetard(Ouvrage o, int nj) {
        return o.amendeRetard(nj);
    }

}
