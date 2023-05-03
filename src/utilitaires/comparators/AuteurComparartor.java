package utilitaires.comparators;

import Code.Auteur;

import java.util.Comparator;

public class AuteurComparartor implements Comparator<Auteur> {
    @Override
    public int compare(Auteur o1, Auteur o2) {
        if(o1.getNom().compareTo(o2.getNom())!=0) return (o1.getNom().compareTo(o2.getNom()));
        return o1.getPrenom().compareTo(o2.getPrenom())  ;
    }

}
