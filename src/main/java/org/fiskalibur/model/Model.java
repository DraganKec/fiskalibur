package org.fiskalibur.model;

import java.util.Set;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "model")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "naziv_modela")
	private String nazivModela;

	private String opis;

	@OneToMany(mappedBy = "model", cascade = CascadeType.ALL)
	private Set<Kasa> kasa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazivModela() {
		return nazivModela;
	}

	public void setNazivModela(String nazivModela) {
		this.nazivModela = nazivModela;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set<Kasa> getKasa() {
		return kasa;
	}

	public void setKasa(Set<Kasa> kasa) {
		this.kasa = kasa;
	}

}
