package pl.faktury;

public class Main {
    public static void main(String[] args) {
        Adres adres1 = new Adres("Skoczna 13", "Plock", "31-240");
        Adres adres2 = new Adres("Mickiewicza 14", "Gora", "56-200");
        Sprzedawca xkom = new Sprzedawca("xkom", adres1, "9492107026",
                "xkom@pop.pl", "560213012031203012");
        Nabywca adam = new Nabywca("Adam Zeid", adres2, " ",
                "adam@pop.pl", "560213012031203012");
        Produkt produkt = new Produkt("kal", "kg", 3, 102.99, 85.87, "23%", 12.88, 304.76);
        Produkt[] produkty = {produkt};
        Faktura faktura = new Faktura("696969696", xkom, adam, "19-02-2021", "karta",
                "18-02-2021", produkty);
        System.out.println(faktura);
    }
}