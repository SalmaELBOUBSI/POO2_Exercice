package utilitaires;

import Code.DVD;
import Code.Ouvrage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class DVDFactory extends OuvrageFactory{
    public Ouvrage addDetail(String titre, int ageMin, LocalDate dateParution, double prixLocation, String langue, String genre){
        System.out.println("code : ");
        long code= sc.nextLong();
        LocalTime dureeTotale=Utilitaire.lecTime();
        byte nbreBonus= sc.nextByte();
        DVD dvd =new DVD(titre,ageMin,dateParution,prixLocation,langue,genre,code,dureeTotale,nbreBonus);
        System.out.println("autres langues");
        Set<String> langues = new HashSet<>(Arrays.asList("anglais","français","italien","allemand","fin"));
        //List<String> langues = new ArrayList<>(Arrays.asList("anglais","français","italien","allemand","fin"));
        int choix;
        do{
            choix=Utilitaire.choixListe((List) langues);
            if(choix==langues.size())break;
            dvd.getAutresLangues().add(langues.get(choix-1));
            //TODO vérifier unicité ou utiliser set et pas de doublon avec langue d'origine

            do{
                if(choix==langues.size())break;
                String langueChoisie = langues.toArray(new String[langues.size()])[choix-1];
                if (langueChoisie.equals(langue)) {
                    System.out.println("La langue choisie est la même que la langue d'origine.");
                }
                if (!dvd.getAutresLangues().add(langueChoisie)) {
                    System.out.println("La langue choisie a déjà été ajoutée.");
                }
            }while(true);
        }while(true);
        System.out.println("sous-titres");
        return dvd;
    }
}
