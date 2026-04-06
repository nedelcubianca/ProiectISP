package proiect_ISP;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Administrator extends Utilizator {

    public Administrator(String nume, String prenume, int ID_client, String email, String parola) {
        super(nume, prenume, ID_client, email, parola, Tip_utilizator.Administrator_echipamente);
    }

    public void descarcare_raport(Catalog catalog) {
    	String numeFisier = System.getProperty("user.dir") + "/raport_echipamente.txt";
        
        try {
            java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File(numeFisier));
            writer.println("=== Raport Echipamente ===");
            writer.println("Administrator : " + nume + " " + prenume);
            writer.println("Data raport   : " + new java.util.Date());
            writer.println("Total         : " + catalog.echipamente.size() + " echipamente");
            writer.println("=".repeat(40));
            for (Echipament e : catalog.echipamente) {
                writer.println("ID echipament : " + e.getID_echipament());
                writer.println("Tip           : " + e.getTip_echipament());
                writer.println("Stare         : " + e.getStare());
                writer.println("Locatie       : " + e.getLocatie());
                writer.println("Pret/min      : " + e.getPret_pe_min());
                writer.println("-".repeat(40));
            }
            writer.close();
            System.out.println("Raport salvat in fisierul: " + numeFisier);
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Eroare la crearea fisierului: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Administrator: ID=" + ID_client + ", nume=" + nume + " " + prenume + ", email=" + email + ".";
    }
}