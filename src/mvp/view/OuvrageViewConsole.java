package mvp.view;

import Code.Auteur;
import Code.Ouvrage;
import Code.TypeOuvrage;
import mvp.presenter.OuvragePresenter;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OuvrageViewConsole implements OuvrageViewInterface{
    private OuvragePresenter presenter;
    private List<Ouvrage> louv;
    private Scanner sc = new Scanner(System.in);

    public OuvrageViewConsole() {

    }

    @Override
    public void setPresenter(OuvragePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Ouvrage> ouvrages) {
        this.louv = ouvrages;
        Utilitaire.affListe(louv);
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

    private void retirer() {
        int choix = Utilitaire.choixElt(louv);
        Ouvrage ouvrage = louv.get(choix-1);
        presenter.removeOuvrages(ouvrage);
    }

    private void ajouter() {
        System.out.println("Titre ");
        String titre = sc.nextLine();
        System.out.println("age minimum ");
        int agemin = sc.nextInt();
        System.out.println("date de parution ");
        System.out.println("date de naissance");
        String[] jma = sc.nextLine().split(" ");
        int j = Integer.parseInt(jma[0]);
        int m = Integer.parseInt(jma[1]);
        int a = Integer.parseInt(jma[2]);
        LocalDate dp= LocalDate.of(a,m,j);
        System.out.println("Type ");
        String type = sc.nextLine();
        System.out.println("Prix location ");
        double prixLoc = sc.nextDouble();
        System.out.println("Langue ");
        String langue = sc.nextLine();
        System.out.println("Gentre ");
        String genre = sc.nextLine();
        Ouvrage ouvrage = new Ouvrage(titre,agemin,dp,type,prixLoc,langue,genre);
        presenter.addAuteurs(auteur);
    }

    private void modifier() {
        //TODO choisir elt et demander les nouvelles valeurs puis appeler méthode maj(lecteur) (à développer) du presenter
    }
}
