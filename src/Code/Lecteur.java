package Code;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lecteur {
    private Long numLecteur;
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private String mail;
    private String adresse;
    private String tel;
    List<Exemplaire> exemplairesEnLocation = new ArrayList<>();
    List<Exemplaire> exemplairesLoues = new ArrayList<>();

    public Lecteur(Long numLecteur, String nom, String prenom, LocalDate dateNaiss, String mail, String adresse, String tel) {
        this.numLecteur = numLecteur;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
    }

    public Lecteur(Long numLecteur, String nom, String prenom, LocalDate dateNaiss, String mail, String adresse, String tel, List<Exemplaire> exemplairesEnLocation, List<Exemplaire> exemplairesLoues) {
        this.numLecteur = numLecteur;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
        this.exemplairesEnLocation = exemplairesEnLocation;
        this.exemplairesLoues = exemplairesLoues;
    }

    public Long getNumLecteur() {
        return numLecteur;
    }

    public void setNumLecteur(Long numLecteur) {
        this.numLecteur = numLecteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Exemplaire> getExemplairesEnLocation() {
        return exemplairesEnLocation;
    }

    public void setExemplairesEnLocation(List<Exemplaire> exemplairesEnLocation) {
        this.exemplairesEnLocation = exemplairesEnLocation;
    }

    public List<Exemplaire> getExemplairesLoues() {
        return exemplairesLoues;
    }

    public void setExemplairesLoues(List<Exemplaire> exemplairesLoues) {
        this.exemplairesLoues = exemplairesLoues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lecteur lecteur)) return false;
        return Objects.equals(numLecteur, lecteur.numLecteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numLecteur);
    }
}
