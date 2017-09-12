package be.vdab;

import sun.security.provider.PolicySpiFile;

public class Werknemer extends be.vdab.Persoon{
    super(Persoon.getNaam, Persoon.getVoornaam, Persoon.getAdres);
    String functie;
    Double salaris;
    public static final Double MIN_SALARIS = 1000.00;
    protected static int count = 0;

    public Werknemer(String naam, String voornaam, Adres adres) {
        new Werknemer(String naam, String voornaam, Adres adres, "Algemeen bediende", 1800.00);
    }

    public Werknemer(String naam, String voornaam, Adres adres, String functie, Double salaris) {
        super(naam, voornaam, adres);
        setFunctie(functie);
        setSalaris(salaris);
        count++;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public Double getSalaris() {
        return salaris;
    }

    public void setSalaris(Double salaris) {
        this.salaris < MIN_SALARIS) ? MIN_SALARIS, salaris;
        }
    }

    public String getMIN_SALARIS() {
        return MIN_SALARIS;
    }

    public static int getCount() {
        return count;
    }
        
    @Override
    public String toString() {
        return  super.toString().persoon + "\n" +
                functie + "\n" +
                salaris,

    }
}
