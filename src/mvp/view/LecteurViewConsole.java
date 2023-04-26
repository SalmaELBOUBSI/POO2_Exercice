package mvp.view;

import Code.Exemplaire;
import Code.Lecteur;
import mvp.presenter.LecteurPresenter;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static utilitaires.Utilitaire.*;

public class LecteurViewConsole implements LecteurViewInterface{
    private LecteurPresenter presenter;
    private List<Lecteur> llec;
    private Scanner sc = new Scanner(System.in);

    public LecteurViewConsole() {

    }

    @Override
    public void setPresenter(LecteurPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Lecteur> lecteurs) {
        this.llec = lecteurs;
        affListe(llec);
        menu();
    }

    @Override
    public void affMsg(String msg) {
        System.out.println("information:" + msg);
    }

    @Override
    public void affList(List<Exemplaire> lex) {
        affListe(lex);
    }

    public void menu() {
        List options = new ArrayList<>(Arrays.asList("ajouter", "retirer", "rechercher","modifier","special","fin"));
        do {
            int ch = choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    rechercher();
                    break;
                case 4:
                    modifier();
                    break;
                case 5:
                    special();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

    private void rechercher() {
        System.out.println("numLecteur : ");
        int idLecteur = sc.nextInt();
        presenter.search(idLecteur);
    }

    private void modifier() {
        int choix = choixElt(llec);
        Lecteur l = llec.get(choix-1);
        String nom = modifyIfNotBlank("nom",l.getNom());
        String prenom = modifyIfNotBlank("prénom",l.getPrenom());
        String date = modifyIfNotBlank("date de naissance",getDateFrench(l.getDn()));
        String[] jma = date.split(" ");
        int j = Integer.parseInt(jma[0]);
        int m = Integer.parseInt(jma[1]);
        int a = Integer.parseInt(jma[2]);
        LocalDate dn = LocalDate.of(a, m, j);
        String adr = modifyIfNotBlank("adresse",l.getAdresse());
        String mail= modifyIfNotBlank("mail",l.getMail());
        String tel =modifyIfNotBlank("tel",l.getTel());
        Lecteur lec = new Lecteur(l.getNumlecteur(), nom, prenom, dn, adr, mail, tel);
        presenter.update(lec);
        llec=presenter.getAll();//rafraichissement
        affListe(llec);
    }

    private void retirer() {
        int choix = choixElt(llec);
        Lecteur lecteur = llec.get(choix-1);
        presenter.removeLecteur(lecteur);
        llec=presenter.getAll();//rafraichissement
        affListe(llec);
    }


    private void ajouter() throws Exception {
        System.out.println("nom ");
        String nom;
        try {
                nom = sc.nextLine();
        }catch (Exception e){
            System.out.println("Entrée invalide pour le nom. Veuillez entrer une chaîne de caractères.");
            return;
        }
        System.out.println("prénom ");
        String prenom;
        try {
               prenom = sc.nextLine();
        }catch (Exception e){
            System.out.println("Entrée invalide pour le prénom. Veuillez entrer une chaîne de caractères.");
            return;
        }
        System.out.println("date de naissance");
        try {

        }catch (Exception e){
            System.out.println("Entrée invalide pour la date de naissance. Veuillez entrer une date au format jj mm aaaa.");
            return;
        }
        String[] jma = sc.nextLine().split(" ");
        int j = Integer.parseInt(jma[0]);
        int m = Integer.parseInt(jma[1]);
        int a = Integer.parseInt(jma[2]);
        LocalDate dn = LocalDate.of(a, m, j);

        System.out.println("adresse");
        String adr;
        try {
             adr = sc.nextLine();
        }catch (Exception e){
            System.out.println("Entrée invalide pour l'adresse. Veuillez entrer une chaîne de caractères.");
            return;
        }
        System.out.println("mail");
        String mail;
        try {
             mail = sc.nextLine();
        }catch (Exception e){
            System.out.println("Entrée invalide pour le mail. Veuillez entrer une chaîne de caractères.");
            return;
        }
        System.out.println("tel ");
        String tel;
        try {
            tel = sc.nextLine();
        }catch (Exception e){
            System.out.println("Entrée invalide pour le numéro de téléphone. Veuillez entrer une chaîne de caractères.");
            return;
        }
        Lecteur lec = new Lecteur(0, nom, prenom, dn, adr, mail, tel);
        presenter.addLecteur(lec);
        llec=presenter.getAll();//rafraichissement
        affListe(llec);
    }
    private void special() {
        int choix =  choixElt(llec);
        Lecteur lec = llec.get(choix-1);
        do {
            System.out.println("1.Exemplaire en location\n2.Exemplaires loués\n3.menu principal");
            System.out.println("choix : ");
            int ch = sc.nextInt();
            sc.skip("\n");
            switch (ch) {
                case 1:
                    presenter.exemplairesEnLocation(lec);
                    break;
                case 2:
                    presenter.exemplairesLoues(lec);
                    break;
                case 3: return;
                default:
                    System.out.println("choix invalide recommencez ");
            }
        } while (true);


    }
}
