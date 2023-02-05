package Code;

import java.time.LocalDate;

public class Location {
    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    private Double amende;

    public Location(LocalDate dateLoc, LocalDate dateRestitution, Double amende) {
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
        this.amende = amende;
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
}
