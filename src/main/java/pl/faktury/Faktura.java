package pl.faktury;

public class Faktura {
    private String nrFaktury;
    private Sprzedawca sprzedawca;
    private Nabywca nabywca;
    private String dataSprzedazy;
    private String sposobZaplaty;
    private String terminPlatnosci;
    private Produkt[] produkty;

    public Faktura(String nrFaktury, Sprzedawca sprzedawca, Nabywca nabywca,
                   String dataSprzedazy, String sposobZaplaty, String terminPlatnosci, Produkt[] produkty) {
        this.nrFaktury = nrFaktury;
        this.sprzedawca = sprzedawca;
        this.nabywca = nabywca;
        this.dataSprzedazy = dataSprzedazy;
        this.sposobZaplaty = sposobZaplaty;
        this.terminPlatnosci = terminPlatnosci;
        this.produkty = produkty;
    }

    public String getNrFaktury() {
        return nrFaktury;
    }

    public Sprzedawca getSprzedawca() {
        return sprzedawca;
    }

    public Nabywca getNabywca() {
        return nabywca;
    }

    public String getDataSprzedazy() {
        return dataSprzedazy;
    }

    public String getSposobZaplaty() {
        return sposobZaplaty;
    }

    public String getTerminPlatnosci() {
        return terminPlatnosci;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }
}
