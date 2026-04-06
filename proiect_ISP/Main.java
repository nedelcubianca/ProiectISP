package proiect_ISP;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nEchipamente");
        Echipament e1 = new Echipament(1, Tip_echipament.trotineta, 0.5f, Stare_echipament.functional, "Piata Unirii");
        Echipament e2 = new Echipament(2, Tip_echipament.bicicleta, 0.3f, Stare_echipament.defect, "Parcul Cismigiu");
        e1.afisare_stare();
        e2.afisare_stare();

        e2.actualizare_stare(Stare_echipament.functional);
        System.out.println("Dupa actualizare stare e2:");
        e2.afisare_stare();

        System.out.println("\nCatalog ");
        Catalog catalog = new Catalog();
        catalog.adauga_echipament(e1);
        catalog.adauga_echipament(e2);
        System.out.println(catalog.verifica_harta());


        System.out.println("Client ");
        Client client = new Client("Popescu", "Ion", 101,"ion.popescu@mail.ro", "parola123");
        System.out.println(client);
        System.out.println("Autentificare: " + client.autentificare());

        Cont cont = client.creare_cont("Ionescu", "Maria","maria@mail.ro", "pass456", Tip_utilizator.Client);
        System.out.println("Cont creat: " + cont);

        System.out.println("\n Comanda ");
        Comanda comanda = new Comanda(e1, client.getID_client());
        client.setComanda(comanda);

        int idComanda = comanda.plasare_comanda(comanda);
        System.out.println("ID comanda plasata: " + idComanda);

        comanda.efectuare_plata(30, e1.getPret_pe_min());
        System.out.println(comanda);

        System.out.println("\nAdministrator");
        Administrator admin = new Administrator("Dumitrescu", "Ana", 201,"ana.admin@mail.ro", "adminpass");
        System.out.println(admin);
        admin.descarcare_raport(catalog);
    }
}