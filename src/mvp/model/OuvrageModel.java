package mvp.model;

import Code.Auteur;
import Code.Ouvrage;

import java.util.ArrayList;
import java.util.List;

public class OuvrageModel implements DAOOuvrage{
    private int numouv =0;
    private List<Ouvrage> ouvrages = new ArrayList<>();

    @Override
    public Ouvrage addOuvrages(Ouvrage ouvrage) {
        boolean present= ouvrages.contains(ouvrage);
        if(!present){
            numouv++;
            //ouvrages.set(numouv);
            ouvrages.add(ouvrage);
            return ouvrage;
        }
        else return null;
    }

    @Override
    public boolean removeOuvrages(Ouvrage ouvrage) {
        return ouvrages.remove(ouvrages);
    }

    @Override
    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }
}
