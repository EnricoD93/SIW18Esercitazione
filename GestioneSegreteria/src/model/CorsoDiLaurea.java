package model;

import java.util.HashSet;
import java.util.Set;

public class CorsoDiLaurea {
	private Long codice;
	private String nome;
	private Set<Corso> corsi;
	private Dipartimento dipartimento;

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public CorsoDiLaurea() {
	}

	public CorsoDiLaurea(String nome) {
		this.nome = nome;
	}

	public Long getCodice() {
		return codice;
	}

	public void addCorso(Corso c) {
		if (corsi == null) {
			corsi = new HashSet<Corso>();
		}
		corsi.add(c);
	}

	public Set<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(Set<Corso> corsi) {
		this.corsi = corsi;
	}

	public String getNome() {
		return nome;
	}

	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
