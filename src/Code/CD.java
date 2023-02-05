package Code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class CD extends Ouvrage {
    private long code;
    private byte nbrePlages;
    private LocalTime dureeTotal;

    public CD(String titre, byte ageMin, LocalDate dateParution, String typeOuvrage, Double prixLocation, String langue, String genre, long code, byte nbrePlages, LocalTime dureeTotal) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotal = dureeTotal;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public byte getNbrePlages() {
        return nbrePlages;
    }

    public void setNbrePlages(byte nbrePlages) {
        this.nbrePlages = nbrePlages;
    }

    public LocalTime getDureeTotal() {
        return dureeTotal;
    }

    public void setDureeTotal(LocalTime dureeTotal) {
        this.dureeTotal = dureeTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CD cd)) return false;
        return code == cd.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}

