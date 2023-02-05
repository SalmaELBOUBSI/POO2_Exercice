package Code;

import java.util.Objects;

public class Exemplaire {
    private Long matricule;
    private String descriptionEtat;

    public Exemplaire(Long matricule, String descriptionEtat) {
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public String getDescriptionEtat() {
        return descriptionEtat;
    }

    public void setDescriptionEtat(String descriptionEtat) {
        this.descriptionEtat = descriptionEtat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exemplaire that)) return false;
        return Objects.equals(matricule, that.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule);
    }
}

