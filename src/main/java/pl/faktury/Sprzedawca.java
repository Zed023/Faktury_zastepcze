package pl.faktury;

public class Sprzedawca {
    private String nazwaFirmy;
    private Adres adres;
    private String nip;
    private String email;
    private String numerKonta;

    public Sprzedawca(String nazwaFirmy, Adres adres, String nip, String email, String numerKonta) {
        this.nazwaFirmy = nazwaFirmy;
        this.adres = adres;
        this.nip = nip;
        this.email = email;
        this.numerKonta = numerKonta;
    }
}
