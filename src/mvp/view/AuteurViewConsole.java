package mvp.view;

import Code.Auteur;
import Code.Lecteur;
import mvp.presenter.AuteursPresenter;
import mvp.presenter.LecteurPresenter;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AuteurViewConsole implements AuteurViewInterface{
    private AuteursPresenter presenter;
    private List<Auteur> laut;
    private Scanner sc = new Scanner(System.in);

    public AuteurViewConsole() {

    }

    @Override
    public void setPresenter(AuteursPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Auteur> auteurs) {
        this.laut = auteurs;
        Utilitaire.affListe(laut);
        menu();
    }

    @Override
    public void affMsg(String msg) {
        System.out.println("information:" + msg);
    }

    public void menu() {
        List options = new ArrayList<>(Arrays.asList("ajouter", "retirer", "modifier", "fin"));
        do {
            int ch = Utilitaire.choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    modifier();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }

    private void modifier() {
        int choix = Utilitaire.choixElt(laut);
        Auteur auteur = laut.get(choix-1);

        System.out.println("Entrez le nouveau nom :");
        String nom = sc.nextLine();
        if (!nom.isEmpty()) {
            auteur.setNom(nom);
        }

        System.out.println("Entrez le nouveau prénom  :");
        String prenom = sc.nextLine();
        if (!prenom.isEmpty()) {
            auteur.setPrenom(prenom);
        }

        System.out.println("Entrez la nouvelle nationalité  :");
        String nationalite = sc.nextLine();
        if (!nationalite.isEmpty()) {
            auteur.setNationalite(nationalite);
        }

        Auteur nouveauAuteur = new Auteur(nom, prenom, nationalite);

        presenter.majAuteur(auteur,nouveauAuteur);

    }

    private void retirer() {
        int choix = Utilitaire.choixElt(laut);
        Auteur auteur = laut.get(choix-1);
        presenter.removeAuteurs(auteur);
    }


    private void ajouter() throws Exception {
        System.out.println("nom ");
        String nom;
        try {
                 nom = sc.nextLine();
        }catch (Exception e){
            System.out.println("Nom invalide!");
            return;
        }
        System.out.println("prénom ");
        String prenom;
        try {
            prenom = sc.nextLine();
        }catch (Exception e){
            System.out.println("Prenom invalide!");
            return;
        }
        System.out.println("nationalite ");
        String nationalite;
        try {
            nationalite = sc.nextLine();
        }catch (Exception e){
            System.out.println("Nationalite invalide");
            return;
        }
        Auteur auteur = new Auteur( nom, prenom,nationalite);
        presenter.addAuteurs(auteur);
    }
}
