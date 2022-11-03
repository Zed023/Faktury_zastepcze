package pl.faktury;

public class Nabywca {
    private String nazwaNabywcy;
    private Adres adres;
    private String nip;
    private String numerTelefonu;
    private String email;

    public Nabywca(String nazwaNabywcy, Adres adres, String nip, String numerTelefonu, String email) {
        this.nazwaNabywcy = nazwaNabywcy;
        this.adres = adres;
        this.nip = nip;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }
}
