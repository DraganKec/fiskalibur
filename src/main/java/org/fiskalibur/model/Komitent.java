package org.fiskalibur.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "komitent")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Komitent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "naziv_komitenta")
    private String nazivKomitenta;

    private String telefon;

    private String adresa;

    @Column(name = "broj_ugovora")
    private String brojUgovora;

    private String jib;

    private String pib;

    private String napomena;

    @OneToMany(mappedBy = "komitent", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Kasa> kasa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public String getJib() {
        return jib;
    }

    public void setJib(String jib) {
        this.jib = jib;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public Set<Kasa> getKasa() {
        return kasa;
    }

    public void setKasa(Set<Kasa> kasa) {
        this.kasa = kasa;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
}
