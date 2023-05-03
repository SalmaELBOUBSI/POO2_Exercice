package utilitaires.comparators;

import Code.Lecteur;

import java.util.Comparator;

public class LecteurComparator implements Comparator<Lecteur> {
    @Override
    public int compare(Lecteur o1, Lecteur o2) {
        if(o1.getNom().compareTo(o2.getNom())!=0) return (o1.getNom().compareTo(o2.getNom()));
        return o1.getPrenom().compareTo(o2.getPrenom())  ;
    }
}
