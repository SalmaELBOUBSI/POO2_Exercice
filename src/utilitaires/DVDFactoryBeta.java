package utilitaires;

import Code.DVD;
import Code.Ouvrage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class DVDFactoryBeta {
    protected Scanner sc= new Scanner(System.in);
    public Ouvrage create() {

        System.out.println("titre");
        String titre= sc.nextLine();
        System.out.println("age minimum");
        int ageMin= sc.nextInt();
        sc.skip("\n");
        System.out.println("date de parution");
        LocalDate dp= Utilitaire.lecDate();
        System.out.println("prix de location");
        double ploc = sc.nextDouble();
        sc.skip("\n");
        System.out.println("langue");
        String langue=sc.nextLine();
        System.out.println("genre");
        String genre=sc.nextLine();

        //détails propres à la classe DVD
        System.out.println("code : ");
        long code= sc.nextLong();
        LocalTime dureeTotale=Utilitaire.lecTime();
        byte nbreBonus= sc.nextByte();
        DVD dvd =new DVD(titre,ageMin,dp,ploc,langue,genre,code,dureeTotale,nbreBonus);
        System.out.println("autres langues");
        Set<String> langues = new HashetSet<>();
        int choix;
        do{
            choix=Utilitaire.choixListe(new ArrayList<>(langues));
            if(choix==langues.size())break;
            String langue = new ArrayList<>(langues).get(choix - 1);//TODO vérifier unicité ou utiliser set et pas de doublon avec langue d'origine
            if (!dvd.getAutresLangues().contains(langue)) {
                dvd.getAutresLangues().add(langue);
            } else {
                System.out.println("Cette langue est déjà présente !");
            }
        }while(true);
        System.out.println("sous-titres");
        do{
            choix=Utilitaire.choixListe(langues);
            if(choix==langues.size())break;
            String sousTitre = langues.get(choix-1);
            if (!sousTitre.contains(sousTitre)) {
                sousTitre.add(sousTitre);
            } else {
                System.out.println("Ce sous-titre est déjà présent !");
            }//TODO vérifier unicité ou utiliser set
        }while(true);
        return dvd;
    }
}
