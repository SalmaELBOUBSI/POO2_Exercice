package Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Mail {
    private String objet;
    private String message;
    private String dateEnvoi;

    private String destinataire;

    private List<Exemplaire> exemplaires;

    public Mail(String objet, String message, String dateEnvoi) {
        this.objet = objet;
        this.message = message;
        this.dateEnvoi = dateEnvoi;
    }

    public Mail(String objet, String message, String dateEnvoi, String destinataire) {
        this.objet = objet;
        this.message = message;
        this.dateEnvoi = dateEnvoi;
        this.destinataire = destinataire;
    }


    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(String dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public void envoi() {
        String fileName = destinataire + ".txt";
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write("Objet : " + objet + "\n");
            writer.write("Date d'envoi : " + dateEnvoi + "\n");
            writer.write("Message : " + message);
            writer.close();
            System.out.println("Le fichier a été créé avec succès !");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de la création du fichier.");
            e.printStackTrace();
        }
    }

    public void envoyerMailLoueurs(String matricule) {
        // Trouver l'exemplaire correspondant au matricule
        Exemplaire exemplaire = null;
        for (Exemplaire e : exemplaires) {
            if (e.getMatricule().equals(matricule)) {
                exemplaire = e;
                break;
            }
        }
        if (exemplaire == null) {
            System.out.println("Aucun exemplaire correspondant au matricule " + matricule);
            return;
        }

}


    @Override
    public String toString() {
        return "Mail{" +
                "objet='" + objet + '\'' +
                ", message='" + message + '\'' +
                ", dateEnvoi='" + dateEnvoi + '\'' +
                ", destinataire='" + destinataire + '\'' +
                '}';
    }
}
