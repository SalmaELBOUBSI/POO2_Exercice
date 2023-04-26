package mvp.view;

import Code.Auteur;
import Code.Ouvrage;
import Code.TypeOuvrage;
import mvp.presenter.OuvragePresenter;
import utilitaires.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OuvrageViewConsole extends AbstractViewConsole<Ouvrage>{
    @Override
    protected void rechercher() {

    }

    @Override
    protected void modifier() {

    }

    @Override
    protected void ajouter() {
        TypeOuvrage[] tto = TypeOuvrage.values();
        List<TypeOuvrage> lto = new ArrayList<>(Arrays.asList(tto));
        int choix = Utilitaire.choixListe(lto);
        Ouvrage o = null;
        List<OuvrageFactory> lof = new ArrayList<>(Arrays.asList(new LivreFactory(),new CDFactory(),new DVDFactory()));
        o = lof.get(choix-1).create();
        presenter.add(o);
        //TODO attribuer auteurs, les auteur sont triés par odre de nom et prénom, empêcher doublons
    }

    @Override
    protected void special() {

    }
}
