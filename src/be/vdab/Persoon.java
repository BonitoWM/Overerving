package be.vdab;

public class Persoon {
    private String naam;
    private String voornaam;
    private Adres adres;

    public Persoon(String naam, String voornaam, String straat, String nummer, int postcode, String gemeente) {
        Adres adres = new Adres(straat, nummer, postcode, gemeente);
        new Persoon(naam, voornaam, adres);
    }

    public Persoon(String naam, String voornaam, Adres adres) {
        setNaam(naam);
        setVoornaam(voornaam);
        setAdres(adres);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String voegVoornamenToe(String ... voornamen) {
        StringBuffer voornaam = "";

        for (String s : voornamen)
            voornaam = voornaam.append(" ").append(s);

        return voornaam.toString();
    }

    @Override
    public String toString() {
        return  voornaam + " " + naam + "\n" +
                Adres.getStraat() + " " + Adres.getNummer() + "\n" +
                Adres.getPostcode() + " " + Adres.getGemeente();
    }
}
