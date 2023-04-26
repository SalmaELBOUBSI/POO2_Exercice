package mvp.model;

import Code.Lecteur;
import Code.Rayon;

import java.util.ArrayList;
import java.util.List;

public class RayonModel implements DAO<Rayon>{
    private int numcli =0;
    private List<Rayon> rayons = new ArrayList<>();

    @Override
    public Rayon addRayon(Rayon ray) {
        boolean present= rayons.contains(ray);
        if(!present){
            numcli++;
            //ray.set(numcli);
            rayons.add(ray);
            return ray;
        }
        else return null;
    }

    @Override
    public boolean removeRayon(Rayon ray) {
        return rayons.remove(ray);
    }

    @Override
    public List<Rayon> getRayons() {
        return rayons;
    }

    @Override
    public Rayon add(Rayon element) {
        return null;
    }

    @Override
    public boolean remove(Rayon element) {
        return false;
    }

    @Override
    public Rayon update(Rayon element) {
        return null;
    }

    @Override
    public Rayon read(Rayon element) {
        return null;
    }

    @Override
    public List<Rayon> getAll() {
        return null;
    }
}
