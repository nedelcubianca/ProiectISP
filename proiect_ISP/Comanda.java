package proiect_ISP;

import java.util.Random;

public class Comanda {
    private int ID_comanda;
    private Echipament echipament;
    private int ID_client;
    private int Timp_utilizare;
    private float pret_final;

    public Comanda(Echipament echipament, int ID_client) {
        this.ID_comanda = new Random().nextInt(Integer.MAX_VALUE);
        this.echipament = echipament;
        this.ID_client = ID_client;
        this.Timp_utilizare = 0;
        this.pret_final = 0.0f;
    }
    
    public int plasare_comanda(Comanda comanda) {
        System.out.println("Comanda " + comanda.ID_comanda + " plasata cu succes.");
        return comanda.ID_comanda;
    }

    public void efectuare_plata(int Timp_utilizare, float pret_pe_min) {
        this.Timp_utilizare = Timp_utilizare;
        this.pret_final = Timp_utilizare * pret_pe_min;
        System.out.println("Plata efectuata: " + pret_final + " RON pentru " + Timp_utilizare + " minute.");
    }

    public int getID_comanda() { 
    	return ID_comanda; 
    	}

    public Echipament getEchipament() { 
    	return echipament; 
    	}
    public void setEchipament(Echipament echipament) { 
    	this.echipament = echipament; 
    	}

    public int getID_client() { 
    	return ID_client; 
    	}
    public void setID_client(int ID_client) { 
    	this.ID_client = ID_client; 
    	}

    public int getTimp_utilizare() { 
    	return Timp_utilizare; 
    	}
    public void setTimp_utilizare(int timp_utilizare) { 
    	this.Timp_utilizare = timp_utilizare; 
    	}

    public float getPret_final() { 
    	return pret_final; 
    	}
    
    public void setPret_final(float pret_final) { 
    	this.pret_final = pret_final; 
    	}

    @Override
    public String toString() {
        return "Comanda: ID=" + ID_comanda+ ", echipament=" + (echipament != null ? echipament.getID_echipament() : "null") + ", ID_client=" + ID_client + ", timp=" + Timp_utilizare + ", pret_final=" + pret_final + ".";
    }
}