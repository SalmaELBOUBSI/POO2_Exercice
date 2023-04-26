package mvp.view;

import Code.Rayon;
import mvp.presenter.RayonPresenter;
import utilitaires.Utilitaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RayonViewConsole implements RayonViewInterface {
    private RayonPresenter presenter;
    private List<Rayon> lray;
    private Scanner sc = new Scanner(System.in);

    public RayonViewConsole() {

    }

    @Override
    public void setPresenter(RayonPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Rayon> rayons) {
        this.lray = rayons;
        Utilitaire.affListe(lray);
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
        //TODO choisir elt et demander les nouvelles valeurs puis appeler méthode maj(lecteur) (à développer) du presenter
    }

    private void retirer() {
        int choix = Utilitaire.choixElt(lray);
        Rayon rayon = lray.get(choix-1);
        presenter.removeRayon(rayon);
    }


    private void ajouter() throws Exception {
        System.out.println("Code rayon ");
        String cr;
        try {
            cr = sc.nextLine();
        }catch (Exception e){
            System.out.println("Code du rayon invalide!");
            return;
        }
        System.out.println("Genre  ");
        String genre;
        try {
            genre = sc.nextLine();
        }catch (Exception e){
            System.out.println("Genre invalide!");
            return;
        }
        Rayon ray = new Rayon(cr,genre);
        presenter.addRayon(ray);
    }
}
