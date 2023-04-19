package mvp.model;

import Code.*;

import java.util.ArrayList;
import java.util.List;

public class AuteursModel implements DAOAuteurs,SpecialAuteur{
    private int numaut =0;
    private List<Auteur> auteurs = new ArrayList<>();

    public AuteursModel(){
        populate();
    }
    private void populate(){
        Auteur laut = new Auteur("Marie","Dupont","Blg");
        addAuteurs(laut);
        laut = new Auteur("Jean","Durant","FR");
        addAuteurs(laut);
    }

    @Override
    public Auteur addAuteurs(Auteur auteur) {
        boolean present= auteurs.contains(auteur);
        if(!present){
            numaut++;
           // auteurs.set(numaut++);
            auteurs.add(auteur);
            return auteur;
        }
        else return null;
    }

    @Override
    public boolean removeAuteurs(Auteur auteur) {
        return auteurs.remove(auteurs);
    }

    @Override
    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    @Override
    public Auteur updateAuteur(Auteur auteur) {
        int p =auteurs.indexOf(auteur);
        if(p < 0) return null;
        auteurs.set(p,auteur);
        return auteur;
    }

    @Override
    public Auteur readAuteur(String NAuteur) {
        for (Auteur a : auteurs) {
            if (a.getNom() == NAuteur) return a;
        }
        return null;
    }

    @Override
    public List<Ouvrage> listeOuvrage(Auteur aut){
        return aut.listerOuvrages(); }

    @Override
    public List<Ouvrage> TypeOuvrage(Auteur aut, TypeOuvrage to){
        return aut.listerOuvrages(to);
    }

    @Override
    public List<Ouvrage> GenreOuvrage(Auteur aut,String g){
        return aut.listerOuvrages(g);
    }
    @Override
    public List<Livre> TypeLivre(Auteur aut, TypeLivre ti){
        return aut.listerLivres(ti);
    }

}
