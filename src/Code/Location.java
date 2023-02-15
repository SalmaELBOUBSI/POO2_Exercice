package Code;

import java.time.LocalDate;
import java.util.Objects;

public class Location {
    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    private Double amende;

    private Lecteur loueur;

    private Exemplaire exemplaire;

    public Location(Lecteur loueur, Exemplaire exemplaire) {
        this.loueur = loueur;
        this.exemplaire = exemplaire;
    }

    public Location(LocalDate dateLoc, LocalDate dateRestitution, Double amende, Lecteur loueur, Exemplaire exemplaire) {
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
        this.amende = amende;
        this.loueur = loueur;
        this.exemplaire = exemplaire;
    }

    public LocalDate getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(LocalDate dateLoc) {
        this.dateLoc = dateLoc;
    }

    public LocalDate getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(LocalDate dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public Double getAmende() {
        return amende;
    }

    public void setAmende(Double amende) {
        this.amende = amende;
    }

    public Lecteur getLoueur() {
        return loueur;
    }

    public void setLoueur(Lecteur loueur) {
        this.loueur = loueur;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(dateLoc, location.dateLoc) && Objects.equals(loueur, location.loueur) && Objects.equals(exemplaire, location.exemplaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateLoc, loueur, exemplaire);
    }

    @Override
    public String toString() {
        return "Location{" +
                "dateLoc=" + dateLoc +
                ", dateRestitution=" + dateRestitution +
                ", loueur=" + loueur +
                ", exemplaire=" + exemplaire +
                '}';
    }
}
