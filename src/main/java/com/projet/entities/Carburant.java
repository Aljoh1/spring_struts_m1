package com.projet.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carburant implements Serializable {
	@Id
	private String reference;
	private String typeCarburant;
	private double prixUnitaire;
	private int quantite;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Carburant(String reference, String typeCarburant, double prixUnitaire, int quantite) {
		super();
		this.reference = reference;
		this.typeCarburant = typeCarburant;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}

	public Carburant() {
		super();
	}

}
