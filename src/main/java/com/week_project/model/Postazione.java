package com.week_project.model;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private Stato_Postazione tipologia_postazione;
	private Integer numero_partecipanti;
	@ManyToOne
	private Edificio edificio;
	@OneToMany(mappedBy = "postazionePrenotata")
	private List<Prenotazione> prenotazioni;
	private boolean libero = true;
	
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Stato_Postazione getTipologia_postazione() {
		return tipologia_postazione;
	}
	public void setTipologia_postazione(Stato_Postazione tipologia_postazione) {
		this.tipologia_postazione = tipologia_postazione;
	}
	public Integer getNumero_partecipanti() {
		return numero_partecipanti;
	}
	public void setNumero_partecipanti(Integer numero_partecipanti) {
		this.numero_partecipanti = numero_partecipanti;
	}
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(List<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	public Long getId() {
		return id;
	}
	public boolean isLibero() {
		return libero;
	}
	public void setLibero(boolean libero) {
		this.libero = libero;
	}
	@Override
	public String toString() {
		return "Postazione [id=" + id + ", descrizione=" + descrizione + ", tipologia_postazione="
				+ tipologia_postazione + ", numero_partecipanti=" + numero_partecipanti + ", edificio=" + edificio
				+", libero=" + libero + "]";
	}
	
	
	
	
	
	
}
