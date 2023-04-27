package mvp.model;

import Code.Exemplaire;
import Code.Lecteur;
import Code.Rayon;

import java.util.ArrayList;
import java.util.List;

public class RayonModel extends AbstractModel<Rayon> implements SpecialRayon{
    @Override
    public List<Exemplaire> listerExemplaires(Rayon r) {
        return r.listerExemplaires();
    }

}
