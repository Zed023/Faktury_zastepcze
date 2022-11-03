package pl.faktury;

public class Produkt {
    private String nazwaProduktu;
    private String jednostkaMiary;
    private int ilosc;
    private double cena;
    private double wartosc;
    private String vat;
    private double kwVat;
    private double wartoscBrutto;

    public Produkt(String nazwaProduktu, String jednostkaMiary, int ilosc, double cena, double wartosc,
                   String vat, double kwVat, double wartoscBrutto) {
        this.nazwaProduktu = nazwaProduktu;
        this.jednostkaMiary = jednostkaMiary;
        this.ilosc = ilosc;
        this.cena = cena;
        this.wartosc = wartosc;
        this.vat = vat;
        this.kwVat = kwVat;
        this.wartoscBrutto = wartoscBrutto;
    }
}
