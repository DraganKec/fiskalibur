package org.fiskalibur.model;

public class KasaAndKomitent {

    private int id;
    private String brojKase;
    private String brojModula;
    private String adresaInstaliranja;
    private String nazivKomitenta;
    private String telefon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrojKase() {
        return brojKase;
    }

    public void setBrojKase(String brojKase) {
        this.brojKase = brojKase;
    }

    public String getBrojModula() {
        return brojModula;
    }

    public void setBrojModula(String brojModula) {
        this.brojModula = brojModula;
    }

    public String getAdresaInstaliranja() {
        return adresaInstaliranja;
    }

    public void setAdresaInstaliranja(String adresaInstaliranja) {
        this.adresaInstaliranja = adresaInstaliranja;
    }

    public String getNazivKomitenta() {
        return nazivKomitenta;
    }

    public void setNazivKomitenta(String nazivKomitenta) {
        this.nazivKomitenta = nazivKomitenta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
