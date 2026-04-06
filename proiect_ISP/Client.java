package proiect_ISP;

public class Client extends Utilizator {

    private Comanda comanda;

    public Client(String nume, String prenume, int ID_client, String email, String parola) {
        super(nume, prenume, ID_client, email, parola, Tip_utilizator.Client);
    }

    public Comanda getComanda() { 
    	return comanda; 
    	}

    public void setComanda(Comanda comanda) { 
    	this.comanda = comanda; 
    	}

    @Override
    public String toString() {
        return "Client: ID=" + ID_client + ", nume=" + nume  + " " + prenume + ", email=" + email + ".";
    }
}