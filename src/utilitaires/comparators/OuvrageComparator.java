package utilitaires.comparators;

import Code.Ouvrage;

import java.util.Comparator;

public class OuvrageComparator implements Comparator<Ouvrage> {
    @Override
    public int compare(Ouvrage o1, Ouvrage o2) {
        if(o1.getTitre().compareTo(o2.getTitre()) !=0)
            return (o1.getTitre().compareTo(o2.getTitre()));
        return o1.getTitre().compareTo(o2.getTitre());
    }
}
