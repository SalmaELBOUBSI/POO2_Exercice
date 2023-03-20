package mvp.model;

import Code.Lecteur;
import Code.Rayon;

import java.util.List;

public interface DAORayon {
    Rayon addRayon(Rayon ray);

    boolean removeRayon(Rayon ray);

    List<Rayon> getRayons();
}
