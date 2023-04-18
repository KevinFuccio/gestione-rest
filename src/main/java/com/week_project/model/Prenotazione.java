package com.week_project.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Prenotazione {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrenotazione;
    private LocalDate prenotazionePostazione;
    private LocalDate finePrenotazionePostazione;
    @ManyToOne
    private Postazione postazionePrenotata;
    @ManyToOne
    private Utente utente;
    
    
  
	public LocalDate getPrenotazionePostazione() {
		return prenotazionePostazione;
	
	}
	public void setPrenotazionePostazione(LocalDate prenotazionePostazione) {
		this.prenotazionePostazione = prenotazionePostazione;
	}
	public LocalDate getFinePrenotazionePostazione() {
		return finePrenotazionePostazione;
	}
	public void setFinePrenotazionePostazione(LocalDate finePrenotazionePostazione) {
		this.finePrenotazionePostazione = finePrenotazionePostazione;
	}
	public Postazione getPostazionePrenotata() {
		return postazionePrenotata;
	}
	public void setPostazionePrenotata(Postazione postazionePrenotata) {
		this.postazionePrenotata = postazionePrenotata;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Long getIdPrenotazione() {
		return idPrenotazione;
	}
	@Override
	public String toString() {
		return "Prenotazione [idPrenotazione=" + idPrenotazione + ", prenotazionePostazione=" + prenotazionePostazione
				+ ", finePrenotazionePostazione=" + finePrenotazionePostazione + ", postazionePrenotata="
				+ postazionePrenotata + ", utente=" + utente + "]";
	}
    
    
	
}
