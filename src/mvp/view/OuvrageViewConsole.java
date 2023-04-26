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

    private void ajouter() throws Exception {
        System.out.println("Titre ");
        String titre;
        try {
            titre = sc.nextLine();
        }catch (Exception e){
            System.out.println("Titre invalide !");
            return;
        }
        System.out.println("age minimum ");
        int agemin;
        try {
            agemin = sc.nextInt();
        }catch (Exception e){
            System.out.println("Age invalide!");
            return;
        }
        System.out.println("date de parution ");
        System.out.println("date de naissance");
        LocalDate dp;
        try {
            String[] jma = sc.nextLine().split(" ");
            int j = Integer.parseInt(jma[0]);
            int m = Integer.parseInt(jma[1]);
            int a = Integer.parseInt(jma[2]);
            dp= LocalDate.of(a,m,j);
        }catch (Exception e){
            System.out.println("Date invalide!");
            return;
        }
        System.out.println("Type ");
        String type;
        try {
            type = sc.nextLine();
        }catch (Exception e){
            System.out.println("type invalide!");
            return;
        }
        System.out.println("Prix location ");
        double prixLoc;
        try {
                prixLoc = sc.nextDouble();
        }catch (Exception e){
            System.out.println("prix invalide");
            return;
        }
        System.out.println("Langue ");
        String langue;
        try {
            langue = sc.nextLine();
        }catch (Exception e){
            System.out.println("Language invalide");
            return;
        }
        System.out.println("Gentre ");
        String genre;
        try{
            genre = sc.nextLine();
        }catch (Exception e){
            System.out.println("Genre invalide");
            return;
        }
        Ouvrage ouvrage = new Ouvrage(titre,agemin,dp,type,prixLoc,langue,genre);
        presenter.addOuvrages(ouvrage);
    }

    private void modifier() {
        //TODO choisir elt et demander les nouvelles valeurs puis appeler méthode maj(lecteur) (à développer) du presenter
    }
}
