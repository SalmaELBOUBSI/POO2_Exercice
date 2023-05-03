package utilitaires.comparators;

import Code.Exemplaire;

import java.util.Comparator;

public class ExemplaireComparator implements Comparator<Exemplaire> {

    @Override
    public int compare(Exemplaire o1, Exemplaire o2) {
        if(o1.getMatricule().compareTo(o2.getMatricule()) !=0)
            return (o1.getMatricule().compareTo(o2.getMatricule()));
        return o1.getMatricule().compareTo(o2.getMatricule());
    }
}
