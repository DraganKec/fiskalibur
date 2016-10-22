package org.fiskalibur.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "kasa")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Kasa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "broj_kase")
    private String brojKase;

    @ManyToOne
    @JoinColumn(name = "komitent_id")
    private Komitent komitent;

    @Column(name = "broj_modula")
    private String brojModula;

    @Column(name = "broj_terminala")
    private String brojTerminala;

    @Column(name = "sim_kartica")
    private String simKartica;

    private int pin;

    private String telefon;

    @Column(name = "adresa_instaliranja")
    private String adresaInstaliranja;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    private boolean defiskalicacija;

    @Column(name = "datum_defiskalizacije")
    private String datumDefiskalizacije;

    @OneToMany(mappedBy = "kasa", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Servis> servis;

    @Column(name = "datum_fiskalizacije")
    private String datumFiskalizacije;

    private String napomena;

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

    public Komitent getKomitent() {
        return komitent;
    }

    public void setKomitent(Komitent komitent) {
        this.komitent = komitent;
    }

    public String getBrojModula() {
        return brojModula;
    }

    public void setBrojModula(String brojModula) {
        this.brojModula = brojModula;
    }

    public String getBrojTerminala() {
        return brojTerminala;
    }

    public void setBrojTerminala(String brojTerminala) {
        this.brojTerminala = brojTerminala;
    }

    public String getSimKartica() {
        return simKartica;
    }

    public void setSimKartica(String simKartica) {
        this.simKartica = simKartica;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresaInstaliranja() {
        return adresaInstaliranja;
    }

    public void setAdresaInstaliranja(String adresaInstaliranja) {
        this.adresaInstaliranja = adresaInstaliranja;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public boolean isDefiskalicacija() {
        return defiskalicacija;
    }

    public void setDefiskalicacija(boolean defiskalicacija) {
        this.defiskalicacija = defiskalicacija;
    }

    public String getDatumDefiskalizacije() {
        return datumDefiskalizacije;
    }

    public void setDatumDefiskalizacije(String datumDefiskalizacije) {
        this.datumDefiskalizacije = datumDefiskalizacije;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public Set<Servis> getServis() {
        return servis;
    }

    public void setServis(Set<Servis> servis) {
        this.servis = servis;
    }

    public String getDatumFiskalizacije() {
        return datumFiskalizacije;
    }

    public void setDatumFiskalizacije(String datumFiskalizacije) {
        this.datumFiskalizacije = datumFiskalizacije;
    }
}
